<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Maven + Spring mvc + Bootstrap</title>

<spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss"></spring:url>
<link href="${bootstrapCss}" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Spring Mvc List Example</a>
	</div>
  </div>
</nav>


<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
	<p>
		<c:if test="${not empty msg}">
			Hello ${msg}
		</c:if>

		<c:if test="${empty msg}">
			Welcome ThinkingInGIS!
		</c:if>
    </p>
    <p>
		<c:if test="${not empty list }">
			<ul>
				<c:forEach var="list" items="${list }">
					<li>${list}</li>
				</c:forEach>
			</ul>
		</c:if>
	</p>
	</div>
</div>

<div class="container">

  <div class="row">
	<div class="col-md-4">
		<h2>Maps</h2>
		<p>Maps</p>
	</div>
	
	<div class="col-md-4">
		<h2>Can</h2>
		<p>Can</p>
	</div>
	
	<div class="col-md-4">
		<h2>Talk.</h2>
		<p>Talk.</p>
	</div>
  </div>


  <hr>
  <footer>
	<p>© ThinkingInGIS 2016</p>
  </footer>
</div>

<spring:url value="/resources/core/js/jquery.js" var="jquery" />
<spring:url value="/resources/core/js/bootstrap.js" var="bootstrapJs" />

<script src="${jquery}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>