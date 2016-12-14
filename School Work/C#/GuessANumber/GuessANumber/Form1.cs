using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GuessANumber
{
    public partial class guessingForm : Form
    {
        int correctAnswer;

        public void init()
        {
            Random random = new Random();
            correctAnswer = random.Next(1, 6);
        }
        public guessingForm()

        {
            InitializeComponent();
            init();

        }

        private void hintLabel_MouseEnter(object sender, EventArgs e)
        {
            if (correctAnswer == 1)
                hintLabel.Text = "Answer is not 2";
            else if (correctAnswer == 2)
                hintLabel.Text = "Answer is not 3";
            else if (correctAnswer == 3)
                hintLabel.Text = "Answer is not 4";
            else if (correctAnswer == 4)
                hintLabel.Text = "Answer is not 5";
            else
                hintLabel.Text = "Answer is not 1";
        }

        private void hintLabel_MouseLeave(object sender, EventArgs e)
        {
            hintLabel.Text = "Hint!";
        }

        private bool userSelectedRandomButton()
        {
            if (guessButton1.Checked == true)
                return (correctAnswer == 1);
            if (guessButton2.Checked == true)
                return (correctAnswer == 2);
            if (guessButton3.Checked == true)
                return (correctAnswer == 3);
            if (guessButton4.Checked == true)
                return (correctAnswer == 4);
            if (guessButton5.Checked == true)
                return (correctAnswer == 5);
            return false;
        }

        private void submitButton_Click(object sender, EventArgs e)
        {
            guessButton1.Enabled = false;
            guessButton2.Enabled = false;
            guessButton3.Enabled = false;
            guessButton4.Enabled = false;
            guessButton5.Enabled = false;

            if (userSelectedRandomButton() == true)
            {
                answerLabel.Text = "You are correct!";
            }
            else
            {
                answerLabel.Text = ("So sorry, the correct answer is " + correctAnswer);
            }
             
        }
    }
}
