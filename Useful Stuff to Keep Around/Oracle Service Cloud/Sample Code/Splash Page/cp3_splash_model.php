<?php
namespace Custom\Models;

class Splash_model extends \RightNow\Models\Base 
{
    function Splash_model()
    {
        parent::__construct();
        //This model would be loaded by using $this->load->model('custom/Splash_model');
    }

    function splash()
    {
		//do a splash page check
		$CI = get_instance();
		$home = getConfig(CP_HOME_URL);
		$ip = $_SERVER['REMOTE_ADDR'];
		logMessage("IP Addr: $ip");

		//add static ips here Ex: '10.96.220.126'
		$valid_ips = array();

		//add ip ranges with cidr prefixes here Ex: '80.169.47.224/27'
		$ranges = array();

		//add ip ranges with a decimal netmask here Ex: '148.243.185.192/255.255.255.224'
		$masks = array();

		//change netmask to cidr
		foreach($masks as $mask)
		{
			@list($mask_address, $netmask) = explode('/', $mask);
			$cidr = 0;
			foreach (explode('.', $netmask) as $number) 
			{
				for (;$number> 0; $number = ($number <<1) % 256) 
				{	
					$cidr++;
				}
			}
			$ranges[] = $mask_address."/".$cidr;
		}

		//get ip ranges 
		foreach($ranges as $range)	
		{
			@list($address, $len) = explode('/', $range);

			if(($min = ip2long($address)) !== false)
			{
				$max = ($min | (1<<(32-$len))-1);
				for ($i = $min; $i < $max; $i++)
					$valid_ips[] = long2ip($i);
			}
		}

		if(in_array($ip, $valid_ips))
			$allow = true;

		//redirect invalid ips to splash page
        if($home === "splash" && $CI->page !== "splash" && $allow !== true)
        {
            header("Location: /app/splash");
            die;
        }
		//redirect valid ips to home page
		elseif($home === "splash" && $CI->page === "splash" && $allow === true)
		{
			header("Location: /app/home");
			die;
		}
    }
}    
