package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Account;
import be.pxl.ja.streamingservice.model.Profile;
import be.pxl.ja.streamingservice.model.PasswordUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordUtilCalculateStrengthTest {
    private String password;

    @Test
    public void returnsScore0WhenPasswordHasLessThan6Characters() {
        password = "test";
        assertEquals(0, PasswordUtil.calculateStrength(password));
    }
    
    @Test
    public void returnsScore0WhenPasswordHasLessThan6CharactersAndEverySymbol() {
        password = "tE5t*";
        assertEquals(0, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void returnsScore3WhenPasswordHasBetween6and10Characters() {
        password = "testtest";
        assertEquals(3, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void returnsScore4WhenPasswordHasMoreThan10Characters() {
        password = "testtesttest";
        assertEquals(4, PasswordUtil.calculateStrength(password));
    }
    
    @Test
    public void returnsScore10WhenPasswordHasMoreThan10CharactersAndEverySymbol() {
        password = "testTEST123*!";
        assertEquals(10, PasswordUtil.calculateStrength(password));
    }
    
    @Test
    public void returnsScore8WhenPasswordHas10CharactersAnd3Symbols() {
        password = "testTEST12";
        assertEquals(8, PasswordUtil.calculateStrength(password));
    }
    
    @Test
    public void returnsScore6WhenPasswordHas10CharactersAnd2Symbols() {
        password = "testTESTtest";
        assertEquals(6, PasswordUtil.calculateStrength(password));
    }
    
    @Test
    public void returnsScore9WhenPasswordHasLessThan10CharactersAndEverySymbol() {
        password = "testT12*";
        assertEquals(9, PasswordUtil.calculateStrength(password));
    }
    
    public void returnsScore7WhenPasswordHasLessThan10CharactersAnd3Symbols() {
        password = "testT123";
        assertEquals(7, PasswordUtil.calculateStrength(password));
    }
    
    public void returnsScore5WhenPasswordHasLessThan10CharactersAnd2Symbols() {
        password = "testTEST";
        assertEquals(5, PasswordUtil.calculateStrength(password));
    }



}
