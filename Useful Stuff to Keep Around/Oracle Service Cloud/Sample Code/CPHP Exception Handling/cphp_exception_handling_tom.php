<?

use RightNow\Connect\v1 as RNCPHP;
$ip_dbreq = true;
require_once('include/init.phph');
include_once('include/src/rnwintf.phph');
include_once('include/src/config/rnw_ui.phph');
include_once('include/src/config/common.phph');
require_once('include/ConnectPHP/Connect_init.phph');
initConnectAPI();

$errors = array();

// process form submission
if($submit)
{
	try {
		if(empty($c_id))
			$errors[] = 'Please enter a valid contact c_id';
		else
			$contact = RNCPHP\Contact::fetch($c_id); // c_id 1777777 (probably) does not exist
	}
	catch ( RNCPHP\ConnectAPIError $err )
	{
		phpoutlog("ConnectPHP exception in file: " . __FILE__ . ", line: " . __LINE__);
		phpoutlog("Exception code : " . $err->getCode() );
		phpoutlog("Exception message : " . $err->getMessage() );
		$errors[] = "There was an error in retreiving your contact record.  Error: ". $err->getMessage();
		//throw($err);
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
	For error, use c_id = 1<br/>
	For success, use c_id = 4<br/>
</form>

</body>
