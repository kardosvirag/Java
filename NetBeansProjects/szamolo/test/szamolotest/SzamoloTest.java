
package szamolotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import szamolo.Szamolo;
import szamolo.SzamoloException;



public class SzamoloTest {
    
    private static Szamolo sz;
    
    public SzamoloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        sz = new Szamolo();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test

    public void operationTest() {
        try {
            assertEquals(6, sz.operation(1, 5, "+"));
            assertEquals(3, sz.operation(5, -2, "plus"));
            assertEquals(11, sz.operation(11, 0, "+"));
            assertEquals(-4, sz.operation(1, 5, "-"));
            assertEquals(7, sz.operation(5, -2, "minus"));
            assertEquals(-11, sz.operation(-11, 0, "minus"));
            assertEquals(0, sz.operation(0, 100, "mul"));
            assertEquals(0, sz.operation(100, 0, "*"));
            assertEquals(15, sz.operation(5, 3, "mul"));
            assertEquals(-15, sz.operation(5, -3, "*"));
            assertEquals(-15, sz.operation(-5, 3, "mul"));
            assertEquals(15, sz.operation(-5, -3, "*"));
            assertEquals(0, sz.operation(0, 100, "/"));
            assertEquals(1, sz.operation(5, 3, "div"));
            assertEquals(1, sz.operation(3, 3, "/"));
            assertEquals(11, sz.operation(34, 3, "div"));
        } catch (SzamoloException ex) {
            fail("az operation() nem dobhat itt kivetelt.");
        }
        try {
            sz.operation(100, 0, "/");
            fail("exceptiont kell dobjon");
        } catch (SzamoloException ex) {
            assertEquals("nullaval valo osztas", ex.getMessage());

        }
        try {
            sz.operation(100, 0, "div");
            fail("exceptiont kell dobjon");
        } catch (SzamoloException ex) {
            assertEquals("nullaval valo osztas", ex.getMessage());
        }
        try {
            sz.operation(1, 1, "mas");
            fail("exceptiont kell dobjon");
        } catch (SzamoloException ex) {
            assertEquals("muvjel nem ertelmezheto", ex.getMessage());
        }
    }

    @Test
    public void plusTest() {
        assertEquals(6, sz.plus(1, 5));
        assertEquals(3, sz.plus(5, -2));
        assertEquals(11, sz.plus(11, 0));
    }

    @Test
    public void minusTest() {
        assertEquals(-4, sz.minus(1, 5));
        assertEquals(7, sz.minus(5, -2));
        assertEquals(-11, sz.minus(-11, 0));
    }

    @Test
    public void mulTest() {
        assertEquals(0, sz.mul(0, 100));
        assertEquals(0, sz.mul(100, 0));
        assertEquals(15, sz.mul(5, 3));
        assertEquals(-15, sz.mul(5, -3));
        assertEquals(-15, sz.mul(-5, 3));
        assertEquals(15, sz.mul(-5, -3));
    }
    
    @Test
    public void divTest() {
        try {
            assertEquals(0, sz.div(0, 100));
            assertEquals(1, sz.div(5, 3));
            assertEquals(1, sz.div(3, 3));
            assertEquals(11, sz.div(34, 3));
        } catch (SzamoloException ex) {
            fail("a div() nem dobhat itt kivételt.");
        }
        try {
            sz.div(100, 0);
        } catch (SzamoloException ex) {
            assertEquals("nullaval valo osztas", ex.getMessage());
        }
    }
}

