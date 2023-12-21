package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[3]")).sendKeys("Kirthika");
		driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[4]")).sendKeys("Rajesh");
		driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[5]")).sendKeys("kirthika1304@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[6]")).sendKeys("Kirthika1304@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Qwerty@2024");
		
		
		WebElement dateDD=driver.findElement(By.id("day"));
		Select secDate = new Select(dateDD);
		secDate.selectByValue("13");
		
		WebElement monthDD=driver.findElement(By.id("month"));
		Select secMonth = new Select(monthDD);
		secMonth.selectByValue("4");
		
		WebElement yearDD=driver.findElement(By.id("year"));
		Select secYear = new Select(yearDD);
		secYear.selectByValue("1996");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		

	}

}
