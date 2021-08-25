package Listener.IReporter;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.IReporter.Listener_test.class)
public class IReporter_test_case {
  @Test
  public void firstMethod() {
      Assert.assertTrue(true);
   }
	  
   @Test
   public void secondMethod() {
      Assert.assertTrue(true);
   }
	  
   @Test(dependsOnMethods = {"firstMethod"})
   public void thirdMethod() {
      Assert.assertTrue(false);
   }
}
