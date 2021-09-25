namespace AddInSamples.Status_Bar
{
    partial class LinkLabelDisplayUserControl
    {
        /// <summary> 
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.linkLabel = new System.Windows.Forms.LinkLabel();
            this.toolTipLinkLabel = new System.Windows.Forms.ToolTip(this.components);
            this.SuspendLayout();
            // 
            // linkLabel
            // 
            this.linkLabel.AutoSize = true;
            this.linkLabel.Dock = System.Windows.Forms.DockStyle.Fill;
            this.linkLabel.Location = new System.Drawing.Point(0, 0);
            this.linkLabel.MinimumSize = new System.Drawing.Size(1000, 0);
            this.linkLabel.Name = "linkLabel";
            this.linkLabel.Padding = new System.Windows.Forms.Padding(2);
            this.linkLabel.Size = new System.Drawing.Size(1000, 17);
            this.linkLabel.TabIndex = 0;
            this.linkLabel.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.linkLabel_LinkClicked);
            // 
            // LinkLabelDisplayUserControl
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.BackColor = System.Drawing.Color.Transparent;
            this.Controls.Add(this.linkLabel);
            this.Name = "LinkLabelDisplayUserControl";
            this.Size = new System.Drawing.Size(1000, 18);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.LinkLabel linkLabel;
        private System.Windows.Forms.ToolTip toolTipLinkLabel;
    }
}
