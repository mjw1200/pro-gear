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

namespace AddInSamples.Workspace_Update
{
    public class WorkspaceNoteUpdateComponent : IWorkspaceComponent2
    {
        private IRecordContext _recContext;

        public WorkspaceNoteUpdateComponent(bool inDesignMode, IRecordContext recContext)
        {
            //You can't access the IRecordContext when in design mode
            if (inDesignMode == false)
            {
                _recContext = recContext;
            }
        }

        #region IWorkspaceComponent2 Members

        public bool ReadOnly
        {
            get;
            set;
        }

        public void RuleActionInvoked(string actionName)
        {
            //Not used
        }

        public string RuleConditionInvoked(string conditionName)
        {
            //Not used
            return "";
        }

        #endregion

        #region IAddInControl Members

        public Control GetControl()
        {
            NoteUpdateUserControl noteUpdateControl = new NoteUpdateUserControl();
            noteUpdateControl.AddNoteClicked += new NoteUpdateUserControl.AddNoteHandler(noteUpdateControl_AddNoteClicked);

            return noteUpdateControl;
        }

        void noteUpdateControl_AddNoteClicked(string note)
        {
            IContact contactRecord = _recContext.GetWorkspaceRecord(RightNow.AddIns.Common.WorkspaceRecordType.Contact) as IContact;
            IList<INote> notes = contactRecord.Note;

            INote newNote = AddInViewsDataFactory.Create<INote>();

            newNote.Text = note;
            newNote.Seq = 0;
            newNote.ChanID = 1;

            notes.Add(newNote);

            contactRecord.Note = notes;

            _recContext.RefreshWorkspace();

        }

        #endregion
    }

    [AddIn("Workspace Note Update Add-In", Version="1.0.0.0")]
    public class WorkspaceNoteUpdateAddInFactory : IWorkspaceComponentFactory2
    {
        #region IWorkspaceComponentFactory2 Members

        public IWorkspaceComponent2 CreateControl(bool inDesignMode, IRecordContext context)
        {
            WorkspaceNoteUpdateComponent workspaceComponent = new WorkspaceNoteUpdateComponent(inDesignMode, context);

            return workspaceComponent;
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
                return "Note Update Add-In";
            }
        }

        public string Tooltip
        {
            get 
            {
                return "Add-In that lets you add a note to a record";
            }
        }

        #endregion

        #region IAddInBase Members

        public bool Initialize(IGlobalContext context)
        {
            //Initialize must return true for the add-in to execute
            return true;
        }

        #endregion
    }
}
