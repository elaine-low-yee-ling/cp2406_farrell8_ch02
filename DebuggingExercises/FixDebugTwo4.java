import javax.swing.JOptionPane;

public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      costString = JOptionPane.showInputDialog(null, "Enter price of item: ");
      cost = Integer.parseInt(costString);
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
              "% tax,  purchase  is $" + (cost + cost * TAX));
   }
}
