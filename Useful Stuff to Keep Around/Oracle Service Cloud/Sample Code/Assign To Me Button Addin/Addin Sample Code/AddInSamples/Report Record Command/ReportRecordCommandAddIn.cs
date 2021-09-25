////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: ReportRecordCommandAddIn.cs
//
// Comments: A sample report record command add-in
//
// Notes: 
//          You must add this item to a analytics grid report
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
namespace AddInSamples.Report_Record_Command
{
    [AddIn("Report Record Command Add-In Sample", Version="1.0.0.0")]
    public class ReportRecordCommandAddIn : IReportCommand
    {
        int count = 0;
        #region IReportCommand Members

        public bool Enabled(IList<IReportRow> rows)
        {
            if (rows != null)
            {
                foreach (IReportRow row in rows)
                {
                    count++;
                    //Just disable every other row
                    if (count % 2 == 0)
                    {
                        return false;
                    }
                    else
                    {
                        return true;
                    }
                }

            }

            return true;
        }

        public void Execute(IList<IReportRow> rows)
        {
            String msg = "Report Data:\n";
            foreach (IReportRow row in rows)
            {
                IList<IReportCell> cells = row.Cells;

                foreach (IReportCell cell in cells)
                {
                    msg += "Cell Name: " + cell.Name + "     Cell Value: " + cell.Value + "\n";
                }
            }

            MessageBox.Show(msg);
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

        public IList<RightNow.AddIns.Common.ReportRecordIdType> RecordTypes
        {
            get
            {
                IList<RightNow.AddIns.Common.ReportRecordIdType> typeList = new List<RightNow.AddIns.Common.ReportRecordIdType>();

                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Answer);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Chat);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.CloudAcct2Search);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Contact);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.ContactList);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Document);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Flow);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Incident);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Mailing);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.MetaAnswer);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Organization);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Question);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.QueuedReport);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Quote);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.QuoteProduct);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Report);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Segment);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Survey);
                typeList.Add(RightNow.AddIns.Common.ReportRecordIdType.Task);


                return typeList;
            }
        }

        public string Text
        {
            get
            {
                return "Report Command Add-In";
            }
        }

        public string Tooltip
        {
            get
            {
                return "Report Command Tooltip";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            //Initialize must return true for add-in to execute
            return true;
        }

        #endregion
    }
}
