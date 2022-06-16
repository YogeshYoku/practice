package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsHierarchyExample {
	
  @Test
  public void test() {
	  System.out.println("Im test");
  }
  @Test
  public void test2() { //Multiple Test Irunthuchuna BeforeMethod test ku Munnadi nadakkum, after method test ku apprm nadakkum
	  System.out.println("Im test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Im after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im before suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im after suite");
  }
 

}

