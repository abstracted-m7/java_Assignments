package DSA;

import java.util.*;

public class stackDsa {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Search for a name");
            System.out.println("4. Display all names");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String newName = scanner.nextLine();
                    namesList.add(newName);
                    System.out.println(newName + " has been added to the list.");
                    break;

                case 2:
                    System.out.print("Enter a name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (namesList.remove(nameToRemove)) {
                        System.out.println(nameToRemove + " has been removed from the list.");
                    } else {
                        System.out.println(nameToRemove + " was not found in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a name to search for: ");
                    String searchName = scanner.nextLine();
                    if (namesList.contains(searchName)) {
                        System.out.println(searchName + " is in the list.");
                    } else {
                        System.out.println(searchName + " was not found in the list.");
                    }
                    break;

                case 4:
                    System.out.println("List of names:");
                    for (String name : namesList) {
                        System.out.println(name);
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
