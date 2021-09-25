CP3:
------------------------------------------------------------------------------
(All paths are relative to /scripts/cp/customer/development/)

1. Upload splash.php to /views/pages. (The customer may prefer you use a
   different splash page. That's fine, as long as it's called 'splash.php')
2. Make a copy of cp3_splash_model.php, named 'splash_model.php'
3. Edit splash_model.php. Add the IP addresses/ranges/masks the customer
   needs for testing to the arrays $valid_ips/$ranges/$masks 
4. Upload splash_model.php to /models/custom
5. Append the hook entry in hook_code.php to /config/hooks.php. (You probably
   don't want to clobber hooks.php.)
6. Stage and promote your changes (<vhost>/ci/admin)
7. Set CP_HOME_URL to 'splash'

When the customer's done testing:
1. Set CP_HOME_URL back to whatever it was (probably 'home')
2. Remove the hook entry you added to /config/hooks.php
3. Remove /models/custom/splash_model.php
4. Stage and promote your changes

CP2:
------------------------------------------------------------------------------
(All paths are relative to /scripts/euf/application/development/source)

1. Upload splash.php to /views/pages. (The customer may prefer you use a
   different splash page. That's fine, as long as it's called 'splash.php')
2. Make a copy of cp2_splash_model.php, named 'splash_model.php'
3. Edit splash_model.php. Add the IP addresses/ranges/masks the customer
   needs for testing to the arrays $valid_ips/$ranges/$masks 
4. Upload splash_model.php to /models/custom
5. Append the hook entry in hook_code.php to /config/hooks.php. (You probably
   don't want to clobber hooks.php.)
6. Stage and promote your changes (<vhost>/ci/admin)
7. Set CP_HOME_URL to 'splash'

When the customer's done testing:
1. Set CP_HOME_URL back to whatever it was (probably 'home')
2. Remove the hook entry you added to /config/hooks.php
3. Remove /models/custom/splash_model.php
4. Stage and promote your changes


