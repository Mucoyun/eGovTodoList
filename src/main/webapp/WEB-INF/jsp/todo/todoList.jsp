<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>투두리스트</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-light bg-light">
			<form class="container-fluid" name="todoInsertForm" method="get">
				<div class="input-group">
					<span class="input-group-text" id="basic-addon1">@</span>
					<input type="text" class="form-control" placeholder="What your To-Do List !" aria-label="Username" aria-describedby="basic-addon1">
					<button class="btn btn-dark" type="submit">OK</button>
				</div>
			</form>
		</nav>
		
		<div class="row row-cols-1 row-cols-md-3 g-4">
			<c:forEach var="lists" items="${TodoLists}" varStatus="status">
				<div class="col">
					<div class="card">
						<h3 class="card-img-top bg-white text-center text-black" style="height: 100%;">${lists.todoListCode}</h3>
						<div class="card-body bg-white text-black border-light border-top border-bottom">
							<h5 class="card-title">${lists.todoListTitle}</h5>
							<p class="card-text">${lists.todoListContent}</p>
						</div>
						<div class="card-footer bg-white">
							<small class="text-muted">${lists.todoListUploadDate}</small>
					    </div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>