cd c:\projects\insite-commerce
git checkout dev
git pull

:: Build InsiteCommerce.Web
cd c:\projects\insite-commerce\Legacy
call dotnet msbuild InsiteCommerce.sln

:: Publish and start DevTools
cd c:\projects\insite-commerce\Src\Devtools
call dotnet publish

cd c:\projects
powershell c:\projects\dllcopy.ps1

echo "Woof"

@REM :: Install npm packages for Spire
@REM cd c:\projects\insite-commerce\FrontEnd
@REM call npm install

@REM :: Configure and start B2B
@REM cd C:\projects\insite-commerce\Legacy\Insite.SystemResources\
@REM call npm install
@REM call npx grunt build
@REM powershell c:\projects\insite-commerce\scripts\resetDatabase.ps1
@REM powershell c:\projects\b2b.ps1
@REM powershell c:\projects\devtools.ps1

@REM cd c:\projects\