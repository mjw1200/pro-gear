<?php
    //return all organizations
    $url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/organizations';
    
    //return a specific organization by id (1 is used below)
    //$url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/organizations/1';
    
    //return a specific organization by id (1 is used below) and expand all fields
    //$url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/organizations/1?expand=all';
    
    $curl = curl_init($url);
  
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_USERPWD, "<username>:<password>");

    $curl_response = curl_exec($curl);
    curl_close($curl);
    
    echo $curl_response;
 
?>