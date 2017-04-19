<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="vision.test" method="post" enctype="multipart/form-data">
		<input type="file" name="file"> 
		<select name="rcode">
			<c:forEach items="${region}" var="r">
				<option value="${r.rcode}">${r.rname}</option>
			</c:forEach>
		</select>
		<input type="submit" value="검색">
	</form>
	<table border="1" style="margin-top:50px;">
		<tr>
			<td>상점코드</td>
			<td>사업자번호</td>
			<td>지역코드</td>
			<td>유저아이디</td>
			<td>영업시간</td>
			<td>상점명</td>
			<td>캡쳐 수</td>
			<td>등록된텍스트</td>
			<td>등록된컬러</td>
		</tr>
		<c:forEach items="${storeAll}" var="store">
			<tr>
				<td><a href="http://localhost:8081/vision/vision.infoInput?store_code=${store.store_code}">${store.store_code}</a></td>
				<td>${store.business_code}</td>
				<td>${store.rcode}</td>
				<td>${store.userid}</td>
				<td>${store.operating_time}</td>
				<td>${store.store_name}</td>
				<td>${store.view_count}</td>
				<td><a href="http://localhost:8081/vision/vision.getStoreText?store_code=${store.store_code}">${store.store_text}</a></td>
				<td><a href="http://localhost:8081/vision/vision.getStoreColor?store_code=${store.store_code}">${store.store_color}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>