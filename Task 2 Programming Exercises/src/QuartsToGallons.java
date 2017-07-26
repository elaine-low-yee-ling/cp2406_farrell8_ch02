public class QuartsToGallons {
    public static void main(String[] args) {
        int QUART_IN_GALLON = 4;
        int quartPainting = 18;
        int convertedGallon = quartPainting / QUART_IN_GALLON;
        int remainingQuart = quartPainting % QUART_IN_GALLON;

        System.out.println("A job that needs " + quartPainting + " quarts requires " + convertedGallon + " gallons plus " + remainingQuart + " quarts.");

    }
}
