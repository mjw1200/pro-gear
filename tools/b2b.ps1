Start-IISCommitDelay
Remove-IISSite -Name "B2B" -Confirm:$false
$site = New-IISSite -Name "B2B" -PhysicalPath "C:\projects\insite-commerce\Legacy\InsiteCommerce.Web" -BindingInformation "*:3010:" -PassThru
$site.Applications["/"].ApplicationPoolName = "B2B"
New-IISSiteBinding -Name "B2B" -BindingInformation "*:80:commerce.local.com" -Protocol http
Stop-IISCommitDelay