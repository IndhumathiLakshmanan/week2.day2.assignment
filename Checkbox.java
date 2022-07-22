package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("((//div[@class='example'])[1]/input)[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='example'])[2]/input")).isSelected());

		if(driver.findElement(By.xpath("((//div[@class='example'])[3]/input)[2]")).isSelected())
		{
			driver.findElement(By.xpath("((//div[@class='example'])[3]/input)[2]")).click();
		}

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[1]")).click();
		
		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[2]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[3]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[4]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[5]")).click();

		driver.findElement(By.xpath("((//div[@class='example'])[4]/input)[6]")).click();


	}

}
