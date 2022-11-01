package MyPractice;

import javax.swing.*;
import java.util.Scanner;

public class Guix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null,"My name is "+name);

        String answer = JOptionPane.showInputDialog("Are you happy about life? ");
        JOptionPane.showMessageDialog(null,answer);

        String club = JOptionPane.showInputDialog("Whats your favorite club:  ");
        JOptionPane.showMessageDialog(null,"My fave club is "+club);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you: "));
        JOptionPane.showMessageDialog(null,"I'm "+age+" years old");

        String segz = JOptionPane.showInputDialog("How long have you had sex (weeks,month,years) ?");
        JOptionPane.showMessageDialog(null,"The last time i had sex was "+segz+" ago.");

        JOptionPane.showMessageDialog(null,"Thank you for participating in my little gimmick" );
    }
}
