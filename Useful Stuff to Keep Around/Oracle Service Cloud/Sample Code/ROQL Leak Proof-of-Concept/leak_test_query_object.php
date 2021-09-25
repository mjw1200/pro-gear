<?
$ip_dbreq = true;
require_once('include/init.phph');

// ---------- ConnectPHP --------------------------
require_once( get_cfg_var('doc_root').'/ConnectPHP/Connect_init.php');
initConnectAPI();
use RightNow\Connect\v1_2 as RNCPHP;
// ---------- ConnectPHP --------------------------

function obj_to_pairs($obj)
{
   $obj_fields = get_class_vars(get_class($obj));
   $obj_pairs = array();
   foreach ($obj_fields as $name => $value) {
       if ($name != "_metadata") {
           $class = get_class($obj->$name);
           $obj_pairs[$name] = obj_to_pairs($obj->$name);
           if (strpos($class, "NamedID") === false ) {
               if (!is_object($obj->$name)) {
                   $obj_pairs[$name] = $obj->$name;
               }
           }
           else {
               $obj_pairs[$name] = $obj->$name->ID;
           }
       }
   }
   return $obj_pairs;
}


try{
$threshold = 0;
$ROQL_query_template = "SELECT Incident FROM Incident WHERE ID > %s ORDER BY ID LIMIT 1";

$row = RNCPHP\ROQL::query("SELECT MAX(ID) AS MAX FROM Incident")->next()->next();
$max = $row['MAX'];
echo("starting to churn. . . <br />\n");

while($threshold < $max){
  $ROQL_query_final = sprintf($ROQL_query_template, $threshold);
  //echo($ROQL_query_final . "<BR />");
  $rrs = RNCPHP\ROQL::queryObject($ROQL_query_final);
  $rs = $rrs->next();
  $incident = $rs->next();
  echo("i_id = " . $incident->ID . "<br />\n");
  //print_r(obj_to_pairs($incident) );
  // calling this without doing anything just to traverse the object
  $foo = obj_to_pairs($incident);
  $threshold = $incident->ID;
  $threshold++;
  //echo("<br />\n");
 
}

}
catch (Exception $e){
   echo($e->getMessage() . "<br />\n");
   die("fall on your sword!");
}

echo("done.<br />\n");

?>
