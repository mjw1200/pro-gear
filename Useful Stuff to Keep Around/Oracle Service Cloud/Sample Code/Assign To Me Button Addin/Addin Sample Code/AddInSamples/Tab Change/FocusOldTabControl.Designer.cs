namespace AddInSamples.Tab_Change
{
    partial class FocusOldTabControl
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
            this.buttonOldTab = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.labelOldTab = new System.Windows.Forms.Label();
            this.labelNewTab = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // buttonOldTab
            // 
            this.buttonOldTab.Location = new System.Drawing.Point(3, 3);
            this.buttonOldTab.Name = "buttonOldTab";
            this.buttonOldTab.Size = new System.Drawing.Size(119, 23);
            this.buttonOldTab.TabIndex = 0;
            this.buttonOldTab.Text = "Focus Old Tab";
            this.buttonOldTab.UseVisualStyleBackColor = true;
            this.buttonOldTab.Click += new System.EventHandler(this.buttonOldTab_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(4, 42);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(48, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Old Tab:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(4, 76);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(54, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "New Tab:";
            // 
            // labelOldTab
            // 
            this.labelOldTab.AutoSize = true;
            this.labelOldTab.Location = new System.Drawing.Point(64, 42);
            this.labelOldTab.Name = "labelOldTab";
            this.labelOldTab.Size = new System.Drawing.Size(33, 13);
            this.labelOldTab.TabIndex = 3;
            this.labelOldTab.Text = "None";
            // 
            // labelNewTab
            // 
            this.labelNewTab.AutoSize = true;
            this.labelNewTab.Location = new System.Drawing.Point(64, 76);
            this.labelNewTab.Name = "labelNewTab";
            this.labelNewTab.Size = new System.Drawing.Size(33, 13);
            this.labelNewTab.TabIndex = 4;
            this.labelNewTab.Text = "None";
            // 
            // FocusOldTabControl
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Transparent;
            this.Controls.Add(this.labelNewTab);
            this.Controls.Add(this.labelOldTab);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.buttonOldTab);
            this.Name = "FocusOldTabControl";
            this.Size = new System.Drawing.Size(248, 133);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonOldTab;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label labelOldTab;
        private System.Windows.Forms.Label labelNewTab;
    }
}
