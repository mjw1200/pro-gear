////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: StatusBarAddIn.cs
//
// Comments: A sample status bar add-in that displays links to news articles on RightNow Technologies.
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
    [AddIn("Sample Status Bar Add-In", Version="2.0.0.0")]
    public class StatusBarAddIn : IStatusBarItem
    {
        private IGlobalContext _globalContext;
        private LinkLabelDisplayUserControl _linkLabelUserControl;
        private RssFeedFetcher _feedFetcher;
        private FeedDisplayThread _feedDisplayThread;
        private Thread _thread;

        public StatusBarAddIn()
        {
            _linkLabelUserControl = new LinkLabelDisplayUserControl();
            _linkLabelUserControl.LinkLabelClicked += new LinkLabelDisplayUserControl.LinkLabelHandler(_linkLabelUserControl_LabelLinkClicked);

            _feedFetcher = new RssFeedFetcher();
            _feedDisplayThread = new FeedDisplayThread(_linkLabelUserControl, _feedFetcher);
        }

        void _linkLabelUserControl_LabelLinkClicked(string link)
        {
            WebBrowserUserControl webBrowserUserControl = new WebBrowserUserControl();
            webBrowserUserControl.Dock = DockStyle.Fill;
            webBrowserUserControl.SetUrl(link);

            _globalContext.AutomationContext.OpenEditor(new ContentPaneAddIn(webBrowserUserControl));
        }

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Initialize must return true for the add-in to execute
            return true;
        }

        #endregion

        #region IAddInControl Members

        public Control GetControl()
        {
            _thread = new Thread(new ThreadStart(_feedDisplayThread.RotateLinks));
            _thread.Start();

            return _linkLabelUserControl;
        }

        #endregion
    }
}
