<?
ini_set('display_startup_errors', 1);
ini_set('display_errors', 1);
error_reporting(E_ERROR);

// AgentAuthenticator calls initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
use RightNow\Connect\v1_3 as RNCPHP;

AgentAuthenticator::authenticateCredentials('hoopy', 'frood');
printf("<p>PID: %d</p>", getmypid());

try {
	$dir = '/vhosts/[intf]/euf/assets/...';
	printf ("<p>$dir</p>\n");
	$entries = scandir($dir);
	printf("<ul>\n");
	foreach ($entries as $entry)
	{
		printf("<li> $entry\n");
	}
	printf("</ul>\n");
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
