<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib   uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>     
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

<h3>Welcome to shopping page</h3>


<div class="container">


<table class="table table-hover table-striped table-responsive">
<thead>
<tr>
<th>Item ID</th>
<th>Count</th>
</tr>
</thead>
<tbody>
<c:forEach  items="${cartItemsList}"  var="c">
<tr>
<td> ${c.itemId}</td>
<td>${c.count}</td>
</tr>
</c:forEach>

</tbody>


</table>

</div>


</body>
</html>