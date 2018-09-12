<?php
#This particular code will generate a random string
#That is 25 characters long 25 comes from the number
#That is in the for loop

$string = "abcdefghijklmnopqrstuvwxyz0123456789";
for($i=0;$i<25;$i++>{
	$pos = rand(0, 36);
	$str .= $string{$pos};
}
echo $str;
#IF you have a database you can save the string in
#there, and send the use an email with the code in
#it they the ncan click a link or copy the code
#and you can then verify thta is the correct email
#or verify what ever you want to verify
