$query = "select UNIX_TIMESTAMP(date_field) as mydate from mytable where 1=1";
$records = mysql_query($query) or die(mysql_error());
while($row = mysql_fetch_array($records))
{
	echo $row;
}