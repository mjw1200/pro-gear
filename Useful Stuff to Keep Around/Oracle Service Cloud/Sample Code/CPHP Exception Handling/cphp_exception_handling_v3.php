<?
// ...

try {
  // attempt to do something useful
}
catch ( RNCPHP\ConnectAPIError $err )
{
	phpoutlog("ConnectPHP exception in file: " . __FILE__ . ", line: " . __LINE__);
	phpoutlog("Exception code : " . $err->getCode() );
	phpoutlog("Exception message : " . $err->getMessage() );
};

// ...
