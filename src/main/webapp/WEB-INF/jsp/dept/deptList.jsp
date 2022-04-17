<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
			<th colspan="3">부서이름 수정/삭제</th>
		</tr>
		<c:forEach var="result" items="${resultList}" varStatus="status">
			<tr>
				<td>${result.deptno}</td>
				<td>${result.deptname}</td>
				<td>${result.loc}</td>
				
				<td>
					<form name="fum" method="post" action="deptUpdate.do">
						<input type="text" name="deptno" value="${result.deptno}" style="display:none">
						<input type="text" name="deptname">
						<button type="submit">수정</button>
					</form>
				</td>
				<td>
					<button type="submit" onclick="location='deptDelete.do?deptno=${result.deptno}'">삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>