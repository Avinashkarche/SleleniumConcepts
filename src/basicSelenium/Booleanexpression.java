package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booleanexpression {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://amazon.in");
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1' or text()= 'Hello, sign in']")).click();
	}
}
