<?php
    //return all contacts
    $url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/contacts/';
    
    //return a specific contact by id (1 is used below)
    //$url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/contacts/1';
    
    //return a specific contact by id (1 is used below) and expand all the fields
    //$url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/contacts/1?expand=all';
    
    $curl = curl_init($url);
  
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_USERPWD, "<username>:<password>");

    $curl_response = curl_exec($curl);
    curl_close($curl);
    
    echo $curl_response;
 
?>