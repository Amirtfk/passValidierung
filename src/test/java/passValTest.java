import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class passValTest {

    @Test
    void passwordLengthValid(){

    // GIVEN
    String passwordLength = "12345678";
    // WHEN
    String actual = passVal.lengthOfPass(passwordLength);
    // THEN
    assertEquals("Password is valid!", actual);
    }


    @Test
    void passwordLengthUnvalid(){

        // GIVEN
        String passwordLength = "12345";
        // WHEN
        String actual = passVal.lengthOfPass(passwordLength);
        // THEN
        assertEquals("Pass is invalid", actual);
    }



    @Test
    void passNumberIs(){

        // GIVEN
        String passZahl = "0123456789";
        // WHEN
        Boolean actual = passVal.passNumber(passZahl);
        // THEN
        assertTrue(actual);
        //assertEquals("true", actual);
    }

    @Test
    void passNumberIsNot(){

        // GIVEN
        String passZahl = "";
        // WHEN
        Boolean actual = passVal.passNumber(passZahl);
        // THEN
        assertFalse(actual);
        //assertEquals("true", actual);
    }
}
