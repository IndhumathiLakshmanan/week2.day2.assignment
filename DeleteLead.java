package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String Id = "";
		Thread.sleep(3000);
		Id= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
		System.out.println(Id);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(Id);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		boolean match = driver.findElement(By.xpath("//div[@class= 'x-paging-info']")).isDisplayed();

		if(match == true) {
			
			System.out.println("No Record found");
			}
			driver.close();








	}

}
