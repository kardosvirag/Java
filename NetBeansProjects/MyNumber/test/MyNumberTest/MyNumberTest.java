
package MyNumberTest;

import mynumber.MyNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyNumberTest {
    
    //private static MyNumber mn;
    
    public MyNumberTest() {
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
    
    public void contructorGetterTest(){
        MyNumber my = new MyNumber(123);
        assertEquals(123,my.getNumber());
        
        MyNumber my2 = new MyNumber (652);
        assertEquals (652, my2.getNumber());
        
        MyNumber m3 = new MyNumber(68);
        assertEquals (68,m3.getNumber());
    }
    
    @Test
    public void setterGetterTest(){
        MyNumber my = new MyNumber(4);
        my.setNumber(8);
        assertEquals(8, my.getNumber());
        
        MyNumber my2 = new MyNumber(1);
        my.setNumber(69);
        assertEquals (69, my.getNumber());
    }
    @Test
    public void isPrimeTest(){
        MyNumber my = new MyNumber(37);
        assertTrue(my.isPrime());
        
        MyNumber my1 = new MyNumber(6);
        assertFalse(my1.isPrime());
    }
    
    @Test
    public void toStringTest(){
        MyNumber n = new MyNumber(2);
        assertEquals("A szam a 2, ami prim.",n.toString());
    }
    
    
}
