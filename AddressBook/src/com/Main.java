package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void handleUserSelection() {
        ContactManager contactManager = new ContactManager();
        UserMenu userMenu = new UserMenu();
        List<Contact> addressBook = new ArrayList<>();
        AddressBookManager addressBookManager = new AddressBookManager();

        int x;

        do {
            int choice = userMenu.showMainMenu();
            switch (choice) {
                case 1 -> contactManager.addNewContact();
                case 2 -> contactManager.editByName(ScannerUtil.getString("Enter contact name to edit"));
                case 3 -> contactManager.deleteContact(ScannerUtil.getString("Enter contact name to delete"));
                case 4 -> addressBook = contactManager.addMultipleContacts();
                case 5 -> addressBookManager.addAddressBook(ScannerUtil.getString("Enter name of Address Book"), addressBook);
                default -> {
                }
            }
            x = ScannerUtil.getInt("Do you want to continue...press 1\n");
        } while (x == 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Main userMenu = new Main();
        userMenu.handleUserSelection();
    }
}