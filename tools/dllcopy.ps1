$dest = "C:\projects\insite-commerce\Legacy\InsiteCommerce.Web\bin"
Remove-Item -Path $dest\*.dll

$dlls = Get-ChildItem -Path insite-commerce -Recurse -Include *.dll -Name

ForEach($dll in $dlls) {
  # Write-Output "Full Monty: " $dll
  $source = "C:\projects\insite-commerce\" + $dll
  Copy-Item $source -Destination $dest -Force -Confirm:$False
}