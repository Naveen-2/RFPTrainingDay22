package com;

import java.util.Scanner;

public class UserMenu {
    Scanner input = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("Main Menu:\n 1.Add Contact \n 2.Edit Contact \n 3.Delete Contact \n 4.Add Multiple Contacts\n 5.Add new Address Book");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

}