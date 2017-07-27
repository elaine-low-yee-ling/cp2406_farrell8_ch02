import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        int MIN_TO_HOUR = 60;
        int HOUR_TO_DAY = 24;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Minutes >>> ");
        int minutes = inputDevice.nextInt();
        double convertedHour = minutes / MIN_TO_HOUR;
        double convertedDay = convertedHour / HOUR_TO_DAY;

        System.out.printf("%d minutes equals to %.2f hours and equals to %.2f days.", minutes, convertedHour, convertedDay);
    }
}
