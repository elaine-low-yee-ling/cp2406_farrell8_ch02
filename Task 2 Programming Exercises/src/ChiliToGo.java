import javax.swing.*;

public class ChiliToGo {
    public static void main(String[] args) {
        int ADULT = 7;
        int CHILD = 4;

        int adult = Integer.parseInt(JOptionPane.showInputDialog("How many adult meals are you ordering?"));
        int child = Integer.parseInt(JOptionPane.showInputDialog("How many children meals are you ordering?"));
        int totalMeals = adult + child;
        int adultCost = adult * ADULT;
        int childCost = child * CHILD;
        int totalCost = adultCost + childCost;

        JOptionPane.showMessageDialog(null, "Adult meals ordered: " + adult +
                "\nChildren meals ordered: " + child + "\nTotal meals ordered: " + totalMeals +
                "\nTotal cost of adult meals: $" + adultCost + "\nTotal cost of child meals: $" + childCost +
                "\nTotal bill: $" + totalCost);
    }
}
