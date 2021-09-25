<?
ini_set('display_startup_errors', 1);
ini_set('display_errors', 1);
error_reporting(E_ERROR);

// AgentAuthenticator calls initConnectAPI() for us
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
use RightNow\Connect\v1_4 as RNCPHP;

AgentAuthenticator::authenticateCredentials($_POST['username'], $_POST['password']);

// If calling from a browser control on a workspace, authenticate by session ID and use URL parameter s_id=$p_sid.
// The authentication redirect will clobber any other parameters the workspace sends. And yes, it's $_POST even
// if it looks like it should be $_GET.
// AgentAuthenticator::authenticateSessionID($_POST['s_id']);

?><p>PID: <?=getmypid();?></p><?

try {
    // ApplicationContext is required in CPHP 1.4. Remove/comment if you're targeting 1.3 or earlier
    RNCPHP\ConnectAPI::getCurrentContext()->ApplicationContext = "...";
    
    $obj = RNCPHP\ROQL::queryObject("SELECT Answer FROM Answer WHERE ID = 59")->next()->next();
    ?><p>Have the answer by query, the question is "<?=$obj->Question?>"<?       
    
    $obj = RNCPHP\Answer::fetch(59);
    ?><p>Have the answer by fetch, the question is "<?=$obj->Question?>"<?       
    
    $res = RNCPHP\ROQL::query("SELECT Question FROM Answer WHERE ID = 59")->next()->next();
    ?><p>Don't have the answer, but the question is "<?=$res['Question']?>"<?       

    ?><p style="color:green;font-weight:bold">All good.<br></p><?
}
catch (\Exception $ex) {
    ?><p style="color:red;font-weight:bold"><?=$ex->GetMessage()?></p><?
}   
