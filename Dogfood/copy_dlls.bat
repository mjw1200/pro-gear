@echo off
del C:\projects\dogfood2\src\InsiteCommerce.Web\bin\Insite.PaymentGateway.Adyen.dll
del C:\projects\dogfood2\src\InsiteCommerce.Web\bin\Insite.PaymentGateway.AuthorizeDotNet.dll
del C:\projects\dogfood2\src\InsiteCommerce.Web\bin\Insite.PaymentGateway.Elavon.dll

copy /Y C:\projects\insite-commerce\Src\Backend\bin\net48\Insite.PaymentGateway.Adyen.dll C:\projects\dogfood2\src\InsiteCommerce.Web\bin\
copy /Y C:\projects\insite-commerce\Src\Backend\bin\net48\Insite.PaymentGateway.AuthorizeDotNet.dll C:\projects\dogfood2\src\InsiteCommerce.Web\bin\
copy /Y C:\projects\insite-commerce\Src\Backend\bin\net48\Insite.PaymentGateway.Elavon.dll C:\projects\dogfood2\src\InsiteCommerce.Web\bin\
