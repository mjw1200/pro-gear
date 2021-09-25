<?
require_once( get_cfg_var( 'doc_root' ).'/include/ConnectPHP/Connect_init.phph' );
initConnectAPI();
use RightNow\Connect\v1_2 as RNCPHP;

// For an EE, you have to open the input CSV file. You get $ee_file_name
// for free. The contents of the csv are determined by the template file
// connector/incident_csv.tmpl for incidents. The template file might
// look like
//
// |incidents.ref_no|,|incidents.c_id|,|incidents.i_id|
//
// and after this code block, those fields are available as $data[0], $data[1]
// and etc.
$fh = fopen($ee_file_name, 'r');
$data = fgetcsv($fh, 1024);
fclose($fh);
unlink($ee_file_name);

// Note ROQL uses dots
$roql_query = "SELECT Incident FROM Incident I WHERE I.ReferenceNumber = '" . $data[0] . "'";

// Note call to next() followed by call to next(). A Connect oddity, I guess.
$res = RNCPHP\ROQL::queryObject($roql_query)->next();
$inc = $res->next();

// Note PHP uses arrows
$inc->CustomFields->c->refno_datepart = intval(substr($data[0], 0, 6));
$inc->CustomFields->c->refno_serialpart = intval(substr($data[0], 7, 6));
$inc->save();
