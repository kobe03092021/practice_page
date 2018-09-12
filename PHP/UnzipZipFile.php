<?php
	function unzip($locationo,$newLocation){
		if(exec("unzip $location", $arr)){
			mkdir($newLocation);
			for($i = 1;$i< count($arr);$i++){
				$file = trim(preg_replace("~inflation: ~","",$arr[$i]));
				copy($location. '/'.$file,$newLocation,'/',$file);
				unlink($location.'/'.$file);
			}
			return TRUE;
		}else{
			return FALSE;
		}
	}
?>
//Use the code as following:

<?php
include 'function.php';
if(unzip('zipedfiles/test.zip','unziped/myNewZip'))
	echo 'Success!';
else
	echo 'Error';
?>