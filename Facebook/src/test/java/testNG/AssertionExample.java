package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	String name="Yogesh";
	
	@Test
	public void checkEqual() {
		/*
		 * if(name.equals("Yogesh")) { System.out.println("Name is Equal"); } else {
		 * System.out.println("Name is not Equal"); }
		 */
		Assert.assertEquals(name,"Yogesh");
	}

}
