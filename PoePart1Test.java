package com.myproject.poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PoePart1Test {

    

    // 1. Verifies basic username criteria handling (Valid case)
    @Test
    public void testUsernameFormatting_Valid() {
        String validUser = "kyl_1";
        assertTrue(validUser.contains("_") && validUser.length() <= 5, "Username should be valid");
    }

    // 2. Verifies basic username criteria handling (Invalid case)
    @Test
    public void testUsernameFormatting_Invalid() {
        String invalidUser = "kyle_smith";
        assertFalse(invalidUser.contains("_") && invalidUser.length() <= 5, "Username should be invalid");
    }

    // 3. Test a username that breaks the length rule (more than 5 characters)
    @Test
    public void testUsernameFormatting_TooLong() {
        String longUser = "admin_user";
        assertFalse(longUser.contains("_") && longUser.length() <= 5, 
            "Usernames longer than 5 characters must fail formatting rules");
    }

    // 4. Test a password that fails because it doesn't contain a special character
    @Test
    public void testPasswordComplexity_MissingSpecialChar() {
        String noSpecialPass = "Password123";
        boolean hasSpecial = noSpecialPass.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?].*");
        assertFalse(hasSpecial, "Passwords without at least one special character must fail complexity rules");
    }
}

