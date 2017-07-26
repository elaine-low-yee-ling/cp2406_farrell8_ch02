import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int QUART_IN_GALLON = 4;
        int quartPainting;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the amount of paint needed (in quarts) >>> ");
        quartPainting = inputDevice.nextInt();
        int convertedGallon = quartPainting / QUART_IN_GALLON;
        int remainingQuart = quartPainting % QUART_IN_GALLON;

        System.out.println("A job that needs " + quartPainting + " quarts requires " + convertedGallon + " gallons plus " + remainingQuart + " quarts.");

    }
}
