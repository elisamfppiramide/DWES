<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        if(isset($_POST["email"]) && isset($_POST["mensaje"])){
            $email = $_POST["email"];
            $mensaje = $_POST["mensaje"]; 
            $datos= array($email, $mensaje); 
            foreach($datos as $dato){
                var_dump($datos);
            }
        }
    ?>
    
</body>
</html>