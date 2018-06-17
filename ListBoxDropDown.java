package seleniumCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		//selecting from dropdown list
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
	    driver.findElement(By.xpath("/html/body/form/select[1]/option[3]")).click();
	    Select country=new Select(driver.findElement(By.name("country")));
	    Thread.sleep(8000);
	    country.selectByIndex(3);
	    country.selectByVisibleText("India");
	    Thread.sleep(6000);
	    country.selectByValue("FRANCE");
	    //selecting
	   Select skill = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
	  //  skill.selectByIndex
	   driver.close();
	}
	
	

}
