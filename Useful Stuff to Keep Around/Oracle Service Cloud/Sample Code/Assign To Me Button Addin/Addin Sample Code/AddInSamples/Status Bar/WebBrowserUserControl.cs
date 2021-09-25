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
    public partial class WebBrowserUserControl : UserControl
    {
        public WebBrowserUserControl()
        {
            InitializeComponent();
        }

        internal void SetUrl(string link)
        {
            webBrowser1.Navigate(link);
        }
    }
}
