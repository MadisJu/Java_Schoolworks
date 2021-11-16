package main.RAND_Oliver.src;

import javax.swing.*;

class NewPage extends JFrame
{
    JPanel panel;
    JLabel text_wel, text;

    NewPage(String text_wel1, String text1)
    {
        text_wel.setText(text_wel1);
        text.setText(text1);
        panel.add(text_wel);
        panel.add(text);

        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(400, 200);
        panel.setVisible(true);

    }
}
