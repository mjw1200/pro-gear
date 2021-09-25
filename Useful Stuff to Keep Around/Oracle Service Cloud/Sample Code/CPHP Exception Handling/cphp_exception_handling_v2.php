<?
$targetUrl = dirname($_SERVER['SCRIPT_URL']);

if (!defined('DOCROOT')) {
    $docroot = get_cfg_var('doc_root');
    define('DOCROOT', $docroot);
}
require_once(DOCROOT .'/include/services/AgentAuthenticator.phph' );

$account = AgentAuthenticator::authenticateCookieOrCredentials($username, $password);

initConnectAPI();
use RightNow\Connect\v1_2 as RNCPHP;

$errors = array();

if($submit)
{
	try {
		if(empty($c_id))
			$errors[] = 'Please enter a valid contact c_id';
		else
			$contact = RNCPHP\Contact::fetch($c_id);
	}
	catch ( RNCPHP\ConnectAPIError $err )
	{
		phpoutlog("ConnectPHP exception in file: " . __FILE__ . ", line: " . __LINE__);
		phpoutlog("Exception code : " . $err->getCode() );
		phpoutlog("Exception message : " . $err->getMessage() );
		$errors[] = "There was an error in retreiving your contact record.  Error: ". $err->getMessage();
	};
}
?>

<!DOCTYPE html>
<html>
<head>
<title>ExceptionDemo</title>
</head>
<body>
<h1>Contact Details</h1>
<?
// check for errors
if(count($errors) > 0)
{
	echo '<div id="errors" style="color:white; background-color:red; border:1px solid black; padding:5px;">';
	echo '<h3>Errors</h3>';
	echo '<ul>';
	foreach($errors as $error)
	{
		echo '<li>' . $error . '</li>';
	}
	echo '</ul>';
	echo '</div><br/>';
// display contact details if valid contact id given
}else if($submit){
	echo '<div id="errors" style="color:white; background-color:green; border:1px solid black; padding:5px;">';
	echo '<h3>Contact Details</h3>';
	echo '<p>
			C_ID: '.$contact->ID . '<br>
			FirstName: '.$contact->Name->First . '<br>
			LastName: ' . $contact->Name->Last . '
		  </p>';

	echo '</div><br/>';
}
?>

<form id='login' method='post' accept-charset='UTF-8'>
<fieldset >
    <legend>Contact Details</legend>
    <label for='c_id' >Enter c_id for contact*:</label>
    <input type='text' name='c_id' id='c_id'  maxlength="50" />
    <input type='submit' name='submit' value='submit' />
    </fieldset>
	For success, use c_id = 1<br/>
	For error, use c_id = 100<br/>
</form>

</body>
