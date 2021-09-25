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
// File: ContactIdCollectionForm.cs
//
// Comments: Displays a form that will collect a contact id for the global ribbon add-in sample.
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

namespace AddInSamples.Global_Ribbon
{
    public partial class ContactIdCollectionForm : Form
    {
        public delegate void CancelHandler();
        public event CancelHandler CancelButtonClicked;

        public delegate void OkHandler(String val);
        public event OkHandler OkButtonClicked;

        public ContactIdCollectionForm()
        {
            InitializeComponent();
        }

        private void buttonCancel_Click(object sender, EventArgs e)
        {
            if (CancelButtonClicked != null)
            {
                CancelButtonClicked();
            }
        }

        private void buttonOK_Click(object sender, EventArgs e)
        {
            if (OkButtonClicked != null)
            {
                OkButtonClicked(textBox1.Text);
            }
        }
    }
}
