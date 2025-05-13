import java.util.Scanner;

public class daysoftheweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNum;

        System.out.print("Enter a day number (1-7): ");
        dayNum = sc.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                System.out.println("Festival day");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        sc.close(); // Good practice to close the scanner
    }
}
