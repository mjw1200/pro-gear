////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: NavigationItemAddIn.cs
//
// Comments: Simple add-in that creates a navigation item. When the item is clicked a content pane add-in
//           will be displayed.
//
// Notes: 
//          You must add this item to a navigation set using the navigation set editor under 'Configuration'
//
// Pre-Conditions: 
//          1. You must have enabled add-ins for the appropriate profile
//          2. You must have uploaded the compiled .dll to the RightNow server
//
////////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RightNow.AddIns.AddInViews;
using System.AddIn;

namespace AddInSamples.Navigation_Item
{
    [AddIn("Sample Navigation Item Add-In", Version="1.0.0.0")]
    public class NavigationItemAddIn : INavigationItem
    {
        private IGlobalContext _globalContext;

        #region INavigationItem Members

        public void Activate()
        {
            _globalContext.AutomationContext.OpenEditor(new NavItemContentPaneAddIn());
        }

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
                return "Open Content Pane Add-In";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Must return true for the add-in to execute
            return true;
        }

        #endregion
    }
}
