
<%@page import="java.sql.Date" %>
<%-- <%@page errorPage="Error.jsp" %>
 --%>
<html>
<body>
<h2>Hello World!</h2>

<form action = "process.jsp">
	Username: <input type = "text" name = "username"><br>
	<input type="submit" value ="submit">
</form>
<%! 
// code goes outside _jspService() as written in Declaration Tag
	public int add(){
	return 10+20;
}
%>

<%

// can add any java code in this...
int a= 10;
String name = "Aditi";
System.out.println("Hi !"  + name);
//System.out.print(new Util().add());
System.out.println(10/0);

%>

</body>
</html>
