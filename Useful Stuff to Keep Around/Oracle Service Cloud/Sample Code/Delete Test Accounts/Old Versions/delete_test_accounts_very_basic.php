<?
require_once( get_cfg_var( 'doc_root' ).'/include/ConnectPHP/Connect_init.phph' );
use RightNow\Connect\v1_2 as RNCPHP;
initConnectAPI();

// Go!

$roql_query = "SELECT Account FROM Account A WHERE A.Emails.Address LIKE 'michael.j.waldron@oracle.com%'";

$res = RNCPHP\ROQL::queryObject($roql_query)->next();
$acc = $res->next();
?>
First name: <? print($acc->Name->First) ?><br>
Last name: <? print($acc->Name->Last) ?><br>
Login: <? print($acc->Login) ?><br>
<?
$acc->destroy();
?>