////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: Events.cs
//
// Comments: Illustrates add-ins triggered by system console open and close events
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
    [AddIn("Console Open Event Add-In", Version="1.0.0.0")]
    public class ConsoleOpenEventAddIn : IEventConsoleOpen
    {
        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            MessageBox.Show("Console is ready to open.");
            return true;
        }

        #endregion
    }

    [AddIn("Console Close Event Add-In", Version = "1.0.0.0")]
    public class ConsoleCloseEventAddIn : IEventConsoleClose
    {
        #region IEventConsoleClose Members

        public void Notify(CloseReason reason)
        {
            MessageBox.Show("Console closing, reason: " + reason.ToString());
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            return true;
        }

        #endregion
    }
}
