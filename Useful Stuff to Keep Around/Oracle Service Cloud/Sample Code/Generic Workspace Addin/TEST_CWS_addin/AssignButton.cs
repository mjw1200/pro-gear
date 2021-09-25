using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace GenericWorkspaceAddin
{
    public partial class AssignButton : UserControl
    {
        public delegate void buttonHandler();
        public event buttonHandler assignClicked;
        public AssignButton()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            assignClicked();

        }
    }
}
