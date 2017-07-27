import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int inches, convertedInches_Quotient, convertedInches_Remainder;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of inches >>> ");
        inches = inputDevice.nextInt();
        convertedInches_Quotient = inches / 12;
        convertedInches_Remainder = inches % 12;
        System.out.print(inches + " inches is equivalent to " + convertedInches_Quotient + " feet and " + convertedInches_Remainder + " inches.");
    }
}
