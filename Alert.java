package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// managing alerts
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
	 driver.findElement(By.id("alert")).click();
		String alert= driver.switchTo().alert().getText();
		if(alert.contains("Solomon"))
		{
			System.out.println("pass");
		}else {
			System.out.println("Fialed");
		}
		driver.switchTo().alert().accept();
		//testing prompt
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		String demo=driver.findElement(By.id("demo")).getText();
		if(demo.contains("OK"))
		{
			System.out.println("pass");
		}else {
			System.out.println("Fialed");
		}
		driver.switchTo().alert().accept();
	}
	

}
