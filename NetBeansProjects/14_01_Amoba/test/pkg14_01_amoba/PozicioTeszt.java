
package pkg14_01_amoba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PozicioTeszt {
    
    public PozicioTeszt() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void poziNullaTeszt() {
        Pozicio p = new Pozicio(0, 0);
        assertEquals(0, p.getSor());
        assertEquals(0, p.getOszlop());
    }

    @Test
    public void poziTeszt() {
        Pozicio p = new Pozicio(1, 2);
        assertEquals(1, p.getSor());
        assertEquals(2, p.getOszlop());
    }
}
