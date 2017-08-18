package generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class DemoA {
	@Test
	public void testA(){
		Reporter.log("Executing testA",true);
	}
   @Test
   public void testB(){
	   Reporter.log("Executing testB",true);
	   Assert.fail();
   }
}
