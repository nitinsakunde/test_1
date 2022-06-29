package LIBRARY;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;



public class library {
	 public static WebDriver driver;

	
		
public static void custom_sendkey(WebElement element,String value) {  //if you want to create generic method for perticular code then used static keyword
		
		try{
			element.sendKeys(value);
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}

	
	
}
public static void getScreenShotCapture() throws IOException {
	String RS=RandomString.make(6);
	TakesScreenshot ND=(TakesScreenshot)driver;
	File src=ND.getScreenshotAs(OutputType.FILE); //take screenshot as a file and store into file i.e src soure
	
	File drc=new File("C:\\Users\\Dell\\eclipse-workspace\\BATCH_10A_PROJECT\\framework\\screenshot\\fb_login"+RS+".png"); //make a destination location  
	FileUtils.copyFile(src, drc); //m
}
}
