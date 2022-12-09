import java.util.Scanner;

public class Main {

    private static double calculateValue(double taskValue, double quisValue, double midValue, double lastValue) {
            return ( (taskValue + (taskValue * 0.1)) + (quisValue + (quisValue * 0.1)) +
            (midValue + (midValue * 0.2)) + (lastValue + (lastValue * 0.35)) ) / 4;
        }

    public static void main(String[] args) {

        // Pre-defined process
        String studentName, studentId;
        double taskValue, quisValue, midValue, lastValue, result;


        // Using java library / class Scanner to get input from user
        Scanner inputStudentName = new Scanner(System.in);
        Scanner inputStudentId = new Scanner(System.in);
        Scanner inputTaskValue = new Scanner(System.in);
        Scanner inputQuisValue = new Scanner(System.in);
        Scanner inputMidValue = new Scanner(System.in);
        Scanner inputLastValue = new Scanner(System.in);

        System.out.print("Input your name : ");
        studentName = inputStudentName.next();

        System.out.print("Input your id : ");
        studentId = inputStudentId.next();

        System.out.print("Input task value : ");
        taskValue = inputTaskValue.nextFloat();

        System.out.print("Input quis value : ");
        quisValue = inputQuisValue.nextFloat();

        System.out.print("Input mid value : ");
        midValue = inputMidValue.nextFloat();

        System.out.print("Input last value : ");
        lastValue = inputLastValue.nextFloat();

        result = calculateValue(taskValue,quisValue,midValue,lastValue);
        System.out.println();

        System.out.println(studentName + " Your value : " + result);

    }
}