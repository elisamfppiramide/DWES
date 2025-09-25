<?php
    include "./componentes/nav.php";
?>

<form action="/controlador/routers/guarda.php" method = POST>
    <input type="text" name ="matricula" placeholder = "Matricula">
    <input type="text" name = "marca" placeholder = "Marca">
    <input type="text" name ="modelo" placeholder = "Modelo">
    <input type="text" name = "km" placeholder = "Km">

    <button>Guardar</button>
</form>