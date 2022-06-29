package SCRIPT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BASEDATA.browser_open;
import LOGINPOM.webelement_identification;

public class ASSERT extends browser_open {
	
	
	@Test
	public void Tc_001() {
		webelement_identification login=PageFactory.initElements(driver, webelement_identification.class);
		WebElement email=login.getTxt_email();
		email.sendKeys("8806000562");
		Assert.assertEquals(email.isEnabled(), false); //hard assert : it compare actual with expected result in boolean formateA ..if we provide true here then it check actual result is true or not ..if true then test case cant be abort if not then test case get failed  
		                                                //if it get failed then further test step does not excute
		System.out.println(email.isDisplayed());   //next step
		System.out.println("test");              //next step
		/*if(email.isEnabled()==true) {
			email.sendKeys("8805503498");
		}*/

		}
	@Test
	public void Tc_002() {
		webelement_identification login=PageFactory.initElements(driver, webelement_identification.class);
		SoftAssert soft=new SoftAssert();  //for using soft assert we need to create object of softassert class
		WebElement pass=login.gettxt_pass(); //call webelement
		pass.sendKeys("sakdfs");
		//soft.assertEquals(pass.isDisplayed(), false); // same excution as it is of hard assert
		soft.assertEquals(pass.isEnabled(),false); 
		System.out.println("test");
		soft.assertTrue(false);  //false   //soft assert : get failed then it does not abort test case it go for the next step ..it just collect exception 
		System.out.println("test2"); //it can allow to excute next step if it get failed
		
		soft.assertAll();// send all exception 
	}
		
		
	

}
