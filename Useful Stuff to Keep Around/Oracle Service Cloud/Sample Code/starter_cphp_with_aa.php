<?
ini_set('display_startup_errors', 1);
ini_set('display_errors', 1);
error_reporting(E_ERROR);

// AgentAuthenticator calls initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
use RightNow\Connect\v1_3 as RNCPHP;

if (isset($_POST['Submit']))
{
    AgentAuthenticator::authenticateCredentials($_POST['username'], $_POST['password']);
    printf("<p>PID: %d</p>", getmypid());

    try {
        // Do useful things
        
        // $res = RNCPHP\ROQL::queryObject("SELECT Answer FROM Answer WHERE ID = 690")->next();
        // while ($obj = $res->next())
        // {
        // }        
        
        printf("<p style=\"color:green;font-weight:bold\">All good.<br></p>");
    }
	catch (RNCPHP\ConnectAPIError $err)
	{
		printf("<p style=\"color:red;font-weight:bold\">ConnectAPIError: %s<br></p>", $err->getMessage());
	}    
	catch (\Exception $ex)
    {
        printf("<p style=\"color:red;font-weight:bold\">PHP Exception: %s<br></p>", $ex->GetMessage());
    }   
}
else
{
?>
<form action="" method="POST">
	<fieldset>
		<legend>Login</legend>
		<input type="hidden" name="submitted" id="submitted" value="1"/>
		<label for="username" >Username*:</label>
		<input type="text" id="username" name="username" maxlength="50" />
		<label for="password" >Password*:</label>
		<input type="password" name="password" id="password" maxlength="50" />
		<input type="submit" name="Submit" value="Log In" />
	</fieldset>
</form>
<?
}
?>