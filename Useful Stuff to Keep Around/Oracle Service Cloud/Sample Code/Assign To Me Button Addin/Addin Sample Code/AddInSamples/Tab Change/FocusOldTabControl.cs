using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace AddInSamples.Tab_Change
{
    public partial class FocusOldTabControl : UserControl
    {
        public delegate void FocusButtonHandler();
        public event FocusButtonHandler FocusOldClicked;

        public FocusOldTabControl()
        {
            InitializeComponent();
        }

        private void buttonOldTab_Click(object sender, EventArgs e)
        {
            if (FocusOldClicked != null)
            {
                FocusOldClicked();
            }
        }

        internal void SetTabLabels(string oldTab, string newTab)
        {
            this.BeginInvoke(new MethodInvoker(delegate()
            {
                labelOldTab.Text = oldTab;
                labelNewTab.Text = newTab;
            }));
        }
    }
}
