<?php
    $url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/metadata-catalog/contacts';
    $curl = curl_init($url);
    $headers = array(
        'accept: application/schema+json',
    );

    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_USERPWD, "<username>:<password>");
    curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);

    $curl_response = curl_exec($curl);
    curl_close($curl);
    
    echo $curl_response;
 
?>