<?php
namespace Custom\Models;

use RightNow\Connect\v1_3 as RNCPHP; // Or v1_1. Or v1 as needed.

class Pta extends \RightNow\Models\Base
{
    function __construct()
    {
        parent::__construct();
    }

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
    function lookupAndPopulate(&$hookData)
    {
        \RightNow\Utils\Framework::logMessage("Your hookData is " . print_r($hookData, true));
        
        if (isset($hookData['data']['decodedData']['p_ccf_1']))
        {
            // \RightNow\Utils\Framework::logMessage('Looks like your custom field value is ' . $hookData['data']['decodedData']['p_ccf_1'] . '. I would lookup!');
            
            try{
                $res = RNCPHP\ROQL::queryObject('SELECT Contact FROM Contact WHERE CustomFields.c.account_id = \'' . $hookData['data']['decodedData']['p_ccf_1'] . '\'')->next();
                $contact = $res->next();
                
                unset($hookData['data']['decodedData']['p_ccf_1']);
                $hookData['data']['decodedData']['p_userid'] = $contact->Login;
                $hookData['data']['decodedData']['p_first_name'] = $contact->Name->First;
                $hookData['data']['decodedData']['p_last_name'] = $contact->Name->Last;
                $hookData['data']['decodedData']['p_passwd'] = 'password12345';   

                \RightNow\Utils\Framework::logMessage("Now, your hookData is " . print_r($hookData, true));
            }
            catch (\Exception $err){
                \RightNow\Utils\Framework::logMessage('Caught this exception: ' . $err->getMessage());
            }        
        }
    }
}