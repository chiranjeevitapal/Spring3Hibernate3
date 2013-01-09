<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="taglibs.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Spring3Example</title>

</head>

<body>

	<h3>Registration Form</h3>
	
	<c:url var="signUpUrl" value="/register/signup.html" />
	<c:url var="loginUrl" value="/login.html" />
	<form:form modelAttribute="register" method="POST" action="${signUpUrl}">
		<table>
			
			<tr>
				<td>Login ID:<FONT color="red"><form:errors path="loginid" />
				</FONT>
				</td>
				<td><form:input path="loginid" />
				</td>
			</tr>
			
			<tr>
				<td>Password:<FONT color="red"><form:errors path="password" />
				</FONT>
				</td>
				<td><form:password path="password" />
				</td>
			</tr>
			
			<tr>
				<td>Email:<FONT color="red"><form:errors path="email" />
				</FONT>
				</td>
				<td><form:input path="email" />
				</td>
			</tr>
			
			<tr>
				<td>Address:<FONT color="red"><form:errors path="address" />
				</FONT>
				</td>
				<td><form:input path="address" />
				</td>
			</tr>
			
			<tr>
				<td>Phone:<FONT color="red"><form:errors path="phone" />
				</FONT>
				</td>
				<td><form:input path="phone" />
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Sign Up" />
				</td>
			</tr>
			
			<tr>
				<td>
					Already a member? <a href="${loginUrl}">Login</a>
				</td>
			</tr>
		</table>

	</form:form>

</body>

</html>