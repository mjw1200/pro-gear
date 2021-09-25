using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace AddInSamples.Workspace_Update
{
    public partial class NoteUpdateUserControl : UserControl
    {
        public delegate void AddNoteHandler(String note);
        public event AddNoteHandler AddNoteClicked;

        public NoteUpdateUserControl()
        {
            InitializeComponent();
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            if (AddNoteClicked != null)
            {
                AddNoteClicked(richTextBox1.Text);
            }
        }
    }
}
