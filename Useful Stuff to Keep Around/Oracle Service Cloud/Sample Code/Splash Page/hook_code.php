<?php
// Add the following $rnHooks array to the end of config/hooks.php.
// (You probably don't want to clobber hooks.php.)
$rnHooks['pre_page_render'] = array(
	'class' => 'Splash_model',
	'function' => 'splash',
	'filepath' => ''
   );
