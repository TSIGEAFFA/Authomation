package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElementCommonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement userName =driver.findElement(By.name("userName"));
		userName.clear();//if it has some text it will clear it
		userName.click();// clicking the element of it is click-able
		System.out.println("user name box size is" + userName.getAttribute("size"));
		System.out.println("user name input type is " + userName.getAttribute("type"));
      Point Location = userName.getLocation();// helps to find location
      System.out.println("Input box is located at:" + "x="+ Location.x + "and Y=" + Location.y);
      Dimension Size = userName.getSize(); //getting the size of the element
      System.out.println("size of Input box is" + Size.height+","+Size.width);
	//userName.getTagName(); helps to find the tag name of the element
     System.out.println("Tag name of the element  is:" + userName.getTagName());
	// helps you find text b/n opening and closing tag like < > text </ >
     System.out.println("Text of the element  is:" + userName.getText());
     //for the sign on link to find text
     System.out.println( "text of the sign-on"+ driver.findElement(By.linkText("SIGN-ON")).getText());
     if(userName.isDisplayed())
    		 {
    	 System.out.println("yes user name is visiable on the current page");
     }else{
    	 System.out.println("Element is not visiable on the current page");
     }
    	 if (userName.isEnabled()) {
    	System.out.println("element is active on the screen");
    }	else {
    	System.out.println("element is not active on the screen");
    }
    if (userName.isSelected()) {
    	System.out.println("element is selected right now");
    }else {
    	System.out.println("element is not selected right now");
    }
    //used to find back ground color
    	 
     System.out.println( "Back ground color of userName is"+ userName.getCssValue("background color"));
	userName.sendKeys("Tsigereda");//to find the element & write on it
	//userName.submit(); helps to do next action
	}
	

}
