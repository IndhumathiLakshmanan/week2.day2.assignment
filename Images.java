package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.get("http://leafground.com/pages/Image.html");

		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		
		boolean selected = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isSelected();
		
		if(selected != true) {
			
			System.out.println("Image is broken");
		}
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

	}

}
