public class NauticalMiles {
    public static void main (String[] args) {
        double KM_TO_NAUTICAL = 0.539957;
        double MILES_TO_NAUTICAL = 0.868976;

        double nautical = 10.0;
        double convertedKM = nautical / KM_TO_NAUTICAL;
        double convertedMiles = nautical / MILES_TO_NAUTICAL;
        System.out.println(nautical + " nautical miles is equivalent to " + convertedKM + "km or " + convertedMiles + " miles.");
    }
}
