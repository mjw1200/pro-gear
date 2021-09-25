<html>
  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
  </head>
  <body>

<?
  $dir = $_POST["dir"];
  if (!isset($dir))
    $dir = "/";
?>

    <p id="path">Path is <?=$dir?></p>
    <ul id="names">

<?
  $entries = scandir($dir);
    foreach ($entries as $entry) {
      if ($entry !== "." && is_dir($dir . "/" . $entry)) {
        ?><li> <a class="linkadoo" href="#"><?=$entry?></a><?
      }
      else {
        ?><li> <?=$entry?><?
      }
    }
?>

    </ul>
    
    <script>
      var dir = "<?=$dir?>";

      $(".linkadoo").click(function(event) {
        event.preventDefault();

        let components = dir.split("/");
        let stop = components.length;
        var noopath = "/";
        let i = 0;

        if (event.target.innerText === "..") {
          stop--;
        }

        while (i < stop) {
          if (components[i].length > 0)
            noopath += components[i] + "/";
          i++;
        }

        if (event.target.innerText !== "..") {
          noopath += event.target.innerText;
        }

        if (noopath.length > 1 && noopath[noopath.length-1] === "/") {
          noopath = noopath.substring(0, noopath.length-1);
        }

        $.post("osc_changeroot_browser.php", { dir : noopath }, function(data) {
          document.close();
          document.write(data);
        })
      })
    </script>
  </body>
</html>
