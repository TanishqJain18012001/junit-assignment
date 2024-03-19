package authentication;


public class user {
    private String email;
    private String password;

    public user(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public static user getUsers(String email, String password) {
        return new user(email, password);
    }
}