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

namespace AddInSamples.Report_Dashboard
{

    public class ReportDashboardAddInControl : IDashboardComponent
    {

        private PictureBoxUserControl _picBoxUserControl;

        //ServerConfigProperty attribute makes this property configurable through the add-in manager
        [ServerConfigProperty("http://data.moneycentral.msn.com/scripts/chrtsrv.dll?symbol=RNOW&E1=0&LPR=2&C1=3&E8=1&D5=0&D2=0&D4=1&DD=1&width=800&height=600&CE=0&CF=0")]
        public String ImageLocation
        {
            get;
            set;
        }

        public ReportDashboardAddInControl(bool inDesignMode)
        {
            if (inDesignMode == false)
            {
                //For when we are running in development mode
                if (ImageLocation == null)
                {
                    ImageLocation = "http://data.moneycentral.msn.com/scripts/chrtsrv.dll?symbol=RNOW&E1=0&LPR=2&C1=3&E8=1&D5=0&D2=0&D4=1&DD=1&width=800&height=600&CE=0&CF=0";
                }
                _picBoxUserControl = new PictureBoxUserControl();
            }
        }

        #region IAddInControl Members

        public Control GetControl()
        {
            _picBoxUserControl.SetImageLocation(ImageLocation);

            return _picBoxUserControl;
            
        }

        #endregion
    }

    [AddIn("Report Dashboard Add-In", Version = "1.0.0.0")]
    public class ReportDashboardAddInFactory : IDashboardComponentFactory
    {
        private IGlobalContext _globalContext;

        #region IDashboardComponentFactory Members

        public IDashboardComponent CreateControl(bool inDesignMode)
        {
            return new ReportDashboardAddInControl(inDesignMode);
        }

        public System.Drawing.Image Image24
        {
            get 
            {
                return Properties.Resources.AddIn32;
            }
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
                return "RightNow Stock Dashboard Add-In";
            }
        }

        public string Tooltip
        {
            get 
            {
                return "This is a real-time graph of RightNow's stock price.";
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
