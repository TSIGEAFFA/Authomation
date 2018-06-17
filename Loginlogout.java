package seleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlogout {

	public static void main(String[] args) {
		// this  program is to login and logout in newtour project 
       //
		//??System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tsi\\Downloads\\geckodriver.exe\\");
		//WebDriver driver = new FirefoxDriver();
		//meaning give me a webdriver call it driver and add FirefoxDriver in it.
		//cup solomon's cup = new tea();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//works for all element it waits for 5 sec if it could not find the element in the 1st try.
		//and we do not need try and catch for every declaration if we put driver.manage @ the top.
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());gives u over all codes of the page
		System.out.println( "Page ID is " + driver.getWindowHandle());
		// will print the ID of current windo
		//driver.navigete().to("https://www.google.com");
		//driver.navigete().back();
		//driver.switchTo();//switch b/n page,freams..
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		// ask Solomon i added it
		//SIGN-OFF link is my check point
		try {
			// should be removed
			driver.findElement(By.linkText("SIGN-OFF")).click();
			System.out.println("Test case passed");
			
		}catch(Exception e) {
			System.out.println("Test case case faild");
		}
		driver.quit();
		
	}

}
