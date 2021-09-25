<?

$dir="/tmp/foo";

if (!(file_exists($dir) && is_dir($dir)))
{
	mkdir($dir, 0775);
	chown($dir, "nonpriv:rnwpriv");
}

// do useful stuff...