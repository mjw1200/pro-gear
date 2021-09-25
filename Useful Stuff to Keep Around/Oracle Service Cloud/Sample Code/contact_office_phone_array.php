<?
use RightNow\Connect\v1_2 as RNCPHP;
// SSAC is on, gotta use agent authenticator...it'll call initConnectAPI() for us.
require_once( get_cfg_var( 'doc_root' ) . '/include/services/AgentAuthenticator.phph' );
AgentAuthenticator::authenticateCredentials('mjw', 'ZReYbP2g3pVVx2nfbipQ');

$res = RNCPHP\ROQL::queryObject('SELECT Contact FROM Contact C WHERE C.ID = 2')->next();
?><ul><?
while ($acc = $res->next())
{
	?>
	<li>First: <?= $acc->Name->First?>
	<li>Last: <?= $acc->Name->Last?>
	<li>Mobile Phone: 
		<? $i = 0;
			$found = false;
			
			while ($i < count($acc->Phones))
			{
				if ($acc->Phones[$i]->PhoneType->LookupName == 'Mobile Phone')
				{
					$found = true;
					break;
				}
				$i++;
			}
			if ($found)
				print($acc->Phones[$i]->RawNumber);
			else
				print("???");
			?>
	<li>Zero Phone: <?= $acc->Phones[0]->RawNumber ?>
	<?
}
?></ul>
