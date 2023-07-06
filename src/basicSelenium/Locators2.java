package basicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import paramerisation.MethodForUseExcelDataInScript;

public class Locators2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		// By Name
		//driver.findElement(By.name("firstname")).sendKeys("Avinash");  
		
		//driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Karche");
		MethodForUseExcelDataInScript er = new MethodForUseExcelDataInScript();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(er.readData(4, 0));
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys(er.readData(4, 1));
	}

}
