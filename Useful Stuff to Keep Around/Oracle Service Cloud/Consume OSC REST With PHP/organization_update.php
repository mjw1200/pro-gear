<?php
    //this will update the organization with an id of 1
    $url = 'https://waymediainc--tst.custhelp.com/services/rest/connect/v1.3/organizations/1';
    $curl = curl_init($url);
    
    $headers = array(
        'X-HTTP-Method-Override: PATCH',
    );
    
    //all fields specified in the post data are updated, all other fields remain the same
    $curl_post_data = "{
                        \"name\": \"testOrgUpdate\"
                        }";
  
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_USERPWD, "<username>:<password>");
    curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
    curl_setopt($curl, CURLOPT_POST, true);
    curl_setopt($curl, CURLOPT_POSTFIELDS, $curl_post_data);
    $curl_response = curl_exec($curl);
    curl_close($curl);
    
    echo $curl_response;
 
?>