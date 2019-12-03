package ui;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        menu();
        options();
    }

    public void menu() {
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
    }

    public void options() {
        while (true) {
            System.out.print("command: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("whose number: ");
                    String name = scanner.nextLine();
                    System.out.print("number: ");
                    String phoneNumber = scanner.nextLine();
                    break;
                case "2":
                    System.out.println();
                    break;
                case "3":
                    System.out.println();
                    break;
                case "4":
                    System.out.println();
                    break;
                case "5":
                    System.out.println();
                    break;
                case "6":
                    System.out.println();
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
