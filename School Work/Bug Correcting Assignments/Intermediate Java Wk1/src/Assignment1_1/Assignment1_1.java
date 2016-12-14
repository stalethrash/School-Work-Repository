//There is one line of code missing in the code below:

import javax.swing.*;
import java.awt.*;
public class ButtonDisplay{

 

  private JFrame frame = new JFrame("Button Display");

  private JButton b1 = new JButton("Button 1");

  private JButton b2 = new JButton("Button 2");

  private JButton b3 = new JButton("Button 3");

  private JTextField txt = new JTextField(10);

 

 class ButtonListener implements ActionListener{

 

    @Override

    public void actionPerformed(ActionEvent e){

 

      String name = ((JButton)e.getSource()).getText();

      txt.setText(name);

    }

  }

 

  public ButtonDisplay(){

 

    b1.addActionListener(bListner);

    b2.addActionListener(bListner);

                b3.addActionListener(bListner);

 

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

    frame.setLayout(new FlowLayout());

    frame.add(b1);

    frame.add(b2);

                frame.add(b3);

    frame.add(txt);

 

    frame.setSize(300, 200);

    frame.setVisible(true);

  }

 

  public static void main(String[] args){

 

    ButtonDisplay button = new ButtonDisplay();

  }

}

