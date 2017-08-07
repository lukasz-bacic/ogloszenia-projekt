<%@ page language="java" contentType="text/html; harset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="ogloszenia.repository.*,java.util.List,ogloszenia.model.*,java.util.Optional"%>

<!DOCTYPE html>

<head>
<title>Serwis z ogloszeniami</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="function.js"></script>
</head>

<body>

	<div class="container header">
		<c:import url="top-menu.jsp"></c:import>
	</div>


	<div class="container">
		<div>
			<form action="/search" method="post">
				<div class="form-group row col-md-5">
					<input type="text" placeholder="wpisz nazwę" name="phrase"
						class="form-control" />
				</div>
				<div class="form-group row col-md-5">
					<input type="text" placeholder="wpisz miejscowość" name="location"
						class="form-control" />
				</div>
				<div class="form-group row col-md-2">
					<button type="submit" class="btn btn-classic">szukaj</button>
				</div>
			</form>
		</div>
	</div>


	<div class="container category">
		<c:import url="category.jsp" />
	</div>

	<div class="container ad">
		<div class="media panel">

			<div class="media-left media-middle">
				<a href="#"> <img class="media-object small-object"
					src="http://blog.caranddriver.com/wp-content/uploads/2016/11/Ford-Mustang-Shelby-GT350-lead.jpg"
					alt="brak zdjeci">
				</a>
			</div>
			<div class="media-body">
				<h4 class="media-heading">Middle aligned media</h4>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi, hic
				fugiat id illo quod porro quam corporis sint quidem blanditiis quo
				quas reprehenderit officia! Quibusdam magni ipsa voluptas ullam
				molestiae.
				<h3 class="price">50.000 zÅ</h3>
			</div>
		</div>

		<div class="media panel">

			<div class="media-left media-middle">
				<a href="#"> <img class="media-object small-object"
					src="http://blog.caranddriver.com/wp-content/uploads/2016/11/Ford-Mustang-Shelby-GT350-lead.jpg"
					alt="brak zdjeci">
				</a>
			</div>
			<div class="media-body">
				<h4 class="media-heading">Middle aligned media</h4>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi, hic
				fugiat id illo quod porro quam corporis sint quidem blanditiis quo
				quas reprehenderit officia! Quibusdam magni ipsa voluptas ullam
				molestiae.
				<h3 class="price">50.000 zÅ</h3>
			</div>
		</div>
		<div class="media panel">

			<div class="media-left media-middle">
				<a href="#"> <img class="media-object small-object"
					src="http://blog.caranddriver.com/wp-content/uploads/2016/11/Ford-Mustang-Shelby-GT350-lead.jpg"
					alt="brak zdjeci">
				</a>
			</div>
			<div class="media-body">
				<h4 class="media-heading">Middle aligned media</h4>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi, hic
				fugiat id illo quod porro quam corporis sint quidem blanditiis quo
				quas reprehenderit officia! Quibusdam magni ipsa voluptas ullam
				molestiae.
				<h3 class="price">50.000 zÅ</h3>
			</div>
		</div>









	</div>

	<footer>
		<div class="container footer form-inline">
			<div class="col-md-3">
				<a href="#">Strona gÅÃ³wna</a>
			</div>
			<div class="col-md-3">
				<a href="#">Profil</a>
			</div>
			<div class="col-md-3">
				<a href="#">Aukcje</a>
			</div>
			<div class="col-md-3">
				<a href="#">Kontakt</a>
			</div>
		</div>
	</footer>

</body>
