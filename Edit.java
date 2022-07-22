package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");


		driver.manage().window().maximize();


		driver.findElement(By.id("email")).sendKeys("test@gmail.com");

		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Press",Keys.TAB);

		String printdefaultest = driver.findElement(By.name("username")).getAttribute("value");

		System.out.println(printdefaultest);

		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[5]/input")).isEnabled());

	}
}

