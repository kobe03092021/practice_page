//this is a sample xml string
$xml_string="<?xml version='1.0'?>
<moleculedb>
	<molecule name='Benzine'>
		<symbol>ben</symbol>
		<code>A</code>
	</molecule>
	<molecule name= 'Water'>
		<symbol>h2o</symbol>
		<code>K</code>
	</molecule>
</moleculedb>";

//loop through the each node of molecule
foreach ($xml->molecule as $record)
{
	//attribute are accessed by
	echo $record['name'], '';
	//node are accessted by -> operator
	echo $record->symbol, '';
	echo $record->code, '<br />';
}

}