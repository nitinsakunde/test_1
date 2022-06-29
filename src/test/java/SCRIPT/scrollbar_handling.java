package SCRIPT;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BASEDATA.browser_open;
import LOGINPOM.webelement_identification;

public class scrollbar_handling extends browser_open  {
	JavascriptExecutor JS;
	@Test
	public void TC_001() throws InterruptedException {
		
	
		JS=(JavascriptExecutor) driver;
		
		//scroll by pixel size
		JS.executeScript("window.scrollBy(0,600)", ""); //go to page>>inspect>>console>>window.scrollBy(x,y){i.e x=origin point y=end point}
		Thread.sleep(4000);
		JS.executeScript("window.scrollBy(0,-600)", ""); //if you want to handle horizontal scroll bar then put formulaa in empy space o.e second null value in this method
	}
	
	  @Test (enabled=false)
		public void TC_002() {
			
		//scroll by webelement
		
		driver.navigate().to("https://www.amazon.in/");
		 webelement_identification  amzon_HM=PageFactory.initElements(driver,  webelement_identification.class);
		 WebElement signin=amzon_HM.getLink_singin();
		 JS.executeScript("arguments[0].ScrollInView();",signin );
	}
@Test
public void TC_003() {
	 webelement_identification  fb_footerlink=PageFactory.initElements(driver,  webelement_identification.class);
     WebElement fb_links= fb_footerlink.gettext_contact();
	JS.executeScript("arguments[0].ScrollInView();", fb_links);
}
}
