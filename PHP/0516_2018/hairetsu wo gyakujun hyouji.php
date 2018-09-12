<h2 id="content3">配列を逆順に表示する</h2>
<p>['apple'=>100, 'orange'=>200, 'grape'=>300]の配列を逆順に一列ずつ表示する</p>
<p>想定される表示</p>
<p>grape:300</p>
<p>orange:200</p>
<p>apple:100</p>
<form action="#content3" method="post">
	<input type="submit" name="content3" value="実行">
</form>

<div class="box">
	<p>実行結果</p>
	<div class="innner">
		<?php
			//対象配列を定義
			$array = ['apple' => 100, 'orange' => 200, 'grape' => 300];
			
			//実行ボタンを押すと
			if(ifset($_POST["content3"])){
				function array_reverse_keys($array)
				return array_reverse(array_reverse($array,true), false)
			

			}
		?>
	</div>
</div>
