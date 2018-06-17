package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementBy {

	public static void main(String[] args) {
		// WebDriver finding element byID,Name,LinkText,partial link text 
		//xpath(absolut and relative, css selector and tag name.
		//it is not easy to find an element with x path so firebug addons or firebpath for firefox can be instoled,
		//...using this inspection method the path can be identified easly.  
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("name")).sendKeys("Tsigereda");
		driver.findElement(By.id("eml")).sendKeys("abaynehmia@gmail.com");
		driver.findElement(By.xpath("/html/body/form[1]/input[3]")).sendKeys("testme.com ");
	//absolut x path starts fom the bigning html
		//driver.findElement(By.xpath("//form[1]/input[3]")).sendKeys("i want to change my carrier ");
	// // means any thing before that so it is relative
		//driver.findElement(By.className("className")).click();// use class name if you can't find by name
	driver.findElement(By.linkText("Open Goodle")).click();// linkText
	// works good//	driver.findElement(By.partialLinkText("click the image")).click();// partial linkText
	//driver.findElement(By.tagName("....")).sendKeys(".... ");
	}
	
	

}
