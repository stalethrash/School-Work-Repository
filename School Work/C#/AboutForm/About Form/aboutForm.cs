/* Mitchell Meyer
 * 7/20/15
 * Assignment 7.3
 * Bellevue University
 * About.cs
 * 
 */
 
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class aboutLabel : Form
    {
        public aboutLabel()
        {
            InitializeComponent();
        }

        private void about_Click(object sender, EventArgs e)
        {
            label1.Text = "Program developed by Mitch Meyer 2015, \n "
                + "\tall rights reserved.";

        }
    }
}
