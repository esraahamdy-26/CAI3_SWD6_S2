import java.util.Scanner;

public class loopsApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* Program asks the user to enter the number of students and for each student,
        the program asks for student name, ask for three exam scores in double and then
         calculate the average using a method and use another method to determine the grade:
         A for 85 or higher , B for 70-84, C for 50-69 and F for below 50 and
         then display student name, average , and grade*/

        /**********************************
        * 1. enter number of students.
        * 2. for each student take their data.
        * 3. use method to calc avg for three exam scores.
        * 4. use method to determine score.
        * 5. display student info.
        *************************************/

        System.out.println("Please enter number of students in your class: ");
        int numOfStud = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numOfStud; i++)
        {
            System.out.println("For Student number "+i);

            System.out.println("Please Enter Student name: ");
            String name = input.nextLine();

            System.out.println("Please Enter Student three Exam Scores : ");
            System.out.println("For first Exam: ");
            double scr1 = input.nextDouble();
            System.out.println("For second Exam: ");
            double scr2 = input.nextDouble();
            System.out.println("For third Exam: ");
            double scr3 = input.nextDouble();

            double avg = average(scr1, scr2, scr3);
            char grad = grad(avg);
            display(name,avg,grad);
        }
    }

    public static double average(double sc1, double sc2, double sc3)
    {
        return ((sc1 + sc2 + sc3)/3);
    }
    public static char grad (double avg)
    {
        // A for 85 or higher , B for 70-84, C for 50-69 and F for below 50
        if (avg >= 85) {
            return 'A';
        }
        else if (avg >= 70) {
            return 'B';
        }
        else if (avg >= 50) {
            return 'C';
        }
        else
        {
            return 'F';
        }

    }

    public static void display(String name, double avg, char grad) {
        System.out.println("*********************************************");
        System.out.println(" Student Name is " + name + ", his/her average score is " + String.format("%.2f", avg) + ", its equivalent letter is " + grad);
        System.out.println("*********************************************");
    }
}
