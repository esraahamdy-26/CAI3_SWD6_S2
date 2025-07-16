import java.util.Scanner;

public class studentsMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 10;
        System.out.println("Please Enter number of students you have in your class: ");
        num = input.nextInt();
        int []sMarks = new int[num];
        for (int i = 0; i < sMarks.length; i++)
        {
            System.out.print("Enter Mark of student "+ (i+1) + " : ");
            sMarks[i] = input.nextInt();
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Calculate the average mark, highest & lowest marks
        int avg = 0;
        int max = 0;
        int min = 100;
        for (int mark : sMarks)
        {
            avg += mark;

            if (max < mark)
            {
                max = mark;
            }

            if (min > mark)
            {
                min = mark;
            }
        }
        avg /= sMarks.length;
        System.out.println("The average mark is "+ avg + ", Highest mark is "+ max + " and the lowest mark is " + min + ".");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // print all students marks with their index, count how many students are passed and how many are failed.
        int pass = 0;
        for (int i = 0; i < sMarks.length; i++)
        {
            System.out.println("Student with index: "+ i + " his mark is " + sMarks[i]);
            if (sMarks[i] >= 50)
            {
                pass ++;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Number of students pass is " + pass + " While number of failed students is " + (sMarks.length - pass));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
