$email = $_POST['email'];
if(preg_match("~(a-zA-Z0-9!#$%&amp;'*+-/=?^_'{|}~])@([a-zA-Z0-9]).([a-zA-z0-9]{2,4}~",$email)){
	echo 'This is a valid email.';
} else{
	echo 'THis is an invalid.';
}