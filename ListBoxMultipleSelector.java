package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxMultipleSelector {

	public static void main(String[] args) {
		// checking list box and multiple selection
		// Additional note there are different type of selection one and multiple,one is easy
		//for a multiple selection you have to use  control key to select mutiple choose and to undo
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		// using send keys
		driver.findElement(By.name("country")).sendKeys("india");
		//driver.findElement(By.xpath(".//select/option[@value="INDIA"]")).click();
	   //driver.findElement(BY.name"country")).findElement(By.cssSelector("option"[value="Ethiopia"])).click();
	// multiple selector
	}

}
