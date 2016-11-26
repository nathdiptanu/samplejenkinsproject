package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterMethod;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Testng {
	
 /* @Test(groups={"Cars"})
  @Parameters({"u"})
  public void f(String u) {
	
	  System.out.println("cars0");
	  System.out.println(u);
	
  }
  */
  /*@DataProvider(name="username")
  public static Object[][] credential(){
	return new Object[][]{{"aadasda","basdsads"}};
	  
  }*/
	@DataProvider
  public Object[][] Authentication() throws Exception{
	  
      Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//buntu//workspace//testng//testData//testData.xlsx","Sheet1");

      return (testObjArray);

		}

  @Test(groups={"Scooty"},dataProvider="Authentication")
  public void f1(String a1,String b1) throws Exception{
	  //System.out.println("cars2");
	  System.out.println(a1+b1);
  }
  /*@Test(groups={"Scooty","honda"})
  public void f2() {
	  System.out.println("cars1");
  }*/
}
