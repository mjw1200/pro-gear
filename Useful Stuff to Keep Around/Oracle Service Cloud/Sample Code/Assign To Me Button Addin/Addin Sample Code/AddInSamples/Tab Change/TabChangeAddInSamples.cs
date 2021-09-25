////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: TabChangeAddInSamples.cs
//
// Comments: A sample add-in that demonstrates how to work with tab change events and focus tabs.
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

namespace AddInSamples.Tab_Change
{
    [AddIn("Tab Change Add-In Sample", Version = "1.0.0.0")]
    public class TabChangeAddInFacotry : INavigationSectionFactory2
    {
        private IGlobalContext _globalContext;

        #region INavigationSectionFactory2 Members

        public INavigationSection2 CreateControl(bool inDesignMode)
        {
            return new TabChangeAddInSamples(_globalContext);
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
                return "Tab Change Add-In";
            }
        }

        public string Tooltip
        {
            get 
            { 
                return "Demonstrates how to handle/work with tab change events";
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


    public class TabChangeAddInSamples : INavigationSection2
    {
        private IGlobalContext _globalContext;
        private String _oldTabIdentifer;
        private FocusOldTabControl _focusButtonControl;

        public TabChangeAddInSamples(IGlobalContext globalContext)
        {
            _globalContext = globalContext;

            _globalContext.AutomationContext.CurrentEditorTabChanged += new EventHandler<EditorTabChangedEventArgs>(AutomationContext_CurrentEditorTabChanged);

            _focusButtonControl = new FocusOldTabControl();
            _focusButtonControl.FocusOldClicked += new FocusOldTabControl.FocusButtonHandler(_focusButtonControl_FocusOldClicked);
        }

        void _focusButtonControl_FocusOldClicked()
        {
            if (String.IsNullOrEmpty(_oldTabIdentifer) == false)
            {
                _globalContext.AutomationContext.FindAndFocus(_oldTabIdentifer);
            }
        }


        void AutomationContext_CurrentEditorTabChanged(object sender, EditorTabChangedEventArgs e)
        {
            _focusButtonControl.SetTabLabels(e.OldTabIdentifier, e.NewTabIdentifier);
            _oldTabIdentifer = e.OldTabIdentifier;
        }

        #region IAddInControl Members

        public Control GetControl()
        {
            return _focusButtonControl;
        }

        public string HeaderText
        {
            get 
            { 
                return "Tab Change Add-In"; 
            }
        }

        #endregion
    }
}
