package main.model;

public class Contact {
    private long phoneNumber;
    private String contactName;
    private String contactEmail;
    private String contactImage;

// getter and setter functions for phoneNumber

    public Contact(long phoneNumber, String contactName, String contactEmail){
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        contactImage = null;
    }

    public Contact(){
        phoneNumber = 0;
        contactName = null;
        contactEmail = null;
        contactImage = null;

    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long x) {
        phoneNumber = x; }


// getter and setter functions for contactName

    public String getContactName(){
        return contactName;
    }

    public void setContactName(String x) {
        contactName = x;
    }


// getter and setter functions for contactEmail

    public String getContactEmail(){
        return contactEmail;
    }

//    public void setContactEmail (String x) {
//        contactEmail = x;
//    }


// getter and setter functions for contactImage

    public String getContactImage(){
        return contactImage;
    }

//    public void setContactImage (String x) {
//        contactImage = x;
//    }
}