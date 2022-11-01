package w2d2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saravanan");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	}

}
