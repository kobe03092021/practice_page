function base64url_eoncode($plainText){
	$base64 = base64_encode($plainText);
	$base64url = strtr($bas64, '+/=', '-_,');
	return $base64url;
}

function base64url_decode($plainText){
	$base64url = strtr($plainText, '-_,', '+/=');
	$base64 = base64_decode($base64url);
	return $base64;
}