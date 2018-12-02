package main.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ContactList {
    List<Contact> contactList;
    JFrame ContactListGUI;

    public ContactList(){
        contactList = new ArrayList<>();
    }

    public void addContact(){
        ContactListGUI = new JFrame();
        ContactListGUI.setVisible(true);
        ContactListGUI.setSize(600, 400);
        long phoneNumber = 0;
        String phone = null;
        String email = null;
        Contact newContact = new Contact(phoneNumber, phone, email);
        contactList.add(newContact);
    }

    public void deleteContact(Contact contact){
        if(contactList.contains(contact)){
            contactList.remove(contact);
        }
    }

}
