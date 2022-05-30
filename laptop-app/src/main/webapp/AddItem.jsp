<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Laptop Lists</h1>

	<form action="additem.do" method="post">
		<div>
			<label>Name </label> <select name="name" id="name ">
				<option value="select">select</option>

				<option value="Dell">Dell</option>
				<option value="Apple">Apple</option>
				<option value="HP">HP</option>
				<option value="Lenovo">Lenovo</option>
				<option value="ASUS">ASUS</option>
				<option value="Alenware">Alenware</option>
				<option value="A">AI</option>
			</select>
		</div>
		<div>
			<label>Brand</label><select name="brand" id="brand">
				<option value="select">select</option>

				<option value="Lenovo">Lenovo</option>
				<option value="Dell">Dell</option>
				<option value="asus">asus</option>
				<option value="acer">acer</option>
				<option value="a">a</option>
			</select>
		</div>
		<div>
			<label>Color</label> <select name="color" id="color">
				<option value="select">select</option>
				<option value="Black">Black</option>
				<option value="Silver">Silver</option>
				<option value="white">white</option>
				<option value="Grey">Grey</option>
				<option value="p">P</option>

			</select>
		</div>
		<div>
			<label>Price</label> <input type="text" name="price" />
		</div>
		<div>
			<label>RAM</label> <input type="text" name="ram" />
		</div>
		<div>
			<label>ROM</label> <input type="text" name="rom" />
		</div>

		<div>
			<label>HardDisk</label> <select name="hardDisk" id="hardDisk">
				<option value="select">select</option>
				<option value="1TB">1TB</option>
				<option value="500GB">500GB</option>
				<option value="160GB">160GB</option>
				<option value="120GB">120GB</option>
				<option value="250GB">250GB</option>
				<option value="300GB">300GB</option>
			</select>
		</div>
		<input type="submit" value="Submit">
	</form>

	<form action="search.do">
		<input type="text" name="laptopName" /> <input type="submit"
			name="search" />
	</form>
	<div>
		<h2>${message}</h2>

		<label>Laptop Name</label>:${laptop.name }<br> <label>Laptop
			Brand</label>:${laptop.brand }<br> <label>Laptop Color</label>:${laptop.color }<br>

		<label>Laptop Price</label>:${laptop.price }<br> <label>Laptop
			Ram</label>:${laptop.ram }<br> <label>Laptop Rom</label>:${laptop.rom }<br>

		<label>Laptop HardDisk</label>:${laptop.hardDisk }<br>
	</div>

	<form action="delete.do" method="post">
		<h1>Delete Laptop item</h1>
		<div>
			<label>Name </label> <select name="name" id="name ">
				<option value="select">select</option>
				<option value="Dell">Dell</option>
				<option value="Apple">Apple</option>
				<option value="HP">HP</option>
				<option value="Lenovo">Lenovo</option>
				<option value="ASUS">ASUS</option>
				<option value="Alenware">Alenware</option>
				<option value="A">AI</option>
			</select>
		</div>

		<input type="submit" name="search" />
	</form>
	<div>
		<h2>${message}</h2>
	</div>

	<form action="update.do" method="post">
			<div>
			<label>Name </label> <select name="name" id="name ">
				<option value="select">select</option>

				<option value="Dell">Dell</option>
				<option value="Apple">Apple</option>
				<option value="HP">HP</option>
				<option value="Lenovo">Lenovo</option>
				<option value="ASUS">ASUS</option>
				<option value="Alenware">Alenware</option>
				<option value="A">AI</option>
			</select>
		</div>
		<div>
			<label>Brand</label><select name="brand" id="brand">
				<option value="select">select</option>

				<option value="Lenovo">Lenovo</option>
				<option value="Dell">Dell</option>
				<option value="asus">asus</option>
				<option value="acer">acer</option>
				<option value="a">a</option>
			</select>
		</div>
		<div>
			<label>Color</label> <select name="color" id="color">
				<option value="select">select</option>
				<option value="Black">Black</option>
				<option value="Silver">Silver</option>
				<option value="white">white</option>
				<option value="Grey">Grey</option>
				<option value="p">P</option>

			</select>
		</div>
		<div>
			<label>Price</label> <input type="text" name="price" />
		</div>
		<div>
			<label>RAM</label> <input type="text" name="ram" />
		</div>
		<div>
			<label>ROM</label> <input type="text" name="rom" />
		</div>

		<div>
			<label>HardDisk</label> <select name="hardDisk" id="hardDisk">
				<option value="select">select</option>
				<option value="1TB">1TB</option>
				<option value="500GB">500GB</option>
				<option value="160GB">160GB</option>
				<option value="120GB">120GB</option>
				<option value="250GB">250GB</option>
				<option value="300GB">300GB</option>
			</select>
		</div>
		<input type="submit" value="updateItem">

	</form>
		<div>
	
		<h2>${message}</h2>

		<label>Laptop Name</label>:${laptop.name }<br> <label>Laptop
			Brand</label>:${laptop.brand }<br> <label>Laptop Color</label>:${laptop.color }<br>

		<label>Laptop Price</label>:${laptop.price }<br> <label>Laptop
			Ram</label>:${laptop.ram }<br> <label>Laptop Rom</label>:${laptop.rom }<br>

		<label>Laptop HardDisk</label>:${laptop.hardDisk }<br>
	</div>
	

	<form action="viewAll.do" method="post">

	<h3>View all laptop</h3>
	<div>
		<a href="viewAll.do">ViewAllLaptopItems</a><br> <br>
		<c:forEach items="${ListOfLaptopItems}" var="laptopObj">
			<table style="width: 70%">
				<tr>
					<th>Name</th>
					<td>${laptopObj.name}</td>

				</tr>
				<tr>
					<th>Barnd</th>
					<td>${laptopObj.brand}</td>

				</tr>
				<tr>
					<th>Color</th>

					<td>${laptopObj.color}</td>
				</tr>
				<tr>
					<th>Price</th>

					<td>${laptopObj.price}</td>
				</tr>
				<tr>
					<th>RAM</th>

					<td>${laptopObj.ram}</td>
				</tr>
								<tr>
					<th>ROM</th>

					<td>${laptopObj.rom}</td>
				</tr>
								<tr>
					<th>HardDisk</th>

					<td>${laptopObj.hardDisk}</td>
				</tr>
				
			</table>
		</c:forEach>
	</div>
	</form>
</body>
</html>