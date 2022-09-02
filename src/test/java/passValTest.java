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


    @Test
    void IsLowercase(){

        // GIVEN
        String pass = "abc";
        // WHEN
        boolean actual = passVal.passLo(pass);
        // THEN
        assertTrue(actual);
    }

    @Test
    void IsUppercase(){

        // GIVEN
        String pass = "ABC";
        // WHEN
        boolean actual = passVal.passUpp(pass);
        // THEN
        assertTrue(actual);
    }


    @Test
    void IsNotonRedLisTest(){

        // GIVEN
        String pass = "ABC";
        // WHEN
        boolean actual = passVal.isNotOnredList(pass);
        // THEN
        assertTrue(actual);
    }

    @Test
    void IsonRedLisTest(){

        // GIVEN
        String pass = "Lie";
        // WHEN
        boolean actual = passVal.isNotOnredList(pass);
        // THEN
        assertFalse(actual);
    }


}
