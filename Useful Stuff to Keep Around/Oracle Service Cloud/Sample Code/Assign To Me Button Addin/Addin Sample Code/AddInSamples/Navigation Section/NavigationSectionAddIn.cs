////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: ReportDashboardAddIn.cs
//
// Comments: A sample dashboard add-in that displays a picture box on the report dashboard. The picture box URL 
//           can be set through the add-in manager configuration property.
//
// Notes: 
//          You must add this item to a dashboard report
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

namespace AddInSamples.Navigation_Section
{
    public class NavigationSectionAddIn : INavigationSection2
    {
        private LaunchNotePadUserControl _launchControl;

        public NavigationSectionAddIn(bool inDesignMode)
        {
            if (inDesignMode == false)
            {
                _launchControl = new LaunchNotePadUserControl();
                _launchControl.LaunchNotepadClicked += new LaunchNotePadUserControl.LaunchNotepadHandler(_launchControl_LaunchNotepadClicked);
            }
        }

        void _launchControl_LaunchNotepadClicked()
        {
            System.Diagnostics.Process.Start("notepad");
        }

        #region INavigationSection2 Members

        public string HeaderText
        {
            get 
            {
                return "Launch Notepad Add-In";
            }
        }

        #endregion

        #region IAddInControl Members

        public Control GetControl()
        {
            return _launchControl;
        }

        #endregion
    }

    [AddIn("Navigation Section Add-In", Version="1.0.0.0")]
    public class NavigationSectionAddInFactory : INavigationSectionFactory2
    {

        private IGlobalContext _globalContext;

        #region INavigationSectionFactory2 Members

        public INavigationSection2 CreateControl(bool inDesignMode)
        {
            return new NavigationSectionAddIn(inDesignMode);
        }

        #endregion

        #region IFactoryBase Members

        public System.Drawing.Image Image16
        {
            get 
            {
                return Properties.Resources.AddIn16;
            }
        }

        public string Text
        {
            get 
            {
                return "Launch Notepad";
            }
        }

        public string Tooltip
        {
            get 
            {
                return "Navigation section add-in that allows you to launch notepad.";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;
            
            //Initialize must return true for the add-in to execute
            return true;
        }

        #endregion
    }
}
