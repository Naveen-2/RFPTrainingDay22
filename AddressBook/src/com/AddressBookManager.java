package com;

import java.util.Hashtable;
import java.util.List;

public class AddressBookManager {
    public Hashtable<String, List<Contact>> addAddressBook(String name, List<Contact> addressBook) {
        Hashtable<String, List<Contact>> addressBookDict = new Hashtable<String, List<Contact>>();
        ContactManager contactManager = new ContactManager();
        String  opt = "a";
        do {
            addressBookDict.put(name, contactManager.addNewContact());
            opt  = ScannerUtil.getString("Press a to add more Address books\n");
        } while (opt.equalsIgnoreCase("A"));
        return addressBookDict;
    }
}