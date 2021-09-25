////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: ContentPaneAddIn.cs
//
// Comments: A sample content pane add-in to display clicked links from the status bar add-in.
//           
//
// Notes: 
//         
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
using System.Threading;

namespace AddInSamples.Status_Bar
{
    [AddIn("Content Pane Add-In For Status Bar Links", Version="1.0.0.0")]
    public class ContentPaneAddIn : IContentPaneControl
    {
        private WebBrowserUserControl _webBrowserUserControl;

        public ContentPaneAddIn(WebBrowserUserControl control)
        {
            _webBrowserUserControl = control;
        }

        #region IContentPaneControl Members

        public bool BeforeClose()
        {
            return true;
        }

        public void Closed()
        {
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
                //No buttons needed
                return new List<IEditorRibbonButton>();
            }
        }

        public string Text
        {
            get 
            {
                return "Status Bar Link";
            }
        }

        public string UniqueID
        {
            get 
            {
                return typeof(ContentPaneAddIn).FullName;
            }
        }

        #endregion

        #region IAddInControl Members

        public Control GetControl()
        {
            return _webBrowserUserControl;
        }

        #endregion
    }
}
