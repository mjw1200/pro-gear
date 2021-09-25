<?
$ip_dbreq = true;
require_once('include/init.phph');

// This function requires whitelisting in 11.8+ I don't even care what the
// result or return value is, I just want to trigger/resolve a whitelisting
// error for demo purposes.
acct_login_verify('2a2a9');

echo "<p>Hi.";
