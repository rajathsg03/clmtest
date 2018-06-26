package com.testing.clmtest.testcases;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.testing.clmtest.util.utill;

public class Testcase1 {
	
	
	public WebDriver driver;
	
	 //@SuppressWarnings("deprecation")
	//@BeforeTest
	  //public void beforeTest() {
		/* ProfilesIni allProfiles = new ProfilesIni();
		 FirefoxProfile myProfile = allProfiles.getProfile("Test");
		 myProfile.setPreference("security.default_personal_cert", "Select Automatically");
		 FirefoxOptions firefoxoptions = new FirefoxOptions();
		 firefoxoptions.setProfile(myProfile);
		 //WebDriver driver = new FirefoxDriver(firefoxoptions);
		 
		 //FirefoxOptions options = new FirefoxOptions();
		 firefoxoptions.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //Location where Firefox is installed
			
	 
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("moz:firefoxOptions", firefoxoptions);
			capabilities.setCapability("-profile", "C:\\Users\\gowdara\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles");
			
			//set more capabilities as per your requirements
	 
			WebDriver driver = new FirefoxDriver(capabilities); */
		  //System.setProperty("webdriver.gecko.driver", utill.firefoxpath);
		
			
	  //}
	 
	 

	
 @Test()
 public void Login() throws InterruptedException {
	  

		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(utill.baseurl);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	 
	  driver.findElement(By.name("username")).sendKeys(utill.uname);
	  
	    driver.findElement(By.name("password")).sendKeys(utill.password);
	    driver.findElement(By.xpath("/html/body/div[4]/form/div/div/div[1]/div[3]/input")).click();
	    
	    	    }
	
  @AfterTest
 public void afterTest() {
	  driver.close();
 } 
 
	  
	  
  }
  
	 
	  
	

