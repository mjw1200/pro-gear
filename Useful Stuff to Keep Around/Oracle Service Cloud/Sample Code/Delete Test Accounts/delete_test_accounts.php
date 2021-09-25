<?
/*****************************************************************************
 * delete_test_accounts.php
 *
 * Allow an agent to select test accounts for deletion. Does not use 
 * AgentAuthenticator, suitable for RightNow CX versions 11.11 and down.
 *
 * THIS SCRIPT IS UNSECURED. IT WILL ATTEMPT TO DELETE ITSELF WHEN IT'S
 * DONE RUNNING, BUT IF THIS FAILS YOU MUST DELETE IT YOURSELF. THE
 * SCRIPT WILL LET YOU KNOW WHETHER THE DELETION SUCCEEDED OR FAILED.
 ****************************************************************************/

require_once( get_cfg_var( 'doc_root' ).'/include/ConnectPHP/Connect_init.phph' );
use RightNow\Connect\v1 as RNCPHP; // Lowest common denominator CPHP
initConnectAPI();
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
	alert("Power tools are useful, but dangerous. Please be careful.");	
	changeChecked(true);
}
function clearAll()
{
	changeChecked(false);
}
</script>
<style>
.localbutton {margin-top: 10px; margin-right: 10px; font-size:105%}
body {font-family:Arial,Helvetica,sans-serif}
h1 {font-size:150%}
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

/*****************************************************************************
 * Confirmation - User's confirmed accounts to delete. Delete them.
 ****************************************************************************/
if(isset($_POST['confirm']))
{
?>
<h1>Okay, deleted these accounts:</h1>
<table border="1">
<tr><th>ID<th>First<th>Last<th>Email<th>Login</tr>
<?	
	foreach ($_POST as $key => $value)
	{	
		if (!substr_compare($key, "ID", 0, 2))
		{
			$foo = substr($key, 2);
			
			$row  = sprintf("<tr>\n");
			$row .= row_data($_POST['ID'.$foo], $_POST['first'.$foo], $_POST['last'.$foo], $_POST['email'.$foo], $_POST['login'.$foo], $foo);
			$row .= sprintf("</tr>\n");

			$roql_query = "SELECT Account FROM Account A WHERE A.ID = " . $value;
			$acc = RNCPHP\ROQL::queryObject($roql_query)->next()->next();
			$acc->destroy();
			
			print ($row);
		}
	}
	
	$fail1 = False;
	$fail2 = False;
	
	// Attempt to unlink the src version of the script
	$src = dirname(__FILE__) . '/src/' . basename(__FILE__);
	if (unlink($src) == False)
		$fail1 = True;
	// Attempt to unlink the optimized version of the script
	if (unlink(__FILE__) == False)
		$fail2 = True;
	// Report success or failure as appropriate
	if ($fail1 || $fail2)
		print '<p style="color:red">This (unsecured) script tried to remove itself to secure the site, but failed. Please ensure it gets deleted by any means necessary. Please check both /scripts/custom and /scripts/custom/src';
	else
		print '<p>This (unsecured) script has deleted itself for security. If you want to run it again, you\'ll need to re-upload it.';
}
/*****************************************************************************
 * Selection - User's selected accounts to delete, get confirmation.
 ****************************************************************************/
else if (isset($_POST['select']))
{
?>
	<h1 style="color:red">These accounts will be deleted. Are you sure?</h1>
	
	<form action="" method="POST">
	<table border="1">
	<tr><th>ID<th>First<th>Last<th>Email<th>Login</tr>
<?	
		$delete_next_id = false;
		$i = 0;
		
		foreach ($_POST as $key => $value)
		{	
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
	<input class="localbutton" type="button" value="<< Wait, no!" onclick="window.history.back()">
	<input class="localbutton" type="submit" name="confirm" value="Yep. >>">
	</form>
<?	
}
/*****************************************************************************
 * Entry - Page is newly hit. Get agent credentials.
 ****************************************************************************/
else
{
?>
	<form action="" method="POST">
	<table border="1">
	<tr><th>Delete?<th>ID<th>First<th>Last<th>Email<th>Login</tr>

<?
	// Query's built up like this so each condition is on its own line.
	// Clarity, man! It's so much clearer this way!!
	$roql_query = "SELECT Account FROM Account A WHERE ";
	$roql_query .= "(A.Name.First LIKE 'Rnt_%' AND A.Name.Last LIKE 'Rnt_%' AND A.Login LIKE '%_Rnt') OR ";
	$roql_query .= "A.Emails.Address LIKE '%@oracle.com' OR ";
	$roql_query .= "A.Emails.Address LIKE '%@rightnow.com' ";

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
	<input type="button" class="localbutton" onclick="selectAll()" value="Select All">
	<input type="button" class="localbutton" onclick="clearAll()" value="Clear All">
	<input type="submit" class="localbutton" name="select" value="Next >>">
	</form>
<?
}
?>
</body>
</html>
