<!-- function.php -->

  <?php

  if(iseset($_POST['into_cart'])){
      function connect() {
      	return new PDO("mysql:dbname=ec", "root");
      }
      $rows = array();
      $sum = 0;
      $pdo = connect();
       if ( !isset($_SESSION['cart'])) $_SESSION['cart'] = array();
       if (@$_POST['into_cart']) {
       	@$_SESSION['cart'][$_POST['goods_code']] += $_POST['num'];
       }
       foreach($_SESSION['cart'] as $code => $num) {
       	$st = $pdo->prepare("SELECT * FROM goods WHERE id = ?");
       	$st -> execute(array($code));
       	$row = $st -> fetch(PDO::FETCH_ASSOC);
       	$st -> closeCursor();
       	$row['num'] = strip_tags($num);
       	$sum += $num * $row['price'];
       	$rows[] = $row;

       }
       require 'cart.php';
  }
  ?>