<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	
    $(document).ready(function(){
     
       var btn = $('#carga').val();
       $.post('ServeleteControler',{

       },function(respose){
       let datos = JSON.parse(respose);
       //console.log(datos); 
       
       var tabladatos = document.getElementById('tablaDatos');
       for(let item of datos){
       	tabladatos.innerHTML += `
        <tr>
        <td>${item.id}</td>
        <td>${item.nombreProducto}</td>
        <td>${item.precioProducto}</td>
        <td>${item.cantidadProducto}</td>
        <td>${item.totalProducto}</td>
        <td>
        <a href="funciones.jsp?idBus=${item.id}&Npr=${item.nombreProducto}&Preciopr=${item.precioProducto}&Cantidadpr=${item.cantidadProducto}&Totalpr=${item.totalProducto}" class="btn btn-warning">Editar </a>
        <a href="ServeleteControler?btn=Eliminar&id=${item.id}" class="btn btn-danger">Eliminar</a>
        </td>



        </tr>

       	`
       }
 
       });

         });

</script>

<body>

<a href="funciones.jsp" class="btn btn-info">Agregar Nuevo</a>

     <table class="table table-dark" id="tablaDatos">
     	
      <thead>
      	<th>ID</th>
      	<th>NOMBRE</th>
      	<th>PRECIO</th>
      	<th>CANTIDAD</th>
      	<th>TOTAL</th>
        <th>OPCIONES</th>
      </thead>
      <tbody>
      	
      </tbody>

     </table>

</body>
</html>
