package utilty.com.selenium.script;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertionTestNG {
   
	 String Assertion = "HardAssertion ";
   @Test
   public void test_UsingHardAssertion() {
      Assert.assertTrue(true == true);
      Assert.assertEquals("HarAssertion","HardAssertion");
      Assert.assertEquals("ClassName","HArdAssertion");
       System.out.println("Fully passed");
   }
}  