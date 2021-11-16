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
    final JTextField  textField1, textField2;
    JLabel textField3;

    CreateLoginForm()
    {

        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15);

        passLabel = new JLabel();
        passLabel.setText("Password");

        textField2 = new JPasswordField(15);

        textField3 = new JLabel();
        textField3.setText(" ");

        b1 = new JButton("SUBMIT");

        newPanel = new JPanel(new GridLayout(5, 2));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);
        newPanel.add(textField3);

        add(newPanel, BorderLayout.CENTER);
        add(b1, BorderLayout.AFTER_LAST_LINE);

        b1.addActionListener(this);
        setTitle("LOGIN FORM");

    }

    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();

        if (userValue.equals("a") && passValue.equals("a")) {

            String wel_label = "Welcome: "+userValue;
            String wel_text = "text here";

            new NewPage(wel_label, wel_text);


        }
        else{
            Timer t = new Timer(1500, e -> textField3.setText(null));
            t.setRepeats(false);

            textField3.setText("Wrong password");
            t.start();

        }
    }
}
class LoginFormDemo
{
    public static void main(String[] arg)
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
