<?
namespace Custom\Models;

initConnectAPI();
use RightNow\Connect\v1_2 as RNCPHP;

class Insult extends \RightNow\Models\Base
{
    function __construct()
    {
        parent::__construct();
    }

	function getInts()
	{
		return array(1,2,3);
	}
	
    function getContactInfo($c_id)
    {
        /**
         * This function can be executed a few different ways depending on where it's being called:
         *
         * From a widget or another model: $this->CI->model('custom/Sample')->sampleFunction();
         *
         * From a custom controller: $this->model('custom/Sample')->sampleFunction();
         * 
         * Everywhere else: $CI = get_instance();
         *                  $CI->model('custom/Sample')->sampleFunction();
         */
		try {
			$contact = RNCPHP\Contact::fetch($c_id);
			// $contact->Emails[0]->Email->Address,
			return array($contact->ID, $contact->Name->First, $contact->Name->Last);
		}
		catch ( RNCPHP\ConnectAPIError $err )
		{
			logMessage("ConnectPHP exception in file: " . __FILE__ . ", line: " . __LINE__);
			logMessage("Exception code : " . $err->getCode() );
			logMessage("Exception message : " . $err->getMessage() );
		};
    }
}
