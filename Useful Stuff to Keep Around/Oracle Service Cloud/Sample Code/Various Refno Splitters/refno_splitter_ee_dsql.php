<?
$ip_dbreq = true;
require_once('include/init.phph');

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

$refno = $data[0];
$datepart = intval(substr($data[0], 0, 6));
$serialpart = intval(substr($data[0], 7, 6));

$query = 'UPDATE incidents SET c$refno_datepart = ';
$query .= "$datepart";
$query .= ', c$refno_serialpart = ';
$query .= "$serialpart";
$query .= ' WHERE ref_no = ';
$query .= "'$refno'";

sql_exec_direct($query);