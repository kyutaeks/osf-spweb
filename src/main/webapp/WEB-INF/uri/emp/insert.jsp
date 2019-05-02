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
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/signin.css" rel="stylesheet">
</head>
<body class="text-center">
	<form class="form-insert" action="/emp/insert" method="post">
		<img class="mb-4" src="/resources/bootstrap-solid.svg" alt="" width="72" height="72">
		<h1 class="h3 mb-3 font-weight-normal">-Insert-</h1>
		<label for="num" class="sr-only">사번</label> 
		<input type="text" id="num" class="form-control" placeholder="사번" required autofocus name='num'><br>
		<label for="ID" class="sr-only">ID</label> 
		<input type="text" id="id" class="form-control" placeholder="ID" required name='ID'><br>
		<label for="PWD" class="sr-only">PWD</label> 
		<input type="password" id="id" class="form-control" placeholder="PASSWORD" required name='PASSWORD'><br>
		<label for="JOB" class="sr-only">JOB</label>
			<!-- <select name="job" class="sr-only">
						<option value="">직업선택</option>
						<option value="사장">사장</option>
						<option value="부장">부장</option>
						<option value="차장">차장</option>
						<option value="과장">과장</option>
						<option value="대리">대리</option>
						<option value="사원">사원</option>
			</select>  -->
		
		
		
		<label for="hiredate" class="sr-only">hiredate</label> 
		<input type="date" id="hiredate" class="form-control" placeholder="hiredate" required name='hiredate'><br>
		<label for="id" class="sr-only">ID</label> 
		<input type="password" id="id" class="form-control" placeholder="ID" required name='ID'><br>

		<!-- <table border="1">

			<tr>
				<th>사번 :</th>
				<td><input type="text" id="num" class="form-control"
					placeholder="사번을입력하세요." required autofocus name='num'></td>
			</tr>
			<tr>
				<th>이름 :</th>
				<td><input type="text" id="num" class="form-control"
					placeholder="이름" required name='name'></td>
			</tr>

			<tr>
				<th>JOB :</th>
				<td><select name="job">
						<option value="">직업선택</option>
						<option value="사장">사장</option>
						<option value="부장">부장</option>
						<option value="차장">차장</option>
						<option value="과장">과장</option>
						<option value="대리">대리</option>
						<option value="사원">사원</option>
				</select></td>
			</tr>

			<tr>
				<th>ID :</th>
				<td><input type="text" id="num" class="form-control"
					placeholder="ID" required name='id'></td>
			</tr>
			<tr>
				<th>PWD :</th>
				<td><input type="password" id="num" class="form-control"
					placeholder="PWD" required name='pwd'></td>
			</tr>
			

			
		</table> -->
		<select name="deptNo" id="deptNo">
			<c:forEach items="${deptList}" var="dept">
				<option value="${dept.DEPTNO}">${dept.DNAME}</option>
			</c:forEach>
		</select>
		<br>
		<br>
		<br>
		<button class="btn btn-lg btn-primary btn-block" type="button"
			id="signinBtn">사원 등록</button>
		<p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
	</form>
</body>
</html>