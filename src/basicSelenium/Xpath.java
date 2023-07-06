package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Velocity");

		// Customization Of X path-1) Contains Method

		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Corporate");

		// Text Merthod
		String textonelement = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();

		System.out.println(textonelement);

	}

}
