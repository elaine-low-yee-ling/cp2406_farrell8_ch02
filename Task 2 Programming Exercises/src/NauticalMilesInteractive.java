import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main (String[] args) {
        double KM_TO_NAUTICAL = 0.539957;
        double MILES_TO_NAUTICAL = 0.868976;
        double nautical, convertedKM, convertedMiles;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of nautical miles >>> ");
        nautical = inputDevice.nextDouble();
        convertedKM = nautical / KM_TO_NAUTICAL;
        convertedMiles = nautical / MILES_TO_NAUTICAL;
        System.out.println(nautical + " nautical miles is equivalent to " + convertedKM + "km or " + convertedMiles + " miles.");
    }
}
