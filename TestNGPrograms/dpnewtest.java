//Subclass of NewdpTest
package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class dpnewtest {
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }

}
