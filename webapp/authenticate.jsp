<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ page isELIgnored="false" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <h1> Location is : ${cookie.address.value }</h1>
 --%>
<h1>Authentication procedure will go here....</h1>
<%
	String un = request.getParameter("username");
	String password = request.getParameter("password");
	
	if(un.equals("admin")&& password.equals("admin")){
	%>	
	<jsp:forward page = "welcome.jsp"></jsp:forward>
	
	<% }else{%>
		<div style = "color:red" >invalid username/password</div>
		<jsp:include page="login.jsp"></jsp:include>
	<%}
%>

</body>
</html>