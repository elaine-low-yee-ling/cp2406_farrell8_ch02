import javax.swing.*;

public class Eggs {
    public static void main(String[] args) {
        double DOZEN_EGGS = 3.25;
        double SINGLE_EGG = 0.45;

        int eggs = Integer.parseInt(JOptionPane.showInputDialog("How many eggs are you buying?"));
        int dozenNum = eggs / 12;
        double dozenCost = dozenNum * DOZEN_EGGS;
        int remainderNum = eggs % 12;
        double remainderCost = remainderNum * SINGLE_EGG;
        double totalCost = dozenCost + remainderCost;
        JOptionPane.showMessageDialog(null, "You ordered " + eggs + " eggs.\n That's " + dozenNum + " dozen at $" + DOZEN_EGGS + " per dozen and " + remainderNum + " loose eggs at $" + SINGLE_EGG + " each for a total of $" + totalCost + ".");

    }
}
