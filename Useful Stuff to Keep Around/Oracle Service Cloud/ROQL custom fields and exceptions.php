<?
// ...various setup stuff would go here

    try {
        // Query an Org custom field whose column name is "company_idnew"                
        $org_info = RNCPHP\ROQL::query( "SELECT O.CustomFields.c.company_idnew FROM Organization O WHERE O.ID = " . $org->CustomerOrg_ID->ID )->next()->next();
        // logMessage, always handy
        \RightNow\Utils\Framework::logMessage("BLAM! Looks like everything's fine: " . print_r($org_info, true));
        // The array index is just the custom field column name
        $company_id = $org_info['company_idnew'];
    }
    // Catching "Exception $ex" didn't work - I had to catch ConnectAPIError
    catch (RNCPHP\ConnectAPIError $ex) {
        \RightNow\Utils\Framework::logMessage("BLAM! This uxception hoppened: " . $ex->GetMessage());
    }   

// ...other stuff would probably go here