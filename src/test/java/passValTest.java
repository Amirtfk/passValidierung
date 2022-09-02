import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class passValTest {

    @Test
    void passwordLengthValid(){

    //GIVEN
    String passwordLength = "12345678";
    // WHEN
    String actual = passVal.lengthOfPass(passwordLength);
    // THEN
    assertEquals("Password is valid!", actual);
    }


    @Test
    void passwordLengthUnvalid(){

        //GIVEN
        String passwordLength = "12345";
        // WHEN
        String actual = passVal.lengthOfPass(passwordLength);
        // THEN
        assertEquals("Pass is invalid", actual);
    }




