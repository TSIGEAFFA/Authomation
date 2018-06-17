package seleniumCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.linkText("Open Goodle")).click();
		String titel= driver.getTitle();
		if(titel.contains("Google"))
		{
			System.out.println("pass");
		}else {
			System.out.println("Fialed");
		}
		//getting the whole like qa online training home page
		driver.get("http://www.training.qaonlinetraining.com/");
		//List<WebElement>
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = 0;
		 for(WebElement link:links) {
			String url= link.getAttribute("href");
			System.out.println(link.getText()+":"+url);
			 count++;
		 }
		 System.out.println("Number of links:"+ count); 
	}

}
