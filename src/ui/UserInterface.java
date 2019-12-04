package ui;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private Commands commands = new Commands(scanner);

    public void run() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        options();
    }

    public void options() {
        while (true) {
            System.out.println();
            System.out.print("command: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    commands.addNumber();
                    break;
                case "2":
                    commands.searchNumber();
                    break;
                case "3":
                    commands.searchPerson();
                    break;
                case "4":
                    commands.addAddress();
                    break;
                case "5":
                    commands.getInformation();
                    break;
                case "6":
                    commands.removePerson();
                    break;
                case "7":
                    System.out.println();
                    break;
                case "x":
                    return;
                default:
                    System.out.println("That is not a valid choice.");
            }
        }
    }

}
