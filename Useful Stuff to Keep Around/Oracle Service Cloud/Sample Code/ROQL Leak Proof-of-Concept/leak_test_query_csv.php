<?
$ip_dbreq = true;
require_once('include/init.phph');

// ---------- ConnectPHP --------------------------
require_once( get_cfg_var('doc_root').'/ConnectPHP/Connect_init.php');
initConnectAPI();
use RightNow\Connect\v1_2 as RNCPHP;
// ---------- ConnectPHP --------------------------

$threshold = 0;
//
$ROQL_query_template = "SELECT * FROM Incident WHERE ID > %s ORDER BY ID LIMIT 1";

$row = RNCPHP\ROQL::query("SELECT MAX(ID) AS MAX FROM Incident")->next()->next();
$max = $row['MAX'];
//echo($max. "<br />");
//echo($threshold);
echo("starting to churn. . . <br />\n");
while($threshold < $max){
  $ROQL_query_final = sprintf($ROQL_query_template, $threshold);
  //echo($ROQL_query_final . "<BR />");
  $rrs = RNCPHP\ROQL::query($ROQL_query_final);
  $rs = $rrs->next();
  $row = $rs->next();
  echo("i_id = " . $row['ID'] . "<br />\n");
  foreach($row as $column){
    $tmp = $column;
    //echo($tmp . ", ");
  }
  $threshold = $row['ID'];
  $threshold++;
  //echo("<br />\n");
 
}
echo("done.<br />\n");

?>
