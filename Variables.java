public class Variables {
    public static void main(String[] args) {
        int intOperandA = 10;
        int intOperandB = 3;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum is " + intSum);
        System.out.println("The product is " + intProduct);
        System.out.println("The difference is " + intDifference);
        System.out.println("The quotient is " + intQuotient);
        System.out.println("The modulo is " + intModulo);

        double doubleOperandA = 10.0;
        double doubleOperandB = 3.0;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;
        double doubleModulo = 0.0;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum is " + doubleSum);
        System.out.println("The product is " + doubleProduct);
        System.out.println("The difference is " + doubleDifference);
        System.out.println("The quotient is " + doubleQuotient);
        System.out.println("The modulo is " + doubleModulo);


        System.out.println("");

        int numberChildren = 2;
        boolean isRaining = false;
        double priceGas = 3.29;
        char middleInitial = 'T';
        int favoriteNumber = 15;
        int birthMonth = 6;

        System.out.println("You have " + numberChildren + " kids in your family.");
        System.out.println("It is raining out? " + isRaining);
        System.out.println("The price of tea is $" + priceGas);
        System.out.println("My middle initial is " + middleInitial);
        System.out.println("My favorite number is " + favoriteNumber);
        System.out.println("My birthmonth is " + birthMonth);
    }
}
