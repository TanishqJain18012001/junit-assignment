package authentication;

import java.util.HashMap;

public class authService {
    private HashMap<String, user> users;

    public authService() {
        users = new HashMap<>();
        users.put("example@example.com", new user("example@example.com", "password123"));
    }

    public String authenticateUser(String email, String password) {
        if (!users.containsKey(email)) {
            return "email not valid";
        }

        user user = users.get(email);
        if (!password.equals(user.getPassword())) {
            return "password not matching";
        }

        return "Login successful";
    }
}