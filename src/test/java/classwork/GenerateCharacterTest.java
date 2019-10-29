package classwork;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateCharacterTest {

    @Test
    public void generateRandom() {
        GenerateCharacter newObject = new GenerateCharacter();
        String s = newObject.generateRandom();
        assertEquals(10, s.length());
    }
}