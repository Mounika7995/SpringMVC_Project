<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<body>
		<form:form method="POST" action="/feujiCompany/company1"
			modelAttribute="feuji" >
			<div>
			<table>
				<tr>
					<td>Company_Name :</td>
					<td><form:input type="text" path="company_Name"/></td>
				</tr>
				<tr>
					<td>NumberOfEmp :</td>
					<td><form:input type="text" path="NumberOfEmp" /></td>
				</tr>
				<tr>
					<td>Location :</td>
					<td><form:input type="text" path="location" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="save" /></td>
				</tr>
			</table>
			</div>
		</form:form>
	
</body>
</head>
</html>