namespace InternetAccess
{
    partial class Form1
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

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.accessYes = new System.Windows.Forms.Button();
            this.accessNo = new System.Windows.Forms.Button();
            this.accessQuestion = new System.Windows.Forms.Label();
            this.limitedAccess = new System.Windows.Forms.Button();
            this.unlimitedAccess = new System.Windows.Forms.Button();
            this.price = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // accessYes
            // 
            this.accessYes.Location = new System.Drawing.Point(54, 69);
            this.accessYes.Name = "accessYes";
            this.accessYes.Size = new System.Drawing.Size(75, 23);
            this.accessYes.TabIndex = 0;
            this.accessYes.Text = "Yes";
            this.accessYes.UseVisualStyleBackColor = true;
            this.accessYes.Click += new System.EventHandler(this.accessYes_Click);
            // 
            // accessNo
            // 
            this.accessNo.Location = new System.Drawing.Point(250, 69);
            this.accessNo.Name = "accessNo";
            this.accessNo.Size = new System.Drawing.Size(75, 23);
            this.accessNo.TabIndex = 1;
            this.accessNo.Text = "No";
            this.accessNo.UseVisualStyleBackColor = true;
            this.accessNo.Click += new System.EventHandler(this.accessNo_Click);
            // 
            // accessQuestion
            // 
            this.accessQuestion.AutoSize = true;
            this.accessQuestion.Location = new System.Drawing.Point(123, 29);
            this.accessQuestion.Name = "accessQuestion";
            this.accessQuestion.Size = new System.Drawing.Size(149, 13);
            this.accessQuestion.TabIndex = 2;
            this.accessQuestion.Text = "Do you want Internet access?";
            // 
            // limitedAccess
            // 
            this.limitedAccess.Location = new System.Drawing.Point(37, 145);
            this.limitedAccess.Name = "limitedAccess";
            this.limitedAccess.Size = new System.Drawing.Size(110, 23);
            this.limitedAccess.TabIndex = 3;
            this.limitedAccess.Text = "Limited Access?";
            this.limitedAccess.UseVisualStyleBackColor = true;
            this.limitedAccess.Visible = false;
            this.limitedAccess.Click += new System.EventHandler(this.limitedAccess_Click);
            // 
            // unlimitedAccess
            // 
            this.unlimitedAccess.Location = new System.Drawing.Point(231, 145);
            this.unlimitedAccess.Name = "unlimitedAccess";
            this.unlimitedAccess.Size = new System.Drawing.Size(112, 23);
            this.unlimitedAccess.TabIndex = 4;
            this.unlimitedAccess.Text = "Unlimited Access?";
            this.unlimitedAccess.UseVisualStyleBackColor = true;
            this.unlimitedAccess.Visible = false;
            this.unlimitedAccess.Click += new System.EventHandler(this.unlimitedAccess_Click);
            // 
            // price
            // 
            this.price.AutoSize = true;
            this.price.Location = new System.Drawing.Point(174, 231);
            this.price.Name = "price";
            this.price.Size = new System.Drawing.Size(0, 13);
            this.price.TabIndex = 5;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(391, 316);
            this.Controls.Add(this.price);
            this.Controls.Add(this.unlimitedAccess);
            this.Controls.Add(this.limitedAccess);
            this.Controls.Add(this.accessQuestion);
            this.Controls.Add(this.accessNo);
            this.Controls.Add(this.accessYes);
            this.Name = "Form1";
            this.Text = "Internet Access";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button accessYes;
        private System.Windows.Forms.Button accessNo;
        private System.Windows.Forms.Label accessQuestion;
        private System.Windows.Forms.Button limitedAccess;
        private System.Windows.Forms.Button unlimitedAccess;
        private System.Windows.Forms.Label price;
    }
}

