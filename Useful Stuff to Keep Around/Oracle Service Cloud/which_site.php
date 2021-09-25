<?php

// This doesn't work in custom processes. Either config.phph or init.phph
// requires mod_info.phph, which custom processes seems to be unable to load.

$ip_dbreq = true;
require_once('include/init.phph');
require_once('include/src/config/config.phph');

try
{
    echo "Hello, getting ready to test!\r\n";

    $db_name = cfg_get(DB_NAME);
    echo $db_name . "\r\n";

    if(strpos($db_name, "upgrade") === FALSE){
        //we are working on a production site
        echo "We are on the production site!";
    }
    else{
        //we are working on an upgrade site
        echo "We are on the upgrade site!";
    }

}
catch(Exception $e)
{
    echo "Error was: ".$e->getMessage() . "\n";
    phpoutlog("Exception in file: " . __FILE__ . ", ".  __FUNCTION__ . " at line: " . __LINE__ . "\nException code : " . $e->getCode() . "\nException message : " . $e->getMessage());
    throw $e;
}