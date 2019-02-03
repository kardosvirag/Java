
package pkg14_02_lampa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LampaTest {
    
    private Lampa lampa;
     
    public LampaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    lampa = new Lampa();
    }
    
    @After
    public void tearDown() {
    }
    @Test

    public void startPiros() {

        assertTrue("A lámpa kezdetben nem piros", lampa.isPiros());

        assertFalse("A lámpa kezdetben sárgán is világít!", lampa.isSarga());

        assertFalse("A lámpa kezdetben zölden is világít!", lampa.isZold());

    }
}
