package SOLID_Principles.SRP;

// Here SRP is getting violated because of two different responsibilities:
// 1. Email Compose
// 2. Email Send
// This class is of sending an email, so we can divide the methods in two seperate classes.

public class EmailSending {
    public void composeEmail(String recipients, String subject, String body){
        //Logic of composing an email
    }

    public void sendEmail(){
        //Logic of sending an email
    }
}
