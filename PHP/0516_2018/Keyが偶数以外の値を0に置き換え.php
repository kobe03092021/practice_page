<h2 id="content5">Keyが偶数以外の値を0に置き換え</h2>
<p>置き換え前</p>
<p>想定では、</p>
<p>Array([0] => 1 [1] => 0 [2] => 1 [3] => 0 )</p>

<form action= "#content5" method = "post">
	<input type="submit" name ="content5" value ="実行">
</form>

<div class ="box">
	<p>実行結果</p>
	<div class ="inner">
		<?php
		//対象の配列を定義
		$array = [1, 1, 1, 1];

		//実行ボタンが押されたら、
		if(isset($_POST["content5"])){

			foreach($array as $key => $value) {
				if ($key %2 !=0){
					$array[$key]=0;
				}
			}

			print_r($array);
		}
		?>
	</div>
</div>