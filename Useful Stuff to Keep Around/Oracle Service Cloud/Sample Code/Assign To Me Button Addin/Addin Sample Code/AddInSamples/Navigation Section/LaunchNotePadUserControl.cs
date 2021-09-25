using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace AddInSamples.Navigation_Section
{
    public partial class LaunchNotePadUserControl : UserControl
    {
        public delegate void LaunchNotepadHandler();
        public event LaunchNotepadHandler LaunchNotepadClicked;

        public LaunchNotePadUserControl()
        {
            InitializeComponent();
        }

        private void buttonLaunchNotepad_Click(object sender, EventArgs e)
        {
            if (LaunchNotepadClicked != null)
            {
                LaunchNotepadClicked();
            }
        }
    }
}
