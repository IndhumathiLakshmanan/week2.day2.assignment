package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Indhu");
		driver.findElement(By.name("lastname")).sendKeys("Laks");
		driver.findElement(By.name("reg_email__")).sendKeys("indhuuusy@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("indhuuusy@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Testing48!");
		WebElement day = driver.findElement(By.id("day"));
		Select first=new Select(day);
		first.selectByValue("7");
		WebElement month = driver.findElement(By.id("month"));
		Select second=new Select(month);
		second.selectByValue("2");
		WebElement year = driver.findElement(By.id("year"));
		Select third=new Select(year);
		third.selectByValue("1961");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	}

}
