package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckListBoxAndMultipleSelection {

	public static void main(String[] args) {
		// how to test Radio button, check box, list box and multiple selection
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
	//testing the radio button
		driver.findElement(By.id("other")).click();
   //to get one out of same discription in the inspection of a radio button.
	// BC both all have gender and name in the discription
		//driver.findElement(By.name("gender")).get(1).click();
		//driver.findElement(By.xpath(".....")).click(); need to download the inspection
		//driver.findElement(By.cssSelector("input[name="gender"][value="female"]"));// cssSelector
	}

}
