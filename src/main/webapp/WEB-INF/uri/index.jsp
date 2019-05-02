<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>로그인 화면</title>
<!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/signin.css" rel="stylesheet">
</head>

<script>	
	function goEmpInsertPage(){
		location.href = '/uri/emp/insert';

	}
</script>
<body class="text-center">
	<div class="text-container">
		${emp.ENAME}님 환영합니다.
		<c:if test="${emp.LVL==2}">
			사장님. 사원리스트입니다.
			<table class="table">
				<tr>
					<th>사번</th>
					<th>이름</th>
					<th>ID</th>
					<th>PWD</th>
					<th>커미션</th>
				</tr>
				<c:forEach items="${empList}" var="e">
					<tr>
						<td>${e.EMPNO}</td>
						<td>${e.ENAME}</td>
						<td>${e.ID}</td>
						<td>${e.PWD}</td>
						<td>${e.COMM}</td>
					</tr>
				</c:forEach>
			</table>
					<button onclick="goEmpInsertPage()">사원등록</button>
		</c:if>

	</div>
</body>
</html>
