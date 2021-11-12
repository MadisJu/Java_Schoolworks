package main.Rekursioon_Madis;


import javax.swing.*;
import java.awt.*;

public class main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Recursion stuff");

        Canvas C = new Canvas();

        frame.add(C);

        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
