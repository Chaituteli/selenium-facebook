package facebookpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebook.singuppage;


    public class Testsinguppage extends BaseTestPage {

	public static void main(String[] args) {
	
		singuppage objsinguppage =new singuppage ();
		
		objsinguppage.intilazeMethod();
		//objsinguppage.ternDown();
		
		objsinguppage.setFirstNamefacebooksingup();
		
		objsinguppage.setLastName();
		
		objsinguppage.setmobilenumber();
		
		objsinguppage.setpassword();
		
		objsinguppage.BirthDay();
		
		objsinguppage.BirthMonth();
		
		objsinguppage.Birthyear();
		
		objsinguppage.Gender();
		
		objsinguppage.singupBotton();
		
	   }

        }
