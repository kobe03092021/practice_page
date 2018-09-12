<form action="" method="post">
	<input type="number" name="number1"> + <input type="number" name="number2">
	<input type="submit" value="実行">
</form>

<?php

	//実行ボタンを押すと、
	if($_POST){

		//偶数か奇数かを判断してくれる
		echo"奇数";
	}
	