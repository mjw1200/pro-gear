<?
// ---------------------------------------------------------------------------
// custom_fields_attrs.php
//
// This isn't a functional script - most of the code has been stripped out for
// clarity to illustrate the syntax for accessing custom fields and custom/
// system attributes in all Connect versions.
//
// Assumes the existence of an incident custom field named "custom_field," and
// an incident custom/system attribute named "custom_attr" that lives in the
// default CO package.
// ---------------------------------------------------------------------------

// ...

// use RightNow\Connect\v1 as RNCPHP;
// use RightNow\Connect\v1_1 as RNCPHP;
use RightNow\Connect\v1_2 as RNCPHP;

// ...

    $roql_query = "SELECT Incident FROM Incident I WHERE I.ReferenceNumber = '140415-000000'";
    $res = RNCPHP\ROQL::queryObject($roql_query)->next();
    $inc = $res->next();
    
    // Connect 1
    // echo '<p>Custom field: ' . $inc->CustomFields->custom_field;
    // echo '<p>(Custom attributes are not supported in Connect 1)';
    
    // Connect 1.1
    // echo '<p>Custom field: ' . $inc->CustomFields->custom_field;
    // echo '<p>Custom attribute: ' . $inc->CustomAttributes->CO->custom_attr;
    
    // Connect 1.2
    echo '<p>Custom field: ' . $inc->CustomFields->c->custom_field;
    echo '<p>System attribute: ' . $inc->CustomFields->CO->custom_attr;

// ...