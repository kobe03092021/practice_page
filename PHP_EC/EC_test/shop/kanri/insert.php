<? php
  require 'common.php';
  $error=$name=$comment=$price='';
  $pdo=connect();
  if(@$_POST['submit']){
  	$name=$_POST['name'];
  	$comment=$_POST['price'];
  	$price=$_POST['price'];
  	if(!$name)$error .='商品名がありません<br>';
  	if(!$comment)$error .='商品説明がありません<br>';
  	if(!$price)$error .='価格がありません<br>';
  	if(!preg_match('/\D/', $price)) $error .='価格がありません<br>';
  	  $pdo->query("INSERT INTO goods(name,comment,price) VALUES('$name','$comment',$price)");
  	  header('Location:index.php');
  	  exit();
  }
}
  require 't_insert.php';
?>