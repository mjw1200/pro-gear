<?
// AgentAuthenticator calls initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
// use RightNow\Connect\v1_2 as RNCPHP;
use RightNow\Connect\v1_1 as RNCPHP;

if ($handle = opendir("/cgi-bin")) {
    echo "<p>Directory contents:";
    echo "<ul>";
    while (false !== ($entry = readdir($handle))) {
        echo "<li>$entry";
    }
    echo "</ul>";
}
else {
    echo "<p>Couldn't open that fscking directory.";
}
