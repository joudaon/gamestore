<?php
    /*Subject and Email variables*/
    $mailto = 'jonuda77@gmail.com'; //$webMaster
    $subject = 'Gamestore'; //$emailSubject
    
    /*Gathering Data Variables*/
    $nombre = $_POST['nombre'];
    $email = $_POST['email'];
    $movil = $_POST['movil'];
    $asunto = $_POST['asunto'];
    
    $body = <<<EOD
<br><hr><br>
Nombre: $nombre <br>
Email: $email <br>
Movil: $movil <br>
Asunto: $asunto <br>
EOD;
    
    $header = "From: $email\r\n";
    $header .= "Content-type: text/html\r\n";
    
    $success = mail($mailto, $subject, $body, $headers);

/*Results rendered as HTML*/
    
    $theResults = <<<EOD
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Gracias por tu comentario. Tu email será contestado lo más rápidamente posible!</div>
    </body>
</html>
EOD;
echo "$theResults"
    
?>