import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your game manager library!");
        System.out.println("This library allows you to manage your games.");
        System.out.println("What would you like to do today?");
        System.out.println("1. Add a new game");
        System.out.println("2. View your game collection");
        System.out.println("3. Remove game");
        System.out.println("4. Exit");
        int choice = scanner.nextInt();

        if (choice == 1) {
        } else if (choice == 2) {
        }else if (choice == 3) {
        }else if (choice == 4) {
        }else {
            System.out.println("Invalid Choice.");
        }
    }
}
