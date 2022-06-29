package LOGINPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webelement_identification {
	
	
//encapsulation is acheive here 
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;

	public WebElement getTxt_email() {
		return txt_email;
	}

	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_pass;
	
	public WebElement gettxt_pass() {
		return txt_pass;
		
	}
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;
	
		public WebElement getbtn_login() {
			return btn_login;
		
	}
		@FindBy(how=How.XPATH,using="//a[text()='Contact uploading and non-users']")
		private WebElement text_contact;
		
		public WebElement gettext_contact() {
			return text_contact;
		}
	//amazon home page 
		@FindBy(how=How.XPATH,using="(//span[text()='Sign in'])[3]")
		private WebElement link_singin;

		public WebElement getLink_singin() {
			return link_singin;
		}
		
		
		
		}
	
	
	


