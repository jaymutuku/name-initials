
package name.nameinitials;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

/**
  * InitialsTestCase.java-This class tests values returned by methods in
  * class NameInitials.For checkInitials() method I have decided to use List to
  * add the expected initials so that I can compare it with those returned by
  * extractInitials() method in NameInitials class.Though there are many ways
  * I can do it.
  * For the checkSurname() I have decided to use a
  * String to compare it with that returned
  *
  * @author 
  */

public class InitialsTestCase
{
	public NameInitials name;
	public ArrayList li;
    //always run the setUp() method before each test
	@Before
	public void setUp()
	{
		name = new  NameInitials();
        //create a new arraylist to compare it with
        //that in the class NameInitials
        li=new ArrayList();

        li.add("D");
        li.add("J");

	}
	//after running the tests free memory
	@After
	public void tearDown()
	{
		name=null;//release resources
	}

	@Test
	public void checkInitials()
	{
		List actualInitials = name.extractInitials();

		assertEquals(li,actualInitials);

	}
	@Test
	public void checkSurname()
	{
		String expectedSurname="Trump";
		String actualSurname=name.extractSurname();

		assertEquals(expectedSurname,actualSurname);
	}
}


