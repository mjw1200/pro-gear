<?
// AgentAuthenticator calls initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
// use RightNow\Connect\v1_2 as RNCPHP;
use RightNow\Connect\v1_1 as RNCPHP;

// Go!
if (isset($_POST['Submit']))
{
    $res = RNCPHP\ROQL::query("SELECT max(ID) FROM Incident")->next();
    while($i = $res->next()) {
        $max_i_id = $i['max(ID)'];
    }

    $res = RNCPHP\ROQL::query("SELECT count(ID) FROM Incident")->next();
    while($i = $res->next()) {
        $num_incidents = $i['count(ID)'];
    }
?>

    <p>Max i_id appears to be _<?=$max_i_id?>_
    <p>It looks like there are _<?=$num_incidents?>_ incidents in the DB

<?
    if ($num_incidents < 5) {
?>
        <p>Not enough incidents in the DB, sorry
<?
    }
    else
    {
?>
        <p>Sufficient incidents are present in the DB, subjects are
        <ul>
<?
        $printed_subject_count = 0;
        $i_id = $max_i_id;
        while ($printed_subject_count < 5) {
            $res = RNCPHP\ROQL::query("SELECT Subject FROM Incident WHERE ID = " . $i_id)->next();
            $i = $res->next();
            $i_id -= 1;
            if (is_null($i))
                continue;
            $printed_subject_count += 1;
            ?><li><?
            echo $i['Subject'];
        }
    }
?>
    </ul>
<?
}
else
{
?>
<form action="" method="POST">
	<fieldset>
		<legend>Login</legend>
		<input type="hidden" name="submitted" id="submitted" value="1"/>
		<label for="username" >Username*:</label>
		<input type="text" id="username" name="username" maxlength="50" />
		<label for="password" >Password*:</label>
		<input type="password" name="password" id="password" maxlength="50" />
		<input type="submit" name="Submit" value="Log In" />
	</fieldset>
</form>
<?
}
?>