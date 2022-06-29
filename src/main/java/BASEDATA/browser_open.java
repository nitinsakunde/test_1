package BASEDATA;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class browser_open {
	public static WebDriver driver;
	@BeforeMethod
	public void m1() {
		 WebDriverManager.edgedriver().setup();
		 	driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
		     driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //implicitywait is apply globally over the all webelement
		                                                                      //means if one of webelement is not identify then it gives noelement found exception
		                                                                      //if we give implicity wait then before provide noelementexception it wait for given time and then provide exception
		     
	}
	@AfterMethod
	public void m2() throws IOException {
		//bellow code is for taking screenshot after test case excution
		/*System.out.println("nds");
	String RS=RandomString.make(4);   //if you execute same test and take ss then name of that file is same so it only overide that file so we used randomstring method to avoid override
	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE); //take screenshot as a file and store into file i.e src soure
		
		File drc=new File("C:\\Users\\Dell\\eclipse-workspace\\BATCH_10A_PROJECT\\framework\\screenshot\\fb_login\\"+RS+".png"); //make a destination location  
		FileUtils.copyFile(src, drc); //move file from src to drc w.t.h fileutils class which have copyfile method
		*/
	}
}
