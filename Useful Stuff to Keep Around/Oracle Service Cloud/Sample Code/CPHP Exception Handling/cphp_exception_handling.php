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

try {
	$contact = RNCPHP\Contact::fetch(1777777); // c_id 1777777 (probably) does not exist
}
catch ( RNCPHP\ConnectAPIError $err )
{
	phpoutlog("ConnectPHP exception in file: " . __FILE__ . ", line: " . __LINE__);
	phpoutlog("Exception code : " . $err->getCode() );
	phpoutlog("Exception message : " . $err->getMessage() );
	throw($err);
};

printf("<p>%s<br>%s<br>%s", $contact->Name->First, $contact->Name->Last, date("n/d/Y", $contact->CustomFields->c->birthday));
?>

<!DOCTYPE html>
<html>
<head>
<title>ExceptionDemo</title>
</head>
<body>
<h1>Agent Login</h1>
<form id='login' action="<?=$targetUrl?>" method='post' accept-charset='UTF-8'>
<fieldset >
    <legend>Login</legend>
    <input type='hidden' name='redirect' id='redirect' value='1'/>
    <label for='username' >UserName*:</label>
    <input type='text' name='username' id='username'  maxlength="50" />
    <label for='password' >Password*:</label>
    <input type='password' name='password' id='password' maxlength="50" />
    <input type='submit' name='Submit' value='Log In' />
    </fieldset>
</form>

</body>
