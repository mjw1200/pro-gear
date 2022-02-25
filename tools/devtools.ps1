Start-IISCommitDelay
Remove-IISSite -Name "DevTools" -Confirm:$false
$site = New-IISSite -Name "DevTools" -PhysicalPath "C:\projects\insite-commerce\Src\DevTools\bin\Debug\net5.0\publish\" -BindingInformation "*:4000:" -PassThru
$site.Applications["/"].ApplicationPoolName = "DevTools"
Stop-IISCommitDelay