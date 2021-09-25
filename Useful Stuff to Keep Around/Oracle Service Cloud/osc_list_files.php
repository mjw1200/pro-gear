<ul>
<?
function recurse($dir) {
  $entries = scandir($dir);

  if ($dir === "/")
    $dir = "";

  foreach ($entries as $entry) {
    if (!($entry === "." || $entry === ".." || $entry === "cgi-bin")) {
      ?><li><?=$dir?>/<?=$entry?><?
      if (is_dir($dir . "/" . $entry))
        recurse($dir . "/" . $entry);
    }
  }
}

recurse("/");
?>
</ul>