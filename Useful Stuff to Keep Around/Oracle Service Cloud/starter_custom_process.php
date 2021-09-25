<?
/*
 * CPMObjectEventHandler: rename_me
 * Objects: Incident
 * Actions: Create, Update
 * Version: 1.3
 */

// The "flower box" above is mandatory and its contents are significant. It
// looks like a comment, but it's not. Note:
// - Objects can be a comma-separated list of multiple objects. Custom objects
//   should be listed as e.g. "CO\Store"
// - Likewise, actions can be a comma-separated list of multiple actions.
// - Version refers to the Connect API version in play, not the SPM version.

// TODO:
//   1. Replace "rename_me" with an appropriate name. Match case, not whole
//      word, replace all
//   2. If you're not working on incidents, rename_me_TestHarness::fetchObject
//      will need to be updated accordingly
//   4. If you don't have Connect 1.3, roll back to 1.2

 // Run Modes (for reference):
 // 1 - RNCPM\RunModeLive
 // 2 - RNCPM\RunModeTestObject
 // 3 - RNCPM\RunModeTestHarness

 // Actions:
 // 1 - RNCPM\ActionCreate
 // 2 - RNCPM\ActionUpdate
 // 3 - RNCPM\ActionDestroy
 
use \RightNow\Connect\v1_3 as RNCPHP;
use \RightNow\CPM\v1 as RNCPM;

class rename_me implements RNCPM\ObjectEventHandler
{
    public static function apply ($run_mode, $action, $obj, $n_cycles)
    {
        // Content is here to provide a jumping-off spot for ROQL and CPHP
        // syntax. Remove or edit it as needed.
        
        try {
            // If the custom process isn't running live, just return. The run
            // mode is represented here as a literal integer because the ex-
            // ternal test script doesn't recognize the named constant.
            if ($run_mode != 1) // RNCPM\RunModeLive
                return;
            
            // The queryObject() syntax...on the same object
            $res = RNCPHP\ROQL::queryObject('SELECT Incident FROM Incident WHERE ID = ' . $obj->ID)->next();            
            while ($fetched_obj = $res->next()) {
                self::make_thread_entry($obj, 'queryObject update - Custom process ran; Subject is "' . $fetched_obj->Subject . '"');                
                $fetched_obj->save(RNCPHP\RNObject::SuppressAll);
            }

            // The query() syntax...again, on the same object
            $res = RNCPHP\ROQL::query('SELECT Subject FROM Incident WHERE ID = ' . $obj->ID)->next();
            while ($row = $res->next())
            {
                self::make_thread_entry($obj, 'query update - Custom process ran; Subject is "' . $row['Subject'] . '"');
                $obj->save(RNCPHP\RNObject::SuppressAll);            
            }            
        }
        catch (\Exception $ex) {
            // Getting debugging/exception details out of a custom process is tricky. For
            // Incidents, add a private note type thread entry (self::make_thread_entry)
            // For other objects, use an actual Note sub-object (self::make_note).
            RNCPHP\ConnectAPI::rollback();
            self::make_thread_entry($obj, "Custom process 'rename_me' hit an exception: " . $ex->getMessage());
            $obj->save(RNCPHP\RNObject::SuppressAll);
            RNCPHP\ConnectAPI::commit();
        }
    }
    
    public static function make_thread_entry(&$inc, $text)
    {
        $inc->Threads = new RNCPHP\ThreadArray();
        $inc->Threads[0] = new RNCPHP\Thread();
        $inc->Threads[0]->EntryType = new RNCPHP\NamedIDOptList();
        $inc->Threads[0]->EntryType->ID = 1; // private note
        $inc->Threads[0]->Text = $text;
    }
    
    public static function make_note(&$obj, $text)
    {
        $obj->Notes = new RNCPHP\NoteArray();
        $obj->Notes[0] = new RNCPHP\Note();
        $obj->Notes[0]->Text = $text;
    }
}

class rename_me_TestHarness implements RNCPM\ObjectEventHandler_TestHarness
{
    public static function setup()
    {
        return;
    }

    // This method must be here, and must return an object of the type the
    // custom process is expected to work on. If this custom process isn't
    // going to work on Incidents, change it to fetch the correct object
    // type.
    public static function fetchObject($action, $inc_type)
    {
        $res = RNCPHP\ROQL::query("SELECT MIN(ID) FROM Incident")->next();
        $row = $res->next();
        $min_i_id = $row['MIN(ID)'];
        printf("Min i_id is %d\n", $min_i_id);
        
        $res = RNCPHP\ROQL::queryObject("SELECT Incident FROM Incident WHERE ID = $min_i_id")->next();            
        $inc = $res->next();
        printf("ID, ref_no are %d, %s\n", $inc->ID, $inc->ReferenceNumber);

        return($inc);
    }

    public static function validate($action, $inc)
    {
        // Test harnesses work better in theory than they do in practice.
        // Just return true to indicate "test passed," and appease the 
        // process designer's requirements.
        return true;
    }

    public static function cleanup()
    {
        RNCPHP\ConnectAPI::rollback();
        return;
    }
}
