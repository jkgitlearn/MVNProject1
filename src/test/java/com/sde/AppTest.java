package com.sde;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
  @Test
  public void testLogin1() 
  {
	App myapp = new App();
	Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));	  //negative test case
  }
  
  @Test
  public void testLogin2()
  {
	  App myapp = new App();
	  Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));  //positive test case    both should pass
  }
  
  
  
  
}
