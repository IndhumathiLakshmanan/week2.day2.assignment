package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("home")).click();

		driver.get("http://leafground.com/pages/Button.html");
		WebElement position = driver.findElement(By.id("position"));
		System.out.println(position.getLocation());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("size")).getSize());

	}

}
