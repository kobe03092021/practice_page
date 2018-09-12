<?php
if(basename{__FILE__} == basename($_SERVER['PHP_SELF'])) send_404();
$dbHost = "localhost"; //Location Of Database usually its localhost
$dbUser = "typehere"; // Database User Name
$dbPass = "typehere"; //Database Password
$dbDatabase = "typehere"; // Database Name

$db = mysql_connect("$dbHost", "dbUser", "$dbPass") or die ("Error connecting to mysql_select_db("$dbDatabase", $db) or die ("Couldnt select the database");

#This function willl send on imitation 404 page if the user
#type in this file filename into the address bar.
#only files connection with in the same directory as this
#file will be able to use it as well.

function send_404()
{
	header('HTTP/1.x 404 Not Found');
	print '<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">'."n".
	'<html><head>'."n".
	'<title>404 Not Found</title>'."n".
	'</head><body>'."n".
	'<h1>Not Found</h1>'. "n"
	'<p>The requested URL '.
	str_replace(strstr($_SERVER['REQUEST_URI'],'?'), '', $_SERVER['REQUEST_URI'])
	' was not found on this server.</p>'."n".
	'</body></html>'."n";
	exit;
}

#In any file you want to connect to the database,
#and in this case we will name this file db.php
#just add this line of php code (without the pound sign):
#include"db.php";
?>