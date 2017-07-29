import javax.swing.*;

public class TicketNumber {
    public static void main(String[] args) {
        boolean ticketValidity;

        String ticketNum = JOptionPane.showInputDialog("Ticket number:");
        int indexLastDigit = ticketNum.length() - 1;

        int lastDigitTicketNum = Character.getNumericValue(ticketNum.charAt(indexLastDigit));

        StringBuilder builder = new StringBuilder(ticketNum);
        int fiveDigitTicketNum = Integer.parseInt(builder.deleteCharAt(indexLastDigit).toString());

        int remainder = fiveDigitTicketNum % 7;
        if (remainder == lastDigitTicketNum) {
            ticketValidity = true;
        } else {
            ticketValidity = false;
        }

        JOptionPane.showMessageDialog(null, Boolean.toString(ticketValidity));

    }
}
