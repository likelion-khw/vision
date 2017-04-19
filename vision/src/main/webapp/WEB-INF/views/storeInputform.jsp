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


	<form action="vision.storeInput" method="post">
		<p>
			사업자번호 : <input type="text" name="business_code">
		</p>
		<p>
			지역 : <select name="rcode">
				<c:forEach items="${region}" var="r">
					<option value="${r.rcode}">${r.rname}</option>
				</c:forEach>
			</select>
		</p>
		<p>
			유저아이디 : <input type="text" name="userid">
		</p>
		<p>
			영업시간 : <input type="text" name="operating_time">
		</p>
		<p>
			상가명 : <input type="text" name="store_name">
		</p>
		
		<input type="submit" value="전송">
	</form>

</body>
</html>