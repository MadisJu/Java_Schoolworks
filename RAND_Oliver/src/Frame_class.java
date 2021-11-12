package main.RAND_Oliver.src;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ComponentListener;

class FrameClass extends JFrame {

    public FrameClass() {


        setSize(500, 500);


        JTextField user = new JTextField("Username");
        JPasswordField pass = new JPasswordField("Password");
        JButton login = new JButton("Login");

        setLayout(new BorderLayout());
        add(user, BorderLayout.NORTH);
        add(pass, BorderLayout.CENTER);
        add(login, BorderLayout.SOUTH);





        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        FrameClass frameClass = new FrameClass();

    }


}