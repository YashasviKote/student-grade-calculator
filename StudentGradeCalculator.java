import java.util.Scanner;

public class StudentGradeCalculator {

    static String getGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 40) return "D";
        else return "Fail";
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter marks 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter marks 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter marks 3: ");
            int m3 = sc.nextInt();

            int total = m1 + m2 + m3;
            double percentage = total / 3.0;

            String grade = getGrade(percentage);

            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);
        }
    }
}
