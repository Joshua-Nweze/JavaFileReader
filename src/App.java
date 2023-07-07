import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This program lets you navigate through files.");
        System.out.println("To go into a folder, enter the folder name, example you wanto to go into videos folder enter 'videos'.");
        System.out.println("To go back, the parent directory, enter '../'");

        // Initialize new scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory you want to see files in: ");
        String filePath = scanner.nextLine();

        Functions.navigate(filePath);

        String navigateFilePath;
        String confirmation;

        do {
            System.out.printf("Do you want to navigate. Current path is %s : Y or N \n", filePath);
            confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.println("Enter where you want to navigate to: NOTE: THIS IS CASE SENSITIVE");
                navigateFilePath = scanner.nextLine();
                // check if user submitted ../, this command is to go back
                if (navigateFilePath.equals("../")) {
                    filePath = filePath.replaceAll("/[^/]*$", "");
                } else {
                    filePath += "/" + navigateFilePath;
                }
            }

            Functions.navigate(filePath);

        } while (confirmation.equalsIgnoreCase("y"));

        // close scanner
        scanner.close();
    }

} 