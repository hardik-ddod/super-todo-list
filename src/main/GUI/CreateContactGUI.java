package main.GUI;

import main.model.Contact;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CreateContactGUI extends JFrame{
    JTextField name;
    JTextField phone;
    JTextField email;
    String iName;
    String iEmail;
    Long iPhone;

    public CreateContactGUI(){
        super("Contact List");
        ((JPanel) getContentPane()).setBorder(new EmptyBorder(13, 13, 13, 13) );
        setLayout(new FlowLayout());

        JButton makeContact = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iName = name.getText();
                iEmail = email.getText();
                iPhone = Long.parseLong(phone.getText());

                Contact newContact = new Contact(iPhone, iName, iEmail);
                
            }
        });

        name = new JTextField(50);
        phone = new JTextField(50);
        email = new JTextField(50);

        iName = null;
        iEmail = null;
        iPhone = null;







    }

    public void actionPerformed(ActionEvent e){
    }
}
