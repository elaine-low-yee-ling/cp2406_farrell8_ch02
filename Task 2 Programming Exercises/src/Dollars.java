import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {
        int dollars = Integer.parseInt(JOptionPane.showInputDialog("How many dollars?"));

        int twenties = dollars / 20;
        int tens = (dollars % 20) / 10;
        int fives = (tens % 10) / 5;
        int ones = fives % 5;

        JOptionPane.showMessageDialog(null, "For $" + dollars + ":" +
                "\nYou can have: \n" + twenties + " 20s" +
                "\n" + tens + " 10s" +
                "\n" + fives + " 5s" +
                "\n" + ones + " 1s");
    }
}
