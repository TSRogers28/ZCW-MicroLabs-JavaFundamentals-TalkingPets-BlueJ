

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CatTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CatTest
{private String name;
    /**
     * Default constructor for test class CatTest
     */
    public CatTest()
    {   this.name = name;
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
        @Test
public void catSpeakTest(){
   Pet cat = new Cat(name);
   String expected = "meow";
   String actual = cat.speak();
       
        


   Assert.assertEquals(expected, actual);
}

}
