<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="ogloszenia.repository.*,java.util.List,ogloszenia.model.*"%>

<c:set var="categoryList" value="${CategoryRepository.findAll()}" />

<c:forEach items="${categoryList}" var="categoryDTO">
	<div class="col-md-3">
		<span class="category-item fa ${categoryDTO.iconName}"> <a
			href="products.jsp?category=${categoryDTO.category}">
				${categoryDTO.name}</a>
		</span>
	</div>
</c:forEach>