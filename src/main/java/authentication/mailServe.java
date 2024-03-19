package authentication;

public class mailServe {
    public boolean sendMail(String to, String subject, String body) {
        // Simulate sending email
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
     // Return true if email sent successfully
        return true; 
    }
}
