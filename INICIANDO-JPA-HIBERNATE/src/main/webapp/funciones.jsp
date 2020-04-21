<!DOCTYPE html>
<html lang="es">
<head>
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<meta charset="utf-8">
	<title>Agregar</title>
</head>
<%
String idBus = request.getParameter("idBus");
String nombrePr = request.getParameter("Npr");
String precioPr = request.getParameter("Preciopr");
String cantidadPr = request.getParameter("Cantidadpr");
String totalPr = request.getParameter("Totalpr");

if(idBus==null){
	idBus = "";
	nombrePr = "";
	precioPr = "";
	cantidadPr = "";
	totalPr = "";
}
%>
<body>

<h2 align="center">AGREGAR DATOS</h2>
<form action="ServeleteControler">
<table align="center">
	<thead>
		<tbody>
			<tr>
				<td>
					
						<p>id</p><input type="text" name="id" id="idcarga" value="<%=idBus%>">
						<p>Nombre producto</p><input type="text" name="Nproductos" value="<%=nombrePr%>">
						<p>Precio producto</p><input type="text" name="Pproductos" value="<%=precioPr%>">
						<p>Cantidad de productos</p><input type="text" name="Cproductos" value="<%=cantidadPr%>">
						<p>Total de producto</p><input type="text" name="Tproductos" value="<%=totalPr%>">
						<br>
						<br>
					
				</td>
			</tr>
		</tbody>
	</thead>
</table>
<input type="submit" class="btn btn-info" value="Guardar" name="btn" align="center">
<input type="submit" class="btn btn-info" value="Actualizar" name="btn" align="center">
</form>
</body>
</html>