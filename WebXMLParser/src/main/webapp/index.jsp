<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Web App | Irina Skurko</title>
	<link rel="stylesheet" href="styles/style.css">
</head>
<body>
	<div class="container">
		<div class="header"><h1>Web App: XML</h1></div>
		<div class="gen-container">
			<form action="generate" method="post" class="generate-xml-form">
				<label for="create">Create XML for a book shop</label>
				<input type="submit" id="create" value="Click me">
			</form>
		</div>
		<div class="pars-container">
			<form action="parse" method="post">
				<h2>Parse Book Shop XML</h2>
				<div class="form-row">
					<label for="file">Choose file to upload</label>
					<input type="file" id='file' name='file' hidden="True">
				</div>
				<div class="form-row">
					<label for="tag_name">Input tag name:</label>
					<input type="text" id='tag_name' name="tag_name" value="title">
				</div>
				<div class="form-row">
					<input type="radio" name="parse-option" id="DOM" value="DOM" checked>
					<label for="DOM">Parse with DOM</label>
					<input type="radio" name="parse-option" id="SAX" value="SAX">
					<label for="SAX">Parse with SAX:</label>
				</div>
				
				<input type="submit" value='Parse it!'>
			</form>
		</div>
	</div>
</body>
</html>