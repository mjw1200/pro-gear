<rn:meta title="Your Mom" template="standard.php" />

<div id="rn_PageTitle" class="rn_AskQuestion">
    <h1>Jokes About Your Mother</h1>
</div>
<div id="rn_PageContent" class="rn_AskQuestion">
	<ul>
	<li>Yo mama so fat she eat wheat thicks.
	<li>Yo mama so fat, when she sit around the house, she SIT AROUND THE HOUSE, dog
	<li>Yo mama so dumb she read the ingredients in commodity rice
	</ul>
	<h2>c_id == 1</h2>
	<p>This should work:<br>
	<? 
	$CI = get_instance();
	list($id, $first, $last) = $CI->model('custom/Insult')->getContactInfo(1);
	printf("%d<br>%s<br>%s<br>", $id, $first, $last);
	// list($one, $two, $three) = $CI->model('custom/Insult')->getInts();
	// printf("%d%d%d", $one, $two, $three);
	?>
	<h2>c_id == 2</h2>
	<p>This should fail:	
	<?
	list($id, $first, $last) = $CI->model('custom/Insult')->getContactInfo(2);
	printf("%d<br>%s<br>%s<br>", $id, $first, $last);
	?>
</div>
