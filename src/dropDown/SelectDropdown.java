package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.BaseTest;
import utility.Screenshots;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseTest.initBrowser("https://www.youtube.com/signup");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(8);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Jun");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByValue("2022");

		Thread.sleep(5000);
		driver.close();
	}

}
