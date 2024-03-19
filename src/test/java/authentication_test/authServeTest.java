package authentication_test;

import org.junit.jupiter.api.Test;

import authentication.authService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class authServeTest {

    @Test
    public void testInvalidEmail() {
        authService authService = new authService();
        String result = authService.authenticateUser("invalid@example.com", "password123");
        assertEquals("email not valid", result);
    }

    @Test
    public void testWrongPassword() {
        authService authService = new authService();
        String result = authService.authenticateUser("example@example.com", "wrongpassword");
        assertEquals("password not matching", result);
    }

    @Test
    public void testSuccessfulLogin() {
        authService authService = new authService();
        String result = authService.authenticateUser("example@example.com", "password123");
        assertEquals("Login successful", result);
    }
}
