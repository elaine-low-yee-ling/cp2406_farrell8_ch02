public class InchesToFeet {
    public static void main(String[] args) {
        int inches = 86;
        int convertedInches_Quotient = inches / 12;
        int convertedInches_Remainder = inches % 12;

        System.out.print(inches + " inches is equivalent to " + convertedInches_Quotient + " feet and " + convertedInches_Remainder + " inches.");
    }
}
