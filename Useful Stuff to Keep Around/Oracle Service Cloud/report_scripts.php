<?
// Report scripts are a monumental pain in the ass. They have a weird syntax, and the documentation
// is pretty lousy. Here's a guide.

// -- Initialization --
// Mostly good for declaring global variables. This script runs once per report.
$servicingTime = 0;

// -- Headers -- 
// I've never actually used the headers script, but I imagine its use is similar to the Process
// script below.
function rn_analytics_process_headers($headers) {
  // ?
  return $headers;
}

// -- Process --
// This function runs for each row, but you can only access the "current" row, so you're always
// using $row[0]. Note the "->val", which is bizarre, but necessary. Don't forget to include
// the "global" declaration if you're referring to a global variable. Fuck PHP and this weirdness.
// Only the rows marked "custom" below are available to edit
function rn_analytics_process_rows($rows) {
  global $servicingTime; // custom
  $servicingTime += $rows[0][5]->val; // custom
  
  return ($rows);
}

// -- Finish --
// This is the weirdest one of all. This function runs after all report rows have been processed.
// Only the rows marked "custom" below are available to edit. This example adds one additional
// row to the end of the report. It has six fields, and they're all null with the exception of
// the last field, which gets the summed value of $servicingTime
function rn_analytics_process_exit()
{
  $exit_obj = array();

  $row = array(array(null, null, null, null, null, null)); // custom
  $row[0][5]->val = $servicingTime; // custom
  $exit_obj = $row; // custom

  return $exit_obj;
}