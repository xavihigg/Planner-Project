import junit.framework.*;
//William Fenlon
/**
 * Write a description of class logoutTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class logoutTest extends TestCase
{
    public static void main(String[] args){
        junit.textui.TestRunner.run(logoutTest.class);
    }

    

    public void testLogoutTest()
    {
        assertEquals(true, Controller.login("test", "test"));
        assertEquals(true, Controller.logout());
    }
}




