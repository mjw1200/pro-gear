namespace AddInSamples.Navigation_Section
{
    partial class LaunchNotePadUserControl
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
            this.buttonLaunchNotepad = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // buttonLaunchNotepad
            // 
            this.buttonLaunchNotepad.Location = new System.Drawing.Point(4, 4);
            this.buttonLaunchNotepad.Name = "buttonLaunchNotepad";
            this.buttonLaunchNotepad.Size = new System.Drawing.Size(112, 23);
            this.buttonLaunchNotepad.TabIndex = 0;
            this.buttonLaunchNotepad.Text = "Launch Notepad";
            this.buttonLaunchNotepad.UseVisualStyleBackColor = true;
            this.buttonLaunchNotepad.Click += new System.EventHandler(this.buttonLaunchNotepad_Click);
            // 
            // LaunchNotePadUserControl
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Transparent;
            this.Controls.Add(this.buttonLaunchNotepad);
            this.Name = "LaunchNotePadUserControl";
            this.Size = new System.Drawing.Size(146, 47);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button buttonLaunchNotepad;
    }
}
