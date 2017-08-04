<%@ page language="java" contentType="text/html; harset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="ogloszenia.repository.*,java.util.List,ogloszenia.model.*,java.util.Optional"%>
<div class="logo col-md-2">
	<img
		src="https://securet9.classistatic.com/assets/images/pl_PL/logo-11309c4e19.png" />
</div>
<div class="col-md-6"></div>
<div class="col-md-4 menu">
	<div>
		Login:
		<c:if test="${! empty  nick}">
				${nick}
				</c:if>
		<c:if test="${empty nick}">
			<a href="login.html">Zaloguj się</a>
		</c:if>
	</div>
</div>

<div class="dropdown">
	<button onclick="myFunction()" class="dropbtn">Menu</button>
	<div id="myDropdown" class="dropdown-content">
		<a href="dodawanie-ogloszenia.html">Dodaj ogloszenie</a>
	</div>
</div>