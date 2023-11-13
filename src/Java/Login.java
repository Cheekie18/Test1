package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//user//eclipse-workspace//chromedriver-win64");
     
	  WebDriver d= new ChromeDriver();  
      
      d.get("https://www.makemytrip.com/");  //URL
      d.close();
    
}
	
}
