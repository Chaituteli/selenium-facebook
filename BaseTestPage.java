package facebookpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vstl.loops.constructor.Utilities;

public class BaseTestPage extends Utilities {

	 public WebDriver objWebDriver;
	
		public void intilazeMethod() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAITALI\\eclipse-workspace\\seleniumAutomationTraining\\Driver\\chromedriver.exe");
			 objWebDriver =new ChromeDriver();
			this.WebDriver(objWebDriver);
			objWebDriver.get("https://www.facebook.com/signup");
			objWebDriver.manage().window().maximize();
		}
       // public void tearDown() {
        //	objWebDriver.close();
      //  }
		public WebDriver getobjWebDriver() {
			return  objWebDriver;
			}
       
		public void WebDriver( WebDriver objWebDriver) {
			this.objWebDriver=objWebDriver;
			
		}
	}


