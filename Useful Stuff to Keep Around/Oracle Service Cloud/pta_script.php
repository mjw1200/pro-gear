<?

// TODO: Update $baseURL, $ptaSecretKey, and $ptaDataArray with appropriate site values
$baseURL = 'https://servicesagaftra--tst1.custhelp.com/ci/pta/login/redirect/opa/sexual_harassment/p_li/';
$ptaSecretKey = 'ft673bf67f3hlf69312bvfa.fe3h';
$ptaDataArray = array(
  'p_email.addr' => 'jspovall@gmail.com',
  'p_userid'     => '2855501',
  'p_name.first' => 'John',
  'p_name.last'  => 'Povall',
  'p_passwd' => 'abc123', // If PTA_IGNORE_CONTACT_PASSWORD is "No," you'll need a real password
  // 'p_li_expiry' => time()+300 // Uncomment to expire link after some number of seconds
);

// Convert PTA data array to string
$ptaDataString = "";
foreach($ptaDataArray as $key=>$value){
    $ptaDataString .= ($ptaDataString === "") ? '' : '&';
    $ptaDataString .= "$key=$value";
}

printf("Raw PTA string: $ptaDataString\n");

// Unencrypted PTA
// $ptaDataString = base64_encode($params);
// Encrypted PTA. Base-64 encoding is not necessary here
$ptaDataString = openssl_encrypt($ptaDataString, 'AES-256-CBC', $ptaSecretKey);

$ptaDataString = strtr($ptaDataString, array('+' => '_', '/' => '~', '=' => '*'));
printf("\nURL: %s%s\n", $baseURL, $ptaDataString);