using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.AddIn;

using RightNow.AddIns.AddInViews;
using System.Windows.Forms;
using System.Drawing;

namespace MyFirstAddinProject
{
    [AddIn("My First Add-In", Version="1.0.0.0")]
    public class NavigationPanelButton : Panel, INavigationSection2
    {
        private Button _navigationSectionButton;

        public string HeaderText
        {
            get
            {
                return "My First Add-In";
            }
        }

        public System.Windows.Forms.Control GetControl()
        {
            _navigationSectionButton = new Button();
            _navigationSectionButton.Size = new Size(100, 100);
            _navigationSectionButton.Text = "My Button";
            _navigationSectionButton.Click += new EventHandler(_navigationSectionButton_Click);
            this.Controls.Add(_navigationSectionButton);

            return this;
        }

        void _navigationSectionButton_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }
    }

    [AddIn("My Navigation Section Factory", Version = "1.0.0.0")]
    public class NavigationSectionFactory : INavigationSectionFactory2
    {
        public INavigationSection2 CreateControl(bool inDesignMode)
        {
            return new NavigationPanelButton();
        }

        public System.Drawing.Image Image16
        {
            get
            {
                return Properties.Resources.FirstAddinImage;
            }
        }

        public string Text
        {
            get
            {
                return "My Navigation Factor Section Add-In";
            }
        }

        public string Tooltip
        {
            get
            {
                return "My Navigation Factor Section Add-In Tooltip";
            }
        }

        public bool Initialize(IGlobalContext context)
        {
            return true;
        }
    }
}
