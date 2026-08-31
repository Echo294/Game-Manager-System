import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameManager gameManager = new GameManager();

        while (true) {
            System.out.println("Welcome to your game manager library!");
            System.out.println("This library allows you to manage your games.");
            System.out.println("What would you like to do today?");
            System.out.println("1. Add a new game");
            System.out.println("2. View your game collection");
            System.out.println("3. Remove game");
            System.out.println("4. Exit");

            int choice;

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid Choice. Please enter a number from 1 to 4.");
                scanner.next();
                continue;
            }

            if (choice == 1) {
                scanner.nextLine();
                gameManager.addGame(scanner);
            } else if (choice == 2) {
                gameManager.viewGames();
            } else if (choice == 3) {
                gameManager.removeGame(scanner);
            } else if (choice == 4) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
