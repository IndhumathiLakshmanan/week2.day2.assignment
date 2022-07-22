package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement Index = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(Index);
		select1.selectByIndex(2);
		
		WebElement Text = driver.findElement(By.name("dropdown2"));

		Select select2 = new Select(Text);

		select2.selectByVisibleText("Loadrunner");

		WebElement Value = driver.findElement(By.id("dropdown3"));

		Select select3 = new Select(Value);

		select3.selectByValue("1");

		WebElement number = driver.findElement(By.className("dropdown"));

		Select select4 = new Select(number);

		select4.selectByValue("3");

		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).click();

		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Ap",Keys.TAB);

		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[3]\"))")).click();

	}

}
