<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script>
	window.onload = function() {
		var btnObj = document.querySelector('button');
		btnObj.onclick = function() {
			location.href = "/uri/main";
		}
	}
</script>
<body>
	로그인완료.
	<br> ${emp}
	<button>페이지 이동</button>
</body>
</html>