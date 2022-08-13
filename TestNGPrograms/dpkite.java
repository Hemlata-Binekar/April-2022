//Subclass of Kite test

package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class dpkite
{
	 @DataProvider
	  public Object[][] kiteData() {
	    return new Object[][] {
	      new Object[] { "XA0634", "1234568655", "122331"},
	      new Object[] { "XA1532", "12345743", "23111111"},
	      new Object[] { "XA0634", "Sarika699!", "691991"}
	      new Object[] { "XA0453", "1765343", "111111"},
	      new Object[] { "XA0211", "1765343", "10211111"},
	    };
	 }
}
	 


