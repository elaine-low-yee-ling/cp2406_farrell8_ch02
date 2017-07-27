import javax.swing.*;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        int ADULT = 7;
        double ADULT_COST = 4.35;
        int CHILD = 4;
        double CHILD_COST = 3.10;

        int adult = Integer.parseInt(JOptionPane.showInputDialog("Adult meals: "));
        int child = Integer.parseInt(JOptionPane.showInputDialog("Child meals: "));
        double totalMeals = adult + child;

        double adultRevenue = adult * ADULT;
        double adultCost = adult * ADULT_COST;
        double adultProfit = adultRevenue - adultCost;

        double childRevenue = child * CHILD;
        double childCost = child * CHILD_COST;
        double childProfit = childRevenue - childCost;

        double totalRevenue = adultRevenue + childRevenue;
        double totalCost = adultCost + childCost;
        double totalProfit = adultProfit + childProfit;

        JOptionPane.showMessageDialog(null, "Adult meals: " + adult +
                "\nChildren meals: " + child + "\nTotal meals: " + totalMeals +
                "\nTotal revenue: $" + totalRevenue + "\nTotal cost: $" + totalCost + "\nTotal profit: $" + totalProfit + ".");
        JOptionPane.showMessageDialog(null, "Total revenue of adult meals: $" + adultRevenue +
                "\nTotal cost of adult meals: $" + adultCost + "\nTotal profit of adult meals: $" + adultProfit +
                "\nTotal revenue of child meals: $" + childRevenue + "\nTotal cost of child meals: $" + childCost +
                "\nTotal profit of child meals: $" + childProfit +
                "\nTotal profit: $" + totalProfit);
    }
}
