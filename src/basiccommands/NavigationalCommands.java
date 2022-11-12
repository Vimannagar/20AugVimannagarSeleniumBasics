package basiccommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationalCommands {
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
//		to maximize the browser
		
		driver.manage().window().maximize();
		
//		navigate to a url
		
		driver.get("https://www.google.com");
		
		driver.get("https://www.facebook.com");
		
//		back button 
		
		driver.navigate().back();
		
//		forward button
		
		driver.navigate().forward();
		
		
//		refresh button
		
		driver.navigate().refresh();
		

				
//		close a browser
		
		driver.close();
		
	
	}

}
