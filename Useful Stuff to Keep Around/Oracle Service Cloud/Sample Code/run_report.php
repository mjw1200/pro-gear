<?
// This use statement can't go inside the else block. Interesting.
use RightNow\Connect\v1_2 as RNCPHP; // Or v1_1. Or v1 as needed.

if (!isset($_POST['filter_value'])) {
?>
<html>
	<body>
		<form name="filter_entry" method="post" action="">
			Filter text:
			<input type="text" name="filter_value">
			<input type="submit">
		</form>
	</body>
</html>
<?
}
else {
	$doc_root = get_cfg_var( 'doc_root' );
	// SSAC is on, gotta use agent authenticator...
	require_once( $doc_root . '/include/services/AgentAuthenticator.phph' );
	AgentAuthenticator::authenticateCredentials('mjw', '...');

	require_once( $doc_root . '/include/ConnectPHP/Connect_init.phph' );
	initConnectAPI();
	
	$filter_value = $_POST['filter_value'];
	// printf("<p>Your filter value was '" . $filter_value . "'");

	// Switch up the filters on the report as requested
	$status_filter= new RNCPHP\AnalyticsReportSearchFilter;
	$status_filter->Name = 'SubjectFilter';
	$status_filter->Values = array( '%' . $filter_value . '%' );
	$filters = new RNCPHP\AnalyticsReportSearchFilterArray;
	$filters[] = $status_filter;

	// Fetch the report
	try {
		// Run the report with the changed filters
		$ar= RNCPHP\AnalyticsReport::fetch(100001);
		$arr= $ar->run(0, $filters);
	}
	catch (Exception $e) {
		printf("<p>Caught an exception.</p>");
		exit(-1);
	}
?>
	<table border="1">
	<thead><td>RefNo<td>Subject</thead>
<?
	// This array is 1-based
	for ( $ii = 1; $ii <= $arr->count(); $ii++ ) {
		$row=$arr->next();
		// Associative array keys are the column labels
		?><tr><td><?= $row['RefNo']?><td><?= $row['Subject']?></tr><?
	} 
?>
	</table>
<?
}
