////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: ContentPaneAddIn.cs
//
// Comments: Simple add-in that displays a content pane with a browser control set to rightnow.com
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
using RightNow.AddIns.AddInViews;
using System.Windows.Forms;

namespace AddInSamples.Navigation_Item
{
    [AddIn("Content Pane Add-In For Navigation Item", Version="1.0.0.0")]
    public class NavItemContentPaneAddIn : IContentPaneControl
    {
        #region IContentPaneControl Members

        public bool BeforeClose()
        {
            //No action to take before we close
            return true;
        }

        public void Closed()
        {
            //No action to take when we close
        }

        public System.Drawing.Image Image16
        {
            get 
            {
                return Properties.Resources.AddIn16;
            }
        }

        public IList<IEditorRibbonButton> RibbonButtons
        {
            get 
            {
                //We won't display any special ribbon buttons for this sample
                return new List<IEditorRibbonButton>();
            }
        }

        public string Text
        {
            get 
            {
                return "RightNow.com";
            }
        }

        public string UniqueID
        {
            get 
            {
                return typeof(NavItemContentPaneAddIn).FullName;
            }
        }

        #endregion

        #region IAddInControl Members

        public System.Windows.Forms.Control GetControl()
        {
            UserControl control = new WebBrowserControl();
            control.Dock = DockStyle.Fill;

            return control;
        }

        #endregion
    }
}
