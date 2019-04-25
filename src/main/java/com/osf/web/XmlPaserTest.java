package com.osf.web;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

interface ApplicationContext<T> {
	void setBean(String id, T bean);

	T getBean(String id);
}

class ClassPathXmlApplicationContext<T> implements ApplicationContext<T> {
	private Map<String, T> beanMap = new HashMap<String, T>();

	@Override
	public void setBean(String id, T bean) {
		beanMap.put(id, bean);
	}

	@Override
	public T getBean(String id) {
		return beanMap.get(id);
	}

}

public class XmlPaserTest {
	private static ApplicationContext ac = new ClassPathXmlApplicationContext();
	static {
		load();
	}

	public static void load() {
		String path = "D:\\study\\works\\gits\\osf-spweb\\src\\main\\resources\\spring\\application-config.xml";
		File f = new File(path);
		DocumentBuilderFactory dBuildFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dBuildFactory.newDocumentBuilder();
			Document document = dBuilder.parse(f);
			Element root = document.getDocumentElement();
			System.out.println(root.getAttribute("xsi:schemaLocation"));
			NodeList nodes = root.getElementsByTagName("bean");
			for (int i = 0; i < nodes.getLength(); i++) {
				Element bean = (Element) nodes.item(i);
				String id = bean.getAttribute("id");
				String className = bean.getAttribute("class");
				if ("ds".equals(id)) {
					Class<?> clazz = Class.forName(className);
					Method[] methods = clazz.getDeclaredMethods();
					Object obj = clazz.newInstance();
					NodeList props = bean.getElementsByTagName("property");
					for (int j = 0; j < props.getLength(); j++) {
						Element prop = (Element) props.item(j);
						String methodName = prop.getAttribute("name");
						String value = prop.getAttribute("value");
						String fStr = methodName.substring(0, 1);
						methodName = "set" + fStr.toUpperCase() + methodName.substring(1);
						for (Method method : methods) {
							if (methodName.equals(method.getName())) {
								method.invoke(obj, value);
							}
						}
					}
					ac.setBean(id, obj);
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DataSource ds = (DataSource) ac.getBean("ds");
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
