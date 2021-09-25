<?
require_once( get_cfg_var( 'doc_root' ).'/include/ConnectPHP/Connect_init.phph' );
initConnectAPI();
use RightNow\Connect\v1_2 as RNCPHP;

// Note ROQL uses dots
$roql_query = "SELECT Incident FROM Incident I WHERE I.CustomFields.c.refno_datepart IS NULL OR I.CustomFields.c.refno_serialpart IS NULL";

// Note call to next() followed by call to next(). A Connect oddity, I guess.
$res = RNCPHP\ROQL::queryObject($roql_query)->next();
while ($inc = $res->next())
{
    // Note PHP uses arrows
    $inc->CustomFields->c->refno_datepart = intval(substr($inc->ReferenceNumber, 0, 6));
    $inc->CustomFields->c->refno_serialpart = intval(substr($inc->ReferenceNumber, 7, 6));
    $inc->save();
}