package SCRIPT;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BASEDATA.browser_open;
import LIBRARY.library;
import LOGINPOM.webelement_identification;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_script extends browser_open {
	
	
	@Test
	public void TC_01() throws IOException {
		
		webelement_identification login=PageFactory.initElements(driver,webelement_identification.class);
		library.custom_sendkey(login.getTxt_email(),"8806000562");
		  try {
		    	 library.getScreenShotCapture(); //take SS here (from library class we call getscreenshot method)
		     }catch( Exception e){
		    	 System.out.println(e.getMessage());//null pointer exception i.e ND reference is null 
		    	 
		     }     
     	library.custom_sendkey(login.gettxt_pass(),"121121@@"); //from library class we call customsendkey method
     	login.getbtn_login().click();
   
		//used pagefactory class for initialize web element here 
		//if we need to write test case for positive + negative senario for same functionality then we like this 
	    //it is part of framework ,for code reusability we used pom
		
	}
	@Test
	public void TC_02() {
		webelement_identification login=PageFactory.initElements(driver,webelement_identification.class);
		login.getTxt_email().sendKeys("650946306456");
		login.gettxt_pass().sendKeys("64509246");
		login.getbtn_login().click();
				
	}
	@Test
	public void TC_03() {
		webelement_identification login=PageFactory.initElements(driver,webelement_identification.class);
		login.getTxt_email().sendKeys("80808907607");
		login.gettxt_pass().sendKeys("bksadbeu");
		login.getbtn_login().click();
	}
	
}
