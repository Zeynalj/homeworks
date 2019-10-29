package classwork;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    private calculator c;

    @Before
    public void before111() {
        this.c = new calculator();
    }

    @Test
    public void add() {
        assertEquals(11 , c.add(5,6));
    }

    @Test
    public void sub() {
        assertEquals(-1 , c.sub(5,6));
    }

    @Test
    public void mul() {
        assertEquals(20 , c.mul(10,2));
    }

    @Test
    public void div() {
        assertEquals(10 , c.div(20,2));
    }

}