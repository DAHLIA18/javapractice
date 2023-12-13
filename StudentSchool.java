import java.util.Scanner;

public class StudentSchool{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter student " + i + " name: ");
            String name = input.next();
            System.out.print("Enter student " + i + " grade (A, B, C, or D): ");
            char grade = input.next().charAt(0);

            switch (grade) {
                case 'A':
                    gradeA++;
                    break;
                case 'B':
                    gradeB++;
                    break;
                case 'C':
                    gradeC++;
                    break;
                case 'D':
                    gradeD++;
                    break;
                default:
                    System.out.println("Invalid grade entered for student " + i);
            }
        }

        System.out.println("Number of students who got grade A: " + gradeA);
        System.out.println("Number of students who got grade B: " + gradeB);
        System.out.println("Number of students who got grade C: " + gradeC);
        System.out.println("Number of students who got grade D: " + gradeD);
    }
}