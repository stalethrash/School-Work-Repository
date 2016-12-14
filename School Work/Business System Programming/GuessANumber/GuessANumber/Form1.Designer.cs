namespace GuessANumber
{
    partial class guessingForm
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
            this.introLabel = new System.Windows.Forms.Label();
            this.hintLabel = new System.Windows.Forms.Label();
            this.guessButton1 = new System.Windows.Forms.RadioButton();
            this.guessButton2 = new System.Windows.Forms.RadioButton();
            this.guessButton3 = new System.Windows.Forms.RadioButton();
            this.guessButton4 = new System.Windows.Forms.RadioButton();
            this.guessButton5 = new System.Windows.Forms.RadioButton();
            this.submitButton = new System.Windows.Forms.Button();
            this.answerLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // introLabel
            // 
            this.introLabel.AutoSize = true;
            this.introLabel.Location = new System.Drawing.Point(98, 22);
            this.introLabel.Name = "introLabel";
            this.introLabel.Size = new System.Drawing.Size(87, 13);
            this.introLabel.TabIndex = 0;
            this.introLabel.Text = "Guess a number!";
            // 
            // hintLabel
            // 
            this.hintLabel.AutoSize = true;
            this.hintLabel.Location = new System.Drawing.Point(122, 54);
            this.hintLabel.Name = "hintLabel";
            this.hintLabel.Size = new System.Drawing.Size(29, 13);
            this.hintLabel.TabIndex = 1;
            this.hintLabel.Text = "Hint!";
            this.hintLabel.MouseEnter += new System.EventHandler(this.hintLabel_MouseEnter);
            this.hintLabel.MouseLeave += new System.EventHandler(this.hintLabel_MouseLeave);
            // 
            // guessButton1
            // 
            this.guessButton1.AutoSize = true;
            this.guessButton1.Location = new System.Drawing.Point(12, 114);
            this.guessButton1.Name = "guessButton1";
            this.guessButton1.Size = new System.Drawing.Size(31, 17);
            this.guessButton1.TabIndex = 2;
            this.guessButton1.TabStop = true;
            this.guessButton1.Text = "1";
            this.guessButton1.UseVisualStyleBackColor = true;
            // 
            // guessButton2
            // 
            this.guessButton2.AutoSize = true;
            this.guessButton2.Location = new System.Drawing.Point(67, 114);
            this.guessButton2.Name = "guessButton2";
            this.guessButton2.Size = new System.Drawing.Size(31, 17);
            this.guessButton2.TabIndex = 3;
            this.guessButton2.TabStop = true;
            this.guessButton2.Text = "2";
            this.guessButton2.UseVisualStyleBackColor = true;
            // 
            // guessButton3
            // 
            this.guessButton3.AutoSize = true;
            this.guessButton3.Location = new System.Drawing.Point(120, 114);
            this.guessButton3.Name = "guessButton3";
            this.guessButton3.Size = new System.Drawing.Size(31, 17);
            this.guessButton3.TabIndex = 4;
            this.guessButton3.TabStop = true;
            this.guessButton3.Text = "3";
            this.guessButton3.UseVisualStyleBackColor = true;
            // 
            // guessButton4
            // 
            this.guessButton4.AutoSize = true;
            this.guessButton4.Location = new System.Drawing.Point(184, 114);
            this.guessButton4.Name = "guessButton4";
            this.guessButton4.Size = new System.Drawing.Size(31, 17);
            this.guessButton4.TabIndex = 5;
            this.guessButton4.TabStop = true;
            this.guessButton4.Text = "4";
            this.guessButton4.UseVisualStyleBackColor = true;
            // 
            // guessButton5
            // 
            this.guessButton5.AutoSize = true;
            this.guessButton5.Location = new System.Drawing.Point(243, 114);
            this.guessButton5.Name = "guessButton5";
            this.guessButton5.Size = new System.Drawing.Size(31, 17);
            this.guessButton5.TabIndex = 6;
            this.guessButton5.TabStop = true;
            this.guessButton5.Text = "5";
            this.guessButton5.UseVisualStyleBackColor = true;
            // 
            // submitButton
            // 
            this.submitButton.Location = new System.Drawing.Point(101, 161);
            this.submitButton.Name = "submitButton";
            this.submitButton.Size = new System.Drawing.Size(75, 23);
            this.submitButton.TabIndex = 7;
            this.submitButton.Text = "Submit";
            this.submitButton.UseVisualStyleBackColor = true;
            this.submitButton.Click += new System.EventHandler(this.submitButton_Click);
            // 
            // answerLabel
            // 
            this.answerLabel.AutoSize = true;
            this.answerLabel.Location = new System.Drawing.Point(67, 221);
            this.answerLabel.Name = "answerLabel";
            this.answerLabel.Size = new System.Drawing.Size(0, 13);
            this.answerLabel.TabIndex = 8;
            // 
            // guessingForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 262);
            this.Controls.Add(this.answerLabel);
            this.Controls.Add(this.submitButton);
            this.Controls.Add(this.guessButton5);
            this.Controls.Add(this.guessButton4);
            this.Controls.Add(this.guessButton3);
            this.Controls.Add(this.guessButton2);
            this.Controls.Add(this.guessButton1);
            this.Controls.Add(this.hintLabel);
            this.Controls.Add(this.introLabel);
            this.Name = "guessingForm";
            this.Text = "Guessing Game";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label introLabel;
        private System.Windows.Forms.Label hintLabel;
        private System.Windows.Forms.RadioButton guessButton1;
        private System.Windows.Forms.RadioButton guessButton2;
        private System.Windows.Forms.RadioButton guessButton3;
        private System.Windows.Forms.RadioButton guessButton4;
        private System.Windows.Forms.RadioButton guessButton5;
        private System.Windows.Forms.Button submitButton;
        private System.Windows.Forms.Label answerLabel;
    }
}

