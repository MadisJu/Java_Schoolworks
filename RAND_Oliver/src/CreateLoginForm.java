package main.RAND_Oliver.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CreateLoginForm extends JFrame implements ActionListener
{
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1;
    JTextField textField2;

    CreateLoginForm()
    {

        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15);

        passLabel = new JLabel();
        passLabel.setText("Password");

        textField2 = new JPasswordField(15);

        b1 = new JButton("SUBMIT");

        newPanel = new JPanel(new GridLayout(4, 2));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);
        add(b1, BorderLayout.AFTER_LAST_LINE);

        b1.addActionListener(this);
        setTitle("LOGIN FORM");

    }

    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();

        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {

            NewPage page = new NewPage();

            page.setVisible(true);

            JLabel wel_label = new JLabel("Welcome: "+userValue);
            page.getContentPane().add(wel_label);
        }
        else{
            textField2 = new JTextField("Wrong password", 15);
            newPanel.add(textField2);
        }
    }
}
class LoginFormDemo
{
    public static void main(String arg[])
    {
        try
        {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(350,150);
            form.setVisible(true);
            form.setResizable(false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
