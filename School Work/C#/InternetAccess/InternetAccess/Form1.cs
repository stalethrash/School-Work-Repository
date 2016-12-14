using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace InternetAccess
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void accessYes_Click(object sender, EventArgs e)
        {
            limitedAccess.Visible = !limitedAccess.Visible;
            unlimitedAccess.Visible = !unlimitedAccess.Visible;
        }

        private void accessNo_Click(object sender, EventArgs e)
        {
            price.Text = "$0.00";
        }

        private void limitedAccess_Click(object sender, EventArgs e)
        {
            price.Text = "$10.95 per month";
        }

        private void unlimitedAccess_Click(object sender, EventArgs e)
        {
            price.Text = "$19.95 per month";
        }
    }
}
