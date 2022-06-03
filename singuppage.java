package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import facebookpage.BaseTestPage;

public class singuppage extends BaseTestPage{
	
	

	
	
	public void setFirstNamefacebooksingup() {
	objWebDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(getFirstRandomName());
	}
    
	public void setLastName() {
	objWebDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(getRandomLastName());
	}

    public void  setmobilenumber() {
    	objWebDriver.findElement(By.xpath("//input[@id='u_0_o_RO']")).sendKeys(getMobileNumber1(10));
    }
   
     public void setpassword() {
    	objWebDriver.findElement(By.xpath("")).sendKeys("chaitaliteli");
    	
    }
    public void BirthDay() {
    	Select objSelect=new Select(objWebDriver.findElement(By.xpath("//input[2name=\"Birthday_day]")));
    	objSelect.selectByIndex(7);
    }
    public void BirthMonth() {
    	Select objMonth=new Select(objWebDriver.findElement(By.xpath("//input[2name=\"Birthday_month]")));
    	objMonth.selectByValue("11");
    	
    }
    public void Birthyear() {
    	Select objYear=new Select(objWebDriver.findElement(By.xpath("//input[2name=\"Birthday_year]")));
    	objYear.selectByIndex(3);
    }	
    public void Gender() {
    	objWebDriver.findElement(By.xpath("//input[@for=\"Female\"]")).sendKeys( getRandomGender());
    }
    	
    public void singupBotton() {
    	objWebDriver.findElement(By.xpath("//*[@id=\"u_0_10_S2\"]/text()")).click();
    }
    public void ternDown() {
		objWebDriver.quit();	
    }
}