////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: GlobalRibbonAddIn.cs
//
// Comments: Simple add-in that creates a global ribbon add-in.
//
// Notes: 
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
using System.Windows.Forms;

namespace AddInSamples.Global_Ribbon
{
    [AddIn("Global Ribbon Add-In", Version="1.0.0.0")]
    public class GlobalRibbonTabAddIn : IGlobalRibbonTab
    {

        public GlobalRibbonTabAddIn()
        {

        }

        private IGlobalContext _globalContext;

        #region IGlobalRibbonTab Members

        public string KeyTips
        {
            get 
            {
                return "G";
            }
        }

        public int Order
        {
            get 
            {
                return 0;
            }
        }

        public string Text
        {
            get 
            {
                return "Global Ribbon Add-In";
            }
        }

        private bool visible = true;

        public bool Visible
        {
            get 
            {
                return visible;
            }
            set
            {
                if (this.visible != value)
                {
                    this.visible = value;

                    if (this.VisibleChanged != null)
                    {
                        this.VisibleChanged(this, EventArgs.Empty);
                    }
                }
            }
        }

        public event EventHandler VisibleChanged;

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

    [AddIn("Contact Global Ribbon Add-In Group", Version="1.0.0.0")]
    public class ContactGlobalRibbonGroupAddIn : IGlobalRibbonGroup
    {
        private IGlobalContext _globalContext;

        #region IGlobalRibbonGroup Members

        public int Order
        {
            get 
            {
                return 0;
            }
        }

        public string TabName
        {
            get 
            {
                return typeof(GlobalRibbonTabAddIn).FullName;
            }
        }

        public string Text
        {
            get 
            {
                return "Contacts";
            }
        }

        private bool visible = true;

        public bool Visible
        {
            get
            {
                return visible;
            }
            set
            {
                if (this.visible != value)
                {
                    this.visible = value;

                    if (this.VisibleChanged != null)
                    {
                        this.VisibleChanged(this, EventArgs.Empty);
                    }
                }
            }
        }

        public event EventHandler VisibleChanged;

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            _globalContext = context;

            //Initialize must return true for the add-in to be executed
            return true;
        }

        #endregion
    }

    [AddIn("New Contact Global Ribbon Button Add-In", Version="1.0.0.0")]
    public class NewContactGlobalRibbonButtonAddIn : IGlobalRibbonButton
    {
        IGlobalContext _globalContext;

        #region IGlobalRibbonButton Members

        public void Click()
        {
            _globalContext.AutomationContext.CreateWorkspaceRecord(RightNow.AddIns.Common.WorkspaceRecordType.Contact);
        }

        private bool enabled = true;

        public bool Enabled
        {
            get 
            {
                return enabled;
            }
            set
            {
                if (this.enabled != value)
                {
                    this.enabled = value;

                    if (this.EnabledChanged != null)
                    {
                        this.EnabledChanged(this, EventArgs.Empty);
                    }
                }
            }
        }

        public event EventHandler EnabledChanged;

        public string GroupName
        {
            get 
            {
                return typeof(ContactGlobalRibbonGroupAddIn).FullName;
            }
        }

        public System.Drawing.Image Image16
        {
            get 
            {
                return Properties.Resources.AddIn16;
            }
        }

        public System.Drawing.Image Image32
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
                return "NC";
            }
        }

        public int Order
        {
            get 
            {
                return 0;
            }
        }

        public Keys Shortcut
        {
            get 
            {
                return Keys.None;
            }
        }

        public string Text
        {
            get 
            {
                return "New Contact";
            }
        }

        public string Tooltip
        {
            get 
            {
                return "Create a new contact record";
            }
        }

        private bool visible = true;

        public bool Visible
        {
            get
            {
                return visible;
            }
            set
            {
                if (this.visible != value)
                {
                    this.visible = value;

                    if (this.VisibleChanged != null)
                    {
                        this.VisibleChanged(this, EventArgs.Empty);
                    }
                }
            }
        }

        public event EventHandler VisibleChanged;

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

    [AddIn("Existing Contact Global Ribbon Button Add-In", Version = "1.0.0.0")]
    public class ExistingContactGlobalRibbonButtonAddIn : IGlobalRibbonButton
    {
        IGlobalContext _globalContext;

        #region IGlobalRibbonButton Members

        public void Click()
        {
            ContactIdCollectionForm idForm = new ContactIdCollectionForm();
            
            idForm.CancelButtonClicked += new ContactIdCollectionForm.CancelHandler(delegate() 
            {
                idForm.Close();
            });


            idForm.OkButtonClicked += new ContactIdCollectionForm.OkHandler(delegate(String val)
            {
                idForm.Close();
                _globalContext.AutomationContext.EditWorkspaceRecord(RightNow.AddIns.Common.WorkspaceRecordType.Contact, long.Parse(val));
                
            });

            idForm.ShowDialog();
        }

        private bool enabled = true;

        public bool Enabled
        {
            get
            {
                return enabled;
            }
            set
            {
                if (this.enabled != value)
                {
                    this.enabled = value;

                    if (this.EnabledChanged != null)
                    {
                        this.EnabledChanged(this, EventArgs.Empty);
                    }
                }
            }
        }

        public event EventHandler EnabledChanged;

        public string GroupName
        {
            get
            {
                return typeof(ContactGlobalRibbonGroupAddIn).FullName;
            }
        }

        public System.Drawing.Image Image16
        {
            get
            {
                return Properties.Resources.AddIn16;
            }
        }

        public System.Drawing.Image Image32
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
                return "EC";
            }
        }

        public int Order
        {
            get
            {
                return 0;
            }
        }

        public Keys Shortcut
        {
            get
            {
                return Keys.None;
            }
        }

        public string Text
        {
            get
            {
                return "Existing Contact";
            }
        }

        public string Tooltip
        {
            get
            {
                return "Open an existing contact record";
            }
        }

        private bool visible = true;

        public bool Visible
        {
            get
            {
                return visible;
            }
            set
            {
                if (this.visible != value)
                {
                    this.visible = value;

                    if (this.VisibleChanged != null)
                    {
                        this.VisibleChanged(this, EventArgs.Empty);
                    }
                }
            }
        }

        public event EventHandler VisibleChanged;

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
