# Run OSvC Console From Command Line

Usually, OSvC's .NET console is started from a Windows shortcut, but *sometimes* you need to start it from the command line. One particular place where this comes in handy is when you need to debug non-workspace add-ins that load on login - if you start the console and then attach to the running process, it may be too late.

1. In Windows explorer, navigate to ```%appdata%\Local\Apps\2.0```
1. You'll see a bizarrely-named folder. Go into it.
1. You'll see a bizarrely-named folder. Go into it. (This is not a mistake. You need to do this twice. The names vary and are not predictable, otherwise I'd just tell you what they are.)
1. You'll see a bunch of folders in there, but the names aren't super-useful. Use Explorer to search for the site name you're interested in - e.g. "panera"
1. That should give you a few hits, and now you can see the site names. Right-click on one of the files for the correct site, and select "Open file location"
1. In that folder is the exe you need - RightNow.CX.exe. Right-click it and select "Properties"
1. In the properties window, the "Location" entry isn't editable, but it *is* copy-and-pastable. Copy it.

Your command line will look something like this: ```C:\Users\herbe\AppData\Local\Apps\2.0\4B8AQ1WY.RVR\40TTHRPB.Q7P\righ.._tst_671cc33169e294a1_0012.0008_489b1aefc36cad9f\RightNow.CX.exe uname=rnt_mwaldron pword=XXXXX dbname=panera--tst```

Where the exe path is the one you just copied to the clipboard. The "uname" and "pword" parameter are optional. The "dbname" parameter is required, and should match the name of the site.
