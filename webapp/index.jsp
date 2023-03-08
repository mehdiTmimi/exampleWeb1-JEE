<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getAttribute("message")==null?"":request.getAttribute("message") %>
	<form method="post" action="somme">
		<input name="nbr1">
		<input name="nbr2">
		<button type="submit">calculate</button>
	</form>
</body>
</html>