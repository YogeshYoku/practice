
package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	@Test(enabled = true)   //Execution will not happen because higherSecondary method depends on highSchool method,which was not enabled/stopped
	public void highSchool() {

System.out.println("High School");

}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
	System.out.println("Higher sec School");

}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
System.out.println("college");
}
}
