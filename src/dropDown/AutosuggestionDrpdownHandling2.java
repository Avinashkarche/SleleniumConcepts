package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseTest;

public class AutosuggestionDrpdownHandling2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = BaseTest.initBrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");

	driver.findElement(By.xpath("//*[@name='fromPlaceName']")).sendKeys("and");

	Thread.sleep(2000);

	List<WebElement> allelements = driver.findElements(By.xpath("//*[@class='ui-corner-all']"));

	for(WebElement ele:allelements)
	
	{
		String text = ele.getText();

		System.out.println(text);
	}
	

	}
	}


