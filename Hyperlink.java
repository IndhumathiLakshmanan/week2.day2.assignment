package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();	

		driver.findElement(By.linkText("Go to Home Page")).click();

		driver.get("http://leafground.com/pages/Link.html");

		String gowhere = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");

		System.out.println(gowhere);

		driver.findElement(By.linkText("Verify am I broken?")).click();

		String broken = driver.getTitle();

		if(broken.equals("404 Not Found"))

		{
			System.out.println("Page broken");}
		
	List<WebElement> number = driver.findElements(By.cssSelector("a"));
	
		int number1 = number.size();
		
		System.out.println("Total links available in the page is " + number1);
}
}