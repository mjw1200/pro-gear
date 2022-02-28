# Update main branches
#
# Progression is dev -> cloud-rc -> cloud-release. Code in dev eventually ends up in cloud-rc and
# then cloud-release; code in cloud-rc eventually ends up in cloud-release.
Set-Location c:\projects\insite-commerce
git checkout cloud-release
git pull
git checkout cloud-rc
git pull
git checkout dev
git pull

Stop-IISSite -Confirm:$false -Name "B2B"
Stop-IISSite -Confirm:$false -Name "DevTools"

# Publish DevTools
Set-Location c:\projects\insite-commerce\Src\Devtools
dotnet publish

Start-IISSite B2B
Start-IISSite DevTools

Write-Output ""
Write-Output "You still have to build in VS2022. Haven't figured that part out yet."

# Build InsiteCommerce.Web
# Set-Location c:\projects\insite-commerce\Legacy
# dotnet build InsiteCommerce.sln

Set-Location c:\projects