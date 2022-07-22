package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Table {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();
		
		List<WebElement>  column = driver.findElements(By.tagName("tr"));	
		
		int column1Index = column.size();
		
		System.out.println("Column count "+ column1Index);
		
		List<WebElement>  row = driver.findElements(By.tagName("tr"));
		
		int row1Index = row.size();
		
		System.out.println("Row count "+ row1Index);

		driver.findElement(By.xpath("//font[contains(text(),'Learn to')]/following::font[contains(text(),'80%')]/following::input[1]")).click();
		
		driver.findElement(By.xpath("//font[contains(text(),'Learn to')]/following::font[contains(text(),'20%')]/following::input[1]")).click();
		
	}}
		

		