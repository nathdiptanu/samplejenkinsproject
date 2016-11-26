package test.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("dip");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("dip1");
	  System.out.println("dip11");
	  System.out.println("dip12");
	  System.out.println("dip13");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("dip2");
  }

 
}
