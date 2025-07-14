//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* Loops & Conditions Practice */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        // do while application (password access)
        String correctPass = "randoms";
        String enteredPass;
        int attempts = 0;
        int maxAttempts = 3;
        System.out.println("Welcome to our Application!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        do {
            System.out.println("Please Enter Your Password: ");
            enteredPass = input.nextLine();
            enteredPass = enteredPass.toLowerCase();
            if (enteredPass.equals(correctPass))
            {
                System.out.println("Correct password. Have a nice experience with our application.");
                break;
            }
            else
            {
                attempts ++;
                if (attempts == maxAttempts)
                {
                    System.out.println("Sorry,but for our security terms you have no ability to enter.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                else
                {
                    System.out.println("Incorrect password. "+ (maxAttempts - attempts)+ " of tries are remain.");
                }
            }

        } while(attempts < maxAttempts);
         */

//        // 1. Print numbers from 1 to 10 using loops
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        // 2. use if to check if a number is even or odd if num is odd will print odd and end the loop
//
//        int flag = 0;
//        do {
//            System.out.println("Enter number: ");
//            int num = input.nextInt();
//            if (num % 2 == 0) System.out.println("Number you have entered is Even number.");
//            else
//            {
//                System.out.println("Number you have entered is odd number.");
//                flag = 1;
//            }
//        } while(flag == 0);
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        // 3. Use switch to display the name of the day (1-7)
//        System.out.println("Enter number: ");
//        int num = input.nextInt();
//        switch (num)
//        {
//            case 1: System.out.println("Sunday"); break;
//            case 2: System.out.println("Monday"); break;
//            case 3: System.out.println("Tuesday");break;
//            case 4: System.out.println("Wednesday");break;
//            case 5: System.out.println("Thursday");break;
//            case 6: System.out.println("Friday");  break;
//            case 7: System.out.println("Saturday");break;
//            default: System.out.println("There is no day equivalent to that number you have entered.");
//        }
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        // 4. Print multiplication table (1 to 10) using for
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println("5 x "+ i +" = " +(5*i));
//        }
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // 5. Count digits in a number using while
        // 6. Reverse a number using while
        int count = 0;
        System.out.println("Please enter a number: ");
        int numb = input.nextInt();
        int reversedNumber=0;
        while (numb > 0)
        {
            reversedNumber = reversedNumber*10 + (numb%10);
            numb /= 10;
            count++;
        }
        System.out.println("number of digits is "+ count);
        System.out.println("Reversed number is "+ reversedNumber);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}