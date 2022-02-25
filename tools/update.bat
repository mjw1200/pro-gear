@REM :: Build InsiteCommerce.Web
@REM echo -----^> Step 1
@REM cd c:\projects\insite-commerce\Legacy
@REM echo -----^> Step 2
@REM call dotnet msbuild InsiteCommerce.sln

:: Install npm packages for Spire
echo -----^> Step 3
cd c:\projects\insite-commerce\FrontEnd
echo -----^> Step 4
call npm install

:: Configure and start B2B
echo -----^> Step 4
cd C:\projects\insite-commerce\Legacy\Insite.SystemResources\
echo -----^> Step 5
call npm install
echo -----^> Step 6
call npx grunt build
echo -----^> Step 7
powershell c:\projects\insite-commerce\scripts\resetDatabase.ps1
echo -----^> Step 8
powershell c:\projects\b2b.ps1

:: Publish and start DevTools
echo -----^> Step 9
cd c:\projects\insite-commerce\Src\Devtools
echo -----^> Step 10
call dotnet publish
echo -----^> Step 11
powershell c:\projects\devtools.ps1

echo -----^> Step 12
cd c:\projects\