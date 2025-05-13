import java.util.Scanner;

public class VotingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Voting System ===");
        System.out.print("So gali magacaga: ");
        String name = input.nextLine();
        System.out.print("so gali da'dada: ");
        int age = input.nextInt(); 
        if (age >= 18) {
            System.out.println("Hello, " + name + "! waa codeyn karta.");
            input.nextLine();
        } else {
            System.out.println("Sorry, " + name + ". ma codeyn kartid");
        }

        input.close();
    }
}
