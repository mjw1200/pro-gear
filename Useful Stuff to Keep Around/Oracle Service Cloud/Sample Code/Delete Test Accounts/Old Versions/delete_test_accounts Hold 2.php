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

/*
 * row_data
 *
 * Print out the row data
 */
function row_data($id, $first, $last, $email, $login, $i)
{
	$row  = sprintf("  <td>%s\n", $id);
	$row .= sprintf("  <td>%s\n", $first);
	$row .= sprintf("  <td>%s\n", $last);
	$row .= sprintf("  <td>%s\n", $email);
	$row .= sprintf("  <td>%s\n", $login);
	$row .= sprintf("  <td style=\"display:none\"><input type=\"hidden\" name=\"ID%s\" value=\"%s\">\n", $i, $id);
	$row .= sprintf("  <td style=\"display:none\"><input type=\"hidden\" name=\"first%s\" value=\"%s\">\n", $i, $first);
	$row .= sprintf("  <td style=\"display:none\"><input type=\"hidden\" name=\"last%s\" value=\"%s\">\n", $i, $last);
	$row .= sprintf("  <td style=\"display:none\"><input type=\"hidden\" name=\"email%s\" value=\"%s\">\n", $i, $email);
	$row .= sprintf("  <td style=\"display:none\"><input type=\"hidden\" name=\"login%s\" value=\"%s\">\n", $i, $login);

	return $row;
}

/****************** Confirmation ******************
 * Account IDs to delete have been selected and
 * confirmed. Go do it to it.
 *************************************************/
if(isset($_POST['confirm']))
{
?>
<h1>Foo</h1>
<?
}
/****************** Submission ********************
 * Account IDs have been selected. Get confirmation
 * before proceeding with the deletion.
 *************************************************/
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
		// Debugging. :-/
		// printf("<!-- %s, %s -->\n", $key, $value);
		
		if (!substr_compare($key, "ID", 0, 2))
		{
			if ($delete_next_id)
			{				
				$row  = sprintf("<tr>\n");
				$row .= row_data($_POST['ID'.$i], $_POST['first'.$i], $_POST['last'.$i], $_POST['email'.$i], $_POST['login'.$i], $i);
				$row .= sprintf("</tr>\n");
				
				print($row);
			}
		}
					
		if (!substr_compare($key, "delete", 0, 6))
			if ($value == "on")
				$delete_next_id = true;
			else
				$delete_next_id = false;
		else
			$delete_next_id = false;

		// end of the row...increment $i
		if (!substr_compare($key, "login", 0, 5))
			$i++;
	}
?>
</table>
<input type="submit" name="confirm" value="Go!">
<?	
}
/****************** Entry *************************
 * Page is newly hit. Do initial query, build table
 * form to allow for selection.
 *************************************************/
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
	$row  = sprintf("<tr>\n");
	$row .= sprintf("  <td><input type=\"checkbox\" name=\"delete%s\">\n", $i);
	$row .= row_data($acc->ID, $acc->Name->First, $acc->Name->Last, $acc->Emails[0]->Address, $acc->Login, $i);
	$row .= sprintf("</tr>\n");
	
	print($row);
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
