package SCRIPT;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BASEDATA.browser_open;
import LOGINPOM.webelement_identification;

public class take_screenshot extends  browser_open {
	
	/*
	                     Takesscreenshot(I){use for getscreenshot}
	  searchcontex(I)-->>     webdriver (I)-->>remotewebdriver (class)-->>multiple driver classs
	                    javascriptexcutor(I){used for scrollbar handling}
	         */
	
	
@Test
public void TC_001() {
	webelement_identification login=PageFactory.initElements(driver, webelement_identification.class);
	login.getTxt_email().sendKeys("84783849936");
	login.gettxt_pass().sendKeys("nkjdsankf");
	login.getbtn_login().click();
	
}
	
	
}
