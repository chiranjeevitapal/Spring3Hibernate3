<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@include file="taglibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Spring3Example</title>
<link href="../css/fields.css" rel="stylesheet" type="text/css" />
</head>

<body>
	
	<%if(session.getAttribute("errorMsg")!=null && session.getAttribute("errorMsg")!="") {%>
	<b><FONT color="red">Authentication Failed. Please verify your Login ID and Password !!</FONT></b>
	<%session.removeAttribute("errorMsg"); 
	} %>
 <h2>Login</h2>
	<form:form modelAttribute="login" method="POST" >
		<table>
			
			<tr>
				<td><label for="loginid">Login ID:</label><FONT color="red"><form:errors path="loginid" />
				</FONT>
				</td>
				<td><form:input path="loginid" />
				</td>
			</tr>
			
			<tr>
				<td><label for="password">Password:</label><FONT color="red"><form:errors path="password" />
				</FONT>
				</td>
				<td><form:password path="password" />
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Login" />
				</td>
			</tr>
			
			<tr>
				<td>
					<a href="register.html">Register</a>
				</td>
			</tr>
		</table>

	</form:form>
</body>

</html>