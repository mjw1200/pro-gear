<html>
<head>
<style>
body {font-family:Arial,Helvetica,sans-serif}
h1 {font-size:150%;color:red}
</style>
</head>
<body>

<?
require_once( get_cfg_var( 'doc_root' ).'/include/ConnectPHP/Connect_init.phph' );
use RightNow\Connect\v1_2 as RNCPHP;
initConnectAPI();

if(isset($_POST['confirm']))
{
?>
<h1>Foo</h1>
<?
}
else if(isset($_POST['submit']))
{
	$delete_next_id = false;
?>
<h1>These accounts will be deleted. Are you sure?</h1>
<form action="<? echo $_SERVER['SCRIPT_URI']; ?>" method="POST">
<table border="1">
<tr><th>ID<th>First<th>Last<th>Email<th>Login</tr>
<?	
	$i = 0;
	
	foreach ($_POST as $key => $value)
	{	
		if (!substr_compare($key, "ID", 0, 2))
		{
			if ($delete_next_id)
			{
				$roql_query = "SELECT Account FROM Account A WHERE A.ID = " . $value;
				$res = RNCPHP\ROQL::queryObject($roql_query)->next();
				$acc = $res->next();
				printf("<tr><td>%s<td>%s<td>%s<td>%s<td>%s<td style=\"display:none\"><input type=\"hidden\" name=\"ID%s\" value=\"%s\"></tr>", $acc->ID, $acc->Name->First, $acc->Name->Last, $acc->Emails[0]->Address, $acc->Login, $i, $acc->ID);
				// printf("Would delete Account.ID == %d<br>", $value);
				// printf("<tr><td>$value");
				$delete_next_id = false;
				$i++;
			}
			else
				; // printf("Would NOT delete Account.ID == %d<br>", $value);
		}
					
		if (!substr_compare($key, "delete", 0, 6))
			if ($value == "on")
				$delete_next_id = true;
			else
				$delete_next_id = false;
		else
			$delete_next_id = false;
	}
?>
</table>
<input type="submit" name="confirm" value="Go!">
<?	
	// exit();
}
else {
?>

<form action="<? echo $_SERVER['SCRIPT_URI']; ?>" method="POST">
<table border="1">
<tr><th>Delete?<th>ID<th>First<th>Last<th>Email<th>Login</tr>

<?
$roql_query = "SELECT Account FROM Account A WHERE A.Emails.Address LIKE 'michael.j.waldron@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'daniel.douthit@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'stephen.beery@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'kyle.stadler@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'hilarion.lynn@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'richard.w.fox@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'skyler.niedrist@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'edward.huth@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'kevin.dirkson@oracle.com%' ";
$roql_query .= "OR A.Emails.Address LIKE 'derek.hammons@oracle.com%' ";

$res = RNCPHP\ROQL::queryObject($roql_query)->next();
$i=0;

while ($acc = $res->next())
{
	printf("<tr><td><input type=\"checkbox\" name=\"delete%s\"><td>%s<td>%s<td>%s<td>%s<td>%s<td style=\"display:none\"><input type=\"hidden\" name=\"ID%s\" value=\"%s\"></tr>", $i, $acc->ID, $acc->Name->First, $acc->Name->Last, $acc->Emails[0]->Address, $acc->Login, $i, $acc->ID);
	$i++;
}
?>

</table>
<input type="submit" name="submit" value="Go!">
<?
}
?>
</form>
</body>
</html>

<!--
<html>
<body>
<form>
<table border="1">
<tr><th>Delete?<th>First<th>Last<th>Email<th>Login</tr>
<tr><td><input type="checkbox" name="delete_account"><td>Mike<td>Waldron<td>michael.j.waldron@oracle.com<td>mjw</tr>
<tr><td><input type="checkbox" name="delete_account"><td>Dan<td>Douthit<td>daniel.douthit@oracle.com<td>dd</tr>
</table>
<input type="submit" value="Go!">
</form>
</body>
</html>
-->