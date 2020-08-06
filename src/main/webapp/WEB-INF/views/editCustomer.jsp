<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib   uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>     
<%@taglib   uri="http://www.springframework.org/tags/form"  prefix="form" %>     


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<title>Insert title here</title>
</head>
<body>


<div class="container">
<form:form   modelAttribute="customer" action="${pageContext.servletContext.contextPath}/spring/update" method="post">

<table>
<tr>
<td> <form:label path="customerId"> Customer Id </form:label>    </td>
<td> <form:input path="customerId"/>    </td>
</tr>


<tr>
<td> <form:label path="firstName"> First Name </form:label>    </td>
<td> <form:input path="firstName"/>    </td>
</tr>


<tr>
<td> <form:label path="lastName"> Last Name </form:label>    </td>
<td> <form:input path="lastName"/>    </td>
</tr>

<tr>
<td> <form:label path="gender"> Gender </form:label>    </td>
<td> <form:input path="gender"/>    </td>
</tr>

<tr>
<td> <form:label path="email"> Email </form:label>    </td>
<td> <form:input path="email"/>    </td>
</tr>



<tr>
<td> <form:label path="address"> Address </form:label>    </td>
<td> <form:input path="address"/>    </td>
</tr>

<tr>
<td> <form:label path="city"> City </form:label>    </td>
<td> <form:input path="city"/>    </td>
</tr>

<tr>
<td> <form:label path="state"> State </form:label>    </td>
<td> <form:input path="state"/>    </td>
</tr>


<tr>
<td>  <input type="submit" value="Update Customer" class="btn btn-primary"> </td>
</tr>




</table>



</form:form>


</div>















<div class="container">

<div align="right">
<a  href="${pageContext.servletContext.contextPath}/spring/new"> <input type="button"  class="btn btn-primary" value="ADD CUSTOMER">  </a>  
</div>


<table class="table table-hover table-striped table-responsive">
<thead>
<tr>
<th>CUSTOMER ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>GENDER</th>
<th>EMAIL</th>
<th>ADDRESS</th>
<th>CITY</th>
<th>STATE</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
</thead>
<tbody>
<c:forEach  items="${customers}"  var="c">
<tr>
<td> ${c.customerId}</td>
<td>${c.firstName}</td>
<td>${c.lastName}</td>
<td>${c.gender}</td>
<td>${c.email}</td>
<td>${c.address}</td>
<td>${c.city}</td>
<td>${c.state}</td>
<td><a  href="${pageContext.servletContext.contextPath}/spring/edit?customerId=${c.customerId}"> <input type="button"  class="btn btn-info" value="EDIT">  </a>  </td>
<td><a   href="${pageContext.servletContext.contextPath}/spring/delete/${c.customerId}"> <input type="button" class="btn btn-danger" value="DELETE">  </a>  </td>
</tr>
</c:forEach>

</tbody>


</table>

</div>

</body>
</html>