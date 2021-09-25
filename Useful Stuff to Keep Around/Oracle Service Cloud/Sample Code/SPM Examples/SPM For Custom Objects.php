<?
// Package: Means the package that the SPM is in, not the CO package (if you're using COs)
// Objects: For COs, objects require the package prefix, so CO\Adult instead of just Adult. Otherwise you get an opaque error that says "Event Handler Content must support at least one class." Note comma-separated list of objects. This one SPM can be associated to both CO\Adult and CO\Student objects.
// Actions: Note comma-separated list of actions. This SPM can be associated to both Create and Update actions on its objects.
// Version: Refers to the CCOM version in play, not the SPM version.

// **DEPLOY**: It's pretty non-obvious, but SPM changes have to be deployed before they'll take effect. You can test a non-deployed SPM, but it won't actually run on live objects until it's been deployed.

/*
 * CPMObjectEventHandler: full_name_setter
 * Package: RN
 * Objects: CO\Adult,CO\Student
 * Actions: Create,Update
 * Version: 1.2
 */

// This is the Connect version you're going to use. Up to v1_2 is available.
use \RightNow\Connect\v1_2 as RNCPHP;
// This is the *CPM* version you're going to use. So far, just v1 is available.
use \RightNow\CPM\v1 as RNCPM;

//----------------------------------------------------------------------------
// full_name_setter
class full_name_setter implements RNCPM\ObjectEventHandler
{
	//---------------------------------
	// apply
	//
	// Does the real work of the SPM
	public static function apply ($run_mode, $action, $obj, $n_cycles)
	{
		// $obj is either a CO\Adult or a CO\Student, because that's what we
		// declared in the header-that's-not-a-comment. Both objects have
		// fields named full_name, first_name, and last_name, so no type
		// differentiation is needed here.
		$obj->full_name = $obj->first_name . ' ' . $obj->last_name;
		$obj->save();
	}
}

//----------------------------------------------------------------------------
// full_name_setter_TestHarness
//
// Note the use of a static object created here specifically for testing. We
// could retrieve one from the DB, but this is a little neater and more unit-
// test proper.
class full_name_setter_TestHarness implements RNCPM\ObjectEventHandler_TestHarness
{
	static $test_adult = NULL;
	
	//---------------------------------
	// setup
	//
	// Create and initialize the static object for testing
    public static function setup()
    {
		$adult = new RNCPHP\CO\Adult;
        $adult->first_name = "Zosh";
        $adult->last_name = "Happagrinder";
        $adult->save();
      
        self::$test_adult = $adult;

        return;
	}

	//---------------------------------
	// fetchObject
	//
	// "Get" the object to test. In this case, we're just retirning the static
	// object that was initialized by setup()
    public static function fetchObject($action, $object_type)
    {
        return(self::$test_adult);
    }

	//---------------------------------
	// validate
	//
	// Validates the work of full_name_setter::apply(). Return true if the
	// test passes, false otherwise.
    public static function validate($action, $obj)
    {
	    if ($obj->full_name == 'Zosh Happagrinder')
			return(true);
		else
			return(false);
    }

	//---------------------------------
	// cleanup
	//
	// Leave no tracks.
    public static function cleanup()
    {
		self::$test_adult->destroy();
		self::$test_adult = NULL;
        return;
    }
}
