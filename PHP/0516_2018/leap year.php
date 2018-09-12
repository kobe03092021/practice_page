
<br>
<hr>
<h2 id="content4">選択した年が閏年かを判定</h2>
<form action -"#content4" method="post">
	<input type="number" name="year" placeholder="2018">年2月
	<input type="submit" name="content4" value="実行">
</form>

<div class="box">
	<p>実行結果</p>
	<div class="inner">
		<?php
			//実行ボタンが押されたら
			if(isset($_POST["content4"])){
				$year = $_POST["year"];
				if(is_numeric($year)){
					if(checkdate(2, 29, $year)){
						echo "閏年だ!";
					} else {
						echo "閏年ではない!";
					}
				}

			}
		?>
	</div>
</div>

