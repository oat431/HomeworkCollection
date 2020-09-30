<?php
    try{
 
        // this for start property
        $pdo = new PDO('mysql:host=localhost;dbname=lab05','root');
        $pdo->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
        echo "Database connection established.";

        $sql = "insert into shop (id,make ,model, price) values (NULL,'Toyota','City','679098.09')";
        $pdo->exec($sql);
 
        $sql = "insert into shop (id,make ,model, price) values (NULL,'Toyota','Civic','1279098.09')";
        $pdo->exec($sql);

        $insert = $pdo->prepare("insert into shop (id,make ,model, price) values (NULL,:make,:model,:price)");
        $info = array(':make'=>'Toyota',':model'=>'Yaris',':price'=>'783097.12');
        $insert->execute($info);


        $data = $pdo->query('select * from shop')->fetchAll();
    
        print_r($data);

    }catch(PDOException $e){
        echo "$e";
    }
