<?
// AgentAuthenticator calls initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
use RightNow\Connect\v1_2 as RNCPHP; // Or v1_1. Or v1 as needed.

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
catch (Exception $ex)
{
    printf("<p style=\"color:red;font-weight:bold\">%s<br></p>", $ex->GetMessage());
}   
