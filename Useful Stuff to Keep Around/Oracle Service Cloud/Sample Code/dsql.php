<?
$ip_dbreq = true;
require_once('include/init.phph');

// This function requires whitelisting in 11.8+ I don't even care what the
// result is, I just want to trigger/resolve a whitelisting error for demo
// purposes.
sql_exec_direct("DELETE FROM incidents WHERE ref_no = '910101-000001'");

echo "<p>Hi.";
