<?php
    $url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/organizations';
    $curl = curl_init($url);
                       
    $curl_post_data = "{
                            \"name\": \"TestOrgName\"
                       }";
  
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_USERPWD, "<username>:<password>");
    curl_setopt($curl, CURLOPT_POST, true);
    curl_setopt($curl, CURLOPT_POSTFIELDS, $curl_post_data);
    $curl_response = curl_exec($curl);
    curl_close($curl);
    
    echo $curl_response;
 
?>