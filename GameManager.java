import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private final List<String> games = new ArrayList<>();

    public void addGame(Scanner scanner) {
        System.out.print("Enter the name of the game: ");
        String gameName = scanner.nextLine();
        games.add(gameName);
        System.out.println(gameName + " was added to your collection.");
    }

    public void viewGames() {
        if (games.isEmpty()) {
            System.out.println("Your game collection is empty.");
            return;
        }

        System.out.println("Your games:");
        for (int i = 0; i < games.size(); i++) {
            System.out.println((i + 1) + ". " + games.get(i));
        }
    }

    public void removeGame(Scanner scanner) {
        if (games.isEmpty()) {
            System.out.println("There are no games to remove.");
            return;
        }

        viewGames();
        System.out.print("Enter the number of the game to remove: ");

        if (scanner.hasNextInt()) {
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < games.size()) {
                String removedGame = games.remove(index);
                System.out.println(removedGame + " was removed.");
            } else {
                System.out.println("Invalid game number.");
            }
        } else {
            System.out.println("That is not a valid number.");
            scanner.next();
        }
    }
}
