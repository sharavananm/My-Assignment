package w2d1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.partialLinkText("open-registration")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.name("firstname")).sendKeys("Saravanan");
		driver.findElement(By.name("lastname")).sendKeys("m");
		driver.findElement(By.name("reg_email__")).sendKeys("9047591703");
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
		
		WebElement day=driver.findElement(By.id("day"));
	    Select selectday=new Select(day);
	    selectday.selectByValue("1");
	    
	    WebElement month=driver.findElement(By.id("month"));
	    Select selectmonth=new Select(month);
	    selectmonth.selectByVisibleText("Jan");
	    
	    WebElement year=driver.findElement(By.id("year"));
	    Select selectyear=new Select(year);
	    selectyear.selectByValue("2001");
	    
	    //driver.findElement(By.id("u_a_4_SK")).click();
	    //driver.findElement(By.id("u_a_5_DQ")).click();
	    driver.findElement(By.name("sex")).click();  
		
		}

}
