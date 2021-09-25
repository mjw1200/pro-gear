////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: Events.cs
//
// Comments: Illustrates add-ins triggered by system login and logout events
//
// Notes: 
//
// Pre-Conditions: 
//          1. You must have enabled add-ins for the appropriate profile
//          2. You must have uploaded the compiled .dll to the RightNow server
//
////////////////////////////////////////////////////////////////////////////////

using System;
using System.AddIn;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RightNow.AddIns.AddInViews;

namespace AddInSamples.Events
{
    [AddIn("Logout Event Add-In", Version="1.0.0.0")]
    public class LoginEventAddIn : IEventLogin
    {

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            MessageBox.Show("Staff Account: " + context.Login + " is logging in.");

            return true;
        }

        #endregion
    }

    [AddIn("Logout Event Add-In", Version = "1.0.0.0")]
    public class LogoutEventAddIn : IEventLogout
    {
        private IGlobalContext _globalContext;

        #region IEventLogout Members

        public void Notify()
        {
            MessageBox.Show("Staff account: " + _globalContext.Login + " is logging out.");
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            return true;
        }

        #endregion
    }
}