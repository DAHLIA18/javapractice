import java.util.Scanner;

public class DateDemo{
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month(1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month(1-31): ");
        int day = input.nextInt();

        if (month < 3) {
            month += 12;
            year--;
        }

        int dayOfWeek = (day + 13 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String dayName = days[dayOfWeek];

        System.out.println("Day of the week is " + dayName);
    }
}