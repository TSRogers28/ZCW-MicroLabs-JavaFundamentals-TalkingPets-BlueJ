

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DogTest
{ String name;
    /**
     * Default constructor for test class DogTest
     */
    public DogTest()
    {this.name =name;
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
public void speakTest(){
   Pet dog = new Dog(name);
   String expected = "bark";
   String actual = dog.speak();
       
        


   Assert.assertEquals(expected, actual);
}
}
