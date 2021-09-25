<?
use RightNow\Connect\v1_2 as RNCPHP;
// SSAC is on, gotta use agent authenticator...it'll call initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
?>

<html>
<head>
<script>
function changeChecked(checkedval)
{
	var checkbox = document.getElementsByTagName("input");
	for (var i = 0; i < checkbox.length; i++)
	{
		if (checkbox[i].type == 'checkbox')
			checkbox[i].checked = checkedval;
	}
}
function selectAll()
{
	alert("One advantage to power tools is they can make the task at hand much easier. One disadvantage is they can easily remove your hands. Please be careful.");	
	changeChecked(true);
}
function clearAll()
{
	changeChecked(false);
}
</script>
<style>
body {font-family:Arial,Helvetica,sans-serif}
h1 {font-size:150%;color:red}
</style>
</head>
<body>

<?
/*
 * row_data
 *
 * Build and return the row data string
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
<h1 style="color:black">Okay, deleted these accounts:</h1>
<table border="1">
<tr><th>ID<th>First<th>Last<th>Email<th>Login</tr>
<?	
	$i = 0;
	
	foreach ($_POST as $key => $value)
	{	
		if (!substr_compare($key, "ID", 0, 2))
		{
			$row  = sprintf("<tr>\n");
			$row .= row_data($_POST['ID'.$i], $_POST['first'.$i], $_POST['last'.$i], $_POST['email'.$i], $_POST['login'.$i], $i);
			$row .= sprintf("</tr>\n");

			$roql_query = "SELECT Account FROM Account A WHERE A.ID = " . $value;
			$acc = RNCPHP\ROQL::queryObject($roql_query)->next()->next();
			$acc->destroy();
			
			print ($row);
			$i++;
		}
	}
}
/****************** Selection ********************
 * Selection made. Get confirmation.
 *************************************************/
else if (isset($_POST['select']))
{
	?>
	<h1>These accounts will be deleted. Are you sure?</h1>
	<form action="" method="POST">
	<table border="1">
	<tr><th>ID<th>First<th>Last<th>Email<th>Login</tr>
	<?	
		$delete_next_id = false;
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
	<input type="submit" name="confirm" value="Yep.">&nbsp;&nbsp;&nbsp;<input type="button" value="Wait, no!" onclick="back();">
	</form>
	<?	
}
/****************** Login ********************
 * Authenticate, build table for selection
 *********************************************/
else if (isset($_POST['auth']))
{
	AgentAuthenticator::authenticateCredentials($_POST['user'], $_POST['pass']);
	?>

	<button id="selectAll" onclick="selectAll()">Select All</button>
	<button id="clearAll" onclick="clearAll()">Clear All</button>

	<form action="" method="POST">
	<table border="1">
	<tr><th>Delete?<th>ID<th>First<th>Last<th>Email<th>Login</tr>

	<?
	$roql_query = "SELECT Account FROM Account A WHERE (A.Name.First LIKE 'Rnt_%' AND A.Name.Last LIKE 'Rnt_%' AND A.Login LIKE '%_Rnt') OR A.Emails.Address LIKE '%@oracle.com' OR A.Emails.Address LIKE '%@rightnow.com'";

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
	<input type="submit" name="select" value="Go!">
	</form>
	<?
}
/****************** Entry *************************
 * Page is newly hit. Get agent credentials.
 *************************************************/
else {
?>
<form action="" method="POST">
Agent Login: <input type="text" name="user"><br>
Password: <input type="text" name="pass"><br>
<input type="submit" name="auth" value="Login">
</form>
<?
}
?>
</body>
</html>
