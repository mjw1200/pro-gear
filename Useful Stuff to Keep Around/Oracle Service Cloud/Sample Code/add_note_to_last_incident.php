<?
require_once( get_cfg_var( 'doc_root' ).'/include/ConnectPHP/Connect_init.phph' );
use RightNow\Connect\v1_2 as RNCPHP; // Or v1_1. Or v1 as needed.
initConnectAPI();

// Go!

$res = RNCPHP\ROQL::query("SELECT max(ID) FROM Incident")->next();
while($i = $res->next()) {
    $max_i_id = $i['max(ID)'];
}

$res = RNCPHP\ROQL::query("SELECT count(ID) FROM Incident")->next();
while($i = $res->next()) {
    $num_incidents = $i['count(ID)'];
}
?>

<p>There are <?=$num_incidents?> incidents in the DB, and the max i_id is <?=$max_i_id?></p>

<?
if ($num_incidents < 1) {
?>
<p>Not enough incidents in the DB, sorry
<?
}
else {
	try {
		$res = RNCPHP\ROQL::queryObject("SELECT Incident FROM Incident I WHERE I.ID = " . $max_i_id)->next();
		$i = $res->next();
		?>
		<p>Sufficient incidents are present in the DB, adding note to <?=$i->ReferenceNumber?>
		<?
		$i->Threads = new RNCPHP\ThreadArray();
		$i->Threads[0] = new RNCPHP\Thread();
		$i->Threads[0]->EntryType = new RNCPHP\NamedIDOptList();
		$i->Threads[0]->EntryType->ID = 3; // Used the ID here. See the Thread object for definition
		$i->Threads[0]->Text = "Foo. Foo!";
		$i->save();
	}
	catch (Exception $err ){
		echo "An exception resulted " . $err->getMessage();
	}
}
?>
