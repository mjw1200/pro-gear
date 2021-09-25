<?
$ip_dbreq = true;
require_once('include/init.phph');

// connector/incident_csv.tmpl:
//
// |incidents.ref_no|, |incidents.i_id|

$fh = fopen($ee_file_name, 'r');
$data = fgetcsv($fh, 1024);
fclose($fh);
unlink($ee_file_name);

$refno = $data[0];
$datepart = intval(substr($data[0], 0, 6));
$serialpart = intval(substr($data[0], 7, 6));

// You may need to update the cf_ids and etc. depending on the site
$pairdata['custom_field']['cf_item1'] = array('cf_id' => 1, 'data_type' => 3, 'val_int' => $datepart); // c$refno_datepart
$pairdata['custom_field']['cf_item2'] = array('cf_id' => 2, 'data_type' => 3, 'val_int' => $serialpart); // c$refno_serialpart
$pairdata['source_upd']['lvl_id1'] = intval(SRC1_PUB_API);
$pairdata['source_upd']['lvl_id2'] = intval(SRC2_PUB_API_EE);
$pairdata['updated_by'] = 3; // hard-coded for one specific site, FYI...
$pairdata['i_id'] = intval($data[1]);

incident_update($pairdata);