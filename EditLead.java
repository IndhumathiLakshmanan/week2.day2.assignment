package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[14]")).sendKeys("ARUN");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		String title = driver.getTitle();

		if(title.equals("View Lead | opentaps CRM"))

		{
			System.out.println(" View Lead page");
		}
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("LINK");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
driver.close();





	}

}
