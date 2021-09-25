////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: ApplicationMenuAddIn.cs
//
// Comments: Illustrates adding custom add-ins to the RightNow Appliction Menu
//
// Notes: 
//			This example demonstrates the following functions:
//			1. Adding buttons and menus to the RightNow Application Menu
//
// Pre-Conditions: 
//          1. You must have enabled add-ins for the appropriate profile
//          2. You must have uploaded the compiled .dll to the RightNow server or deployed in developer mode
//
////////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RightNow.AddIns.AddInViews;
using System.Windows.Forms;
using System.AddIn;

namespace AddInSamples.Application_Menu
{
    //IAppMenuButton2 creates an application menu button, the item that appears on the left hand portion of the application menu
    [AddIn("Application Menu Add-In Sample", Version="1.0.0.0")]
    public class ApplicationMenuAddIn : IAppMenuButton2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButton2 Members

        public void Click()
        {
            MessageBox.Show("Application Menu Button Clicked.");
        }

        public System.Drawing.Image Image
        {
            get 
            {
                return Properties.Resources.AddIn32;
            }
        }

        public string KeyTips
        {
            get 
            {
                return "RN";
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public string Text
        {
            get 
            {
                return "Sample Add-In Button";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //The initialize method must return true for the add-in to be loaded
            return true;
        }

        #endregion
    }

    [AddIn("Application Menu Header Add-In Sample", Version="1.0.0.0")]
    public class ApplicationMenuHeaderAddIn : IAppMenuButtonHeader2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButtonHeader2 Members

        public string ButtonName
        {
            get 
            {
                return typeof(ApplicationMenuAddIn).FullName;
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public string Text
        {
            get 
            {
                return "Add-In Header Sample";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //The initialize method must return true for the add-in to be loaded
            return true;
        }

        #endregion
    }

    [AddIn("Second Application Menu Header Add-In Sample", Version = "1.0.0.0")]
    public class SecondApplicationMenuHeaderAddIn : IAppMenuButtonHeader2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButtonHeader2 Members

        public string ButtonName
        {
            get
            {
                return typeof(ApplicationMenuAddIn).FullName;
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public string Text
        {
            get
            {
                return "Second Add-In Header Sample";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //The initialize method must return true for the add-in to be loaded
            return true;
        }

        #endregion
    }

    [AddIn("Sample Menu Item Add-In", Version="1.0.0.0")]
    public class ApplicationMenuItemAddIn : IAppMenuButtonItem2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButtonItem2 Members

        public bool BeginGroup
        {
            get 
            {
                return false;
            }
        }

        public string ButtonName
        {
            get 
            {
                return typeof(ApplicationMenuAddIn).FullName;
            }
        }

        public void Click()
        {
            _menuItemContext.Text = "You last clicked me at: " + System.DateTime.Now.ToLongTimeString();
            MessageBox.Show("Menu button text has been updated!");
        }

        public string HeaderName
        {
            get 
            {
                return typeof(ApplicationMenuHeaderAddIn).FullName;
            }
        }

        public string KeyTips
        {
            get 
            {
                return "A";
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public object Tag
        {
            get 
            {
                return this;
            }
        }

        public string Text
        {
            get 
            {
                return "Sample Menu Item";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Must return true for the add-in to be executed
            return true;
        }

        #endregion
    }


    [AddIn("Second Sample Menu Item Add-In", Version = "1.0.0.0")]
    public class SecondApplicationMenuItemAddIn : IAppMenuButtonItem2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButtonItem2 Members

        public bool BeginGroup
        {
            get
            {
                return true;
            }
        }

        public string ButtonName
        {
            get
            {
                return typeof(ApplicationMenuAddIn).FullName;
            }
        }

        public void Click()
        {
            _menuItemContext.Text = "You last clicked me at: " + System.DateTime.Now.ToLongTimeString();
            MessageBox.Show("Menu button text has been updated!");
        }

        public string HeaderName
        {
            get
            {
                return typeof(ApplicationMenuHeaderAddIn).FullName;
            }
        }

        public string KeyTips
        {
            get
            {
                return "B";
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public object Tag
        {
            get
            {
                return this;
            }
        }

        public string Text
        {
            get
            {
                return "Second Sample Menu Item";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Must return true for the add-in to be executed
            return true;
        }

        #endregion
    }

    [AddIn("Third Sample Menu Item Add-In", Version = "1.0.0.0")]
    public class ThirdApplicationMenuItemAddIn : IAppMenuButtonItem2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButtonItem2 Members

        public bool BeginGroup
        {
            get
            {
                return false;
            }
        }

        public string ButtonName
        {
            get
            {
                return typeof(ApplicationMenuAddIn).FullName;
            }
        }

        public void Click()
        {
            _menuItemContext.Text = "You last clicked me at: " + System.DateTime.Now.ToLongTimeString();
            MessageBox.Show("Menu button text has been updated!");
        }

        public string HeaderName
        {
            get
            {
                return typeof(SecondApplicationMenuHeaderAddIn).FullName;
            }
        }

        public string KeyTips
        {
            get
            {
                return "C";
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public object Tag
        {
            get
            {
                return this;
            }
        }

        public string Text
        {
            get
            {
                return "Third Sample Menu Item";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Must return true for the add-in to be executed
            return true;
        }

        #endregion
    }

    [AddIn("Fourth Sample Menu Item Add-In", Version = "1.0.0.0")]
    public class FourthApplicationMenuItemAddIn : IAppMenuButtonItem2
    {
        private IMenuItemContext _menuItemContext;
        private IGlobalContext _globalContext;

        #region IAppMenuButtonItem2 Members

        public bool BeginGroup
        {
            get
            {
                return false;
            }
        }

        public string ButtonName
        {
            get
            {
                return typeof(ApplicationMenuAddIn).FullName;
            }
        }

        public void Click()
        {
            _menuItemContext.Text = "You last clicked me at: " + System.DateTime.Now.ToLongTimeString();
            MessageBox.Show("Menu button text has been updated!");
        }

        public string HeaderName
        {
            get
            {
                return typeof(SecondApplicationMenuHeaderAddIn).FullName;
            }
        }

        public string KeyTips
        {
            get
            {
                return "D";
            }
        }

        public void SetMenuItemContext(IMenuItemContext context)
        {
            _menuItemContext = context;
        }

        public object Tag
        {
            get
            {
                return this;
            }
        }

        public string Text
        {
            get
            {
                return "Fourth Sample Menu Item";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Must return true for the add-in to be executed
            return true;
        }

        #endregion
    }
}
