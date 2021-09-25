////////////////////////////////////////////////////////////////////////////////
// RightNow Connect Sample Code
//
// RightNow Confidential
//
// Copyright RightNow Technologies, Inc. 2010
//
// Sample code for training only. This sample code is provided "as is" with no warranties 
// of any kind express or implied. Use of this sample code is pursuant to the applicable
// non-disclosure agreement and or end user agreement and or partner agreement between
// you and RightNow Technologies. You acknowledge RightNow Technologies is the exclusive
// owner of the object code, source code, results, findings, ideas and any works developed
// in using this sample code.
//
// File: LinkLabelDisplayUserControl.cs
//
// Comments: Simple user control used to display link labels.
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
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace AddInSamples.Status_Bar
{
    public partial class LinkLabelDisplayUserControl : UserControl
    {
        public delegate void LinkLabelHandler(String link);
        public event LinkLabelHandler LinkLabelClicked;

        public LinkLabelDisplayUserControl()
        {
            InitializeComponent();
            this.Dock = DockStyle.Fill;
        }

        public void SetLinkLabelFields(String description, String link, String title)
        {
            if (linkLabel.Created == true)
            {
                linkLabel.BeginInvoke(new MethodInvoker(delegate()
                {
                    linkLabel.Text = title;
                    linkLabel.Tag = link;
                    toolTipLinkLabel.SetToolTip(linkLabel, description);
                }));
            }

        }

        private void linkLabel_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            if (LinkLabelClicked != null)
            {
                LinkLabelClicked((String)linkLabel.Tag);
            }
        }
    }
}
