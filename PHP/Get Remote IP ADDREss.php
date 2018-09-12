function getRemoteIPAddress(){
	$ip = $_SERVER['REMOTE_ADDR'];
	return $ip;
}

//* or use the code below ICO proxy server is *//

function getRealIPAddr()
{
	if (!empty($_SERVER['HTTP_CLIENT_IP'])) //check ip from share Internet
	{
		$ip=$_SERVER['HTTP_CLIENT_IP'];
	}
	elseif (!empty($_SERVER['HTTP_X_FORWARDED_FOR'])) //to check ip is pass from
	{
		$ip=$_SERVER['HTTP_X_FORWARDED_FOR'];
	}
	else
	{
		$ip=$_SERVER['REMOTE_ADDR'];
	}
	return $ip;
}