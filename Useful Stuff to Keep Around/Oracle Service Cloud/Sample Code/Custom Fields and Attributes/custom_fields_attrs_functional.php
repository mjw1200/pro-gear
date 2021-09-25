<?
// ---------------------------------------------------------------------------
// custom_fields_attrs_functional.php
//
// Fetches an incident with ROQL, and echoes a custom field and custom/system
// attribute on that incident.
//
// Assumes the existence of an incident custom field named "custom_field," and
// an incident custom/system attribute named "custom_attr."
// ---------------------------------------------------------------------------

// AgentAuthenticator calls initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
use RightNow\Connect\v1 as RNCPHP;
// use RightNow\Connect\v1_1 as RNCPHP;
// use RightNow\Connect\v1_2 as RNCPHP;

if (isset($_POST['Submit']))
{
	$auth = AgentAuthenticator::authenticateCredentials($_POST['username'], $_POST['password']);
    // print_r($auth);

    $roql_query = "SELECT Incident FROM Incident I WHERE I.ReferenceNumber = '140415-000000'";
    $res = RNCPHP\ROQL::queryObject($roql_query)->next();
    $inc = $res->next();
    
    // Connect 1
    echo '<p>Custom field: ' . $inc->CustomFields->custom_field;
    echo '<p>(Custom attributes are not supported in Connect 1)';
    
    // Connect 1.1
    // echo '<p>Custom field: ' . $inc->CustomFields->custom_field;
    // echo '<p>Custom attribute: ' . $inc->CustomAttributes->CO->custom_attr;
    
    // Connect 1.2
    // echo '<p>Custom field: ' . $inc->CustomFields->c->custom_field;
    // echo '<p>System attribute: ' . $inc->CustomFields->CO->custom_attr;
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