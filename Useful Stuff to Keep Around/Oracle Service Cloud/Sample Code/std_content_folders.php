<?
// Answering http://rnt-community.custhelp.com/posts/3334b72b83
use RightNow\Connect\v1_2 as RNCPHP;
// SSAC is on, gotta use agent authenticator...it'll call initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );

AgentAuthenticator::authenticateCredentials(mjw, 'XBG2aKsqBLWB');

$query = "SELECT StandardContent FROM StandardContent S";
$res = RNCPHP\ROQL::queryObject($query)->next();
?>

<ol>

<?
while ($std = $res->next()) {
	if (!isset($std->Folder->Parents)) {
		?><li><?=$std->Name?>, <?=$std->Folder->Name?> (ID: <?=$std->Folder->ID?>)<?
	}
}
?>

</ol>