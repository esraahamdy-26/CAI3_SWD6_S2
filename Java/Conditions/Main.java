import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Calculator
        /* double num1, num2;
        System.out.print("Please enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Please Enter Second number: ");
        num2 = input.nextDouble();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = "+ (num1 / num2));
        */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // read string
        /* System.out.println("Please Enter a sentence ");
        String sentence = input.nextLine();
        System.out.println("Upper Case: " + sentence.toUpperCase());
        System.out.println("Length: " + sentence.length());
        System.out.println("First Character is " + sentence.charAt(0));
        */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Check Voting Eligibility
        /* System.out.print("Please Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please Enter your nationality: ");
        String nationality = input.nextLine().toLowerCase();

        if (age >= 18 && nationality.equals("egyption")){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible");
        }
        */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Even or odd
        System.out.print("Please Enter number: ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Even number.");
        }
        else {
            System.out.println("Odd number.");
        }


    }
}
