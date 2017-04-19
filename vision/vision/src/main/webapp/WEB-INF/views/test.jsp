<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
* {
	text-align: center;
	margin-left: auto;
	margin-right: auto;
}

div {
	border: 1px black solid;
	width: 50%;
	margin-top: 40px;
}
</style>
</head>
<body>
	<div>
		<img src="C:\test\1.jpg" alt="${img}">
	</div>
	<div>
		<h1>텍스트 결과</h1>
		<c:forEach items="${text}" var="str">
			<h4>${str}</h4>
		</c:forEach>
	</div>

	<div>
		<h1>라벨 결과</h1>
		<c:forEach items="${label}" var="list">
			<h4>${list}</h4>
		</c:forEach>
	</div>

	<div>
		<h1>색상결과</h1>

		<h4>빨강 : ${color.red}</h4>
		<h4>파랑 : ${color.blue}</h4>
		<h4>초록 : ${color.green}</h4>
	</div>

</body>
</html>