<!-- goods_detail.php -->
<div id = "body"><form method = "POST" action = "">
	<?php

	  $code = $_GET['code']; //商品データベースのID

	  require_once 'database_connect.php';

	  $sql = "SELECT * FROM goods WHERE id = $code"
	  $result = $mysqli -> query($sql);

	  //クエリ検索
	  if(!$result) {
	  	echo $mysqli -> error;
	  	exit();
	  }

	  //連想配列で取得
	  while($row = $result -> fetch_array(MYSQLI_ASSOC)){
	  	$name = $row['name'];
	  	$genre = $row['genre'];
	  	$brand = $row['brand'];
	  	$maker = $row['maker'];
	  	$price = $row['price'];
	  	$component = $row['component'];
	  	$catchphrase = $row['catchphrase'];
	  	$file = $row['file'];
	  }

	  //結果セットを解放
	  $result -> free();

	  //データベース切断
	  $mysqli -> close();

	  //画像ファイル読み込み
	  $image_disp = '<img src = "./image/'.$file.'" widht-"300px" height="300px">';

	  echo $image_disp;
	  echo $name;
	  echo $genre;
	  echo $brand;
	  echo $maker;
	  echo $price;
	  echo $component;
	  echo $catchphrase
	?>

	<select name = "num">
		<option value = "0">0</option>
		<option value = "1">1</option>
		<option value = "2">2</option>
		<option value = "3">3</option>
		<option value = "4">4</option>
		<option value = "5">5</option>
		<option value = "6">6</option>
		<option value = "7">7</option>
		<option value = "8">8</option>
		<option value = "9">9</option>
	</select>
	<input name = "into_cart" type = "submit" value = "カートに追加">
	<input type = "hidden" name = goods_code value = "<?php echo "$code"; ?>">
</form>
</div>
