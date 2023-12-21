package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithCheckbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).isSelected();
		driver.findElement(By.xpath("//span[contains(text(), 'Checked')]")).isDisplayed();
		WebElement message = driver.findElement(By.xpath("//span[contains(text(), 'Checked')]"));
		System.out.println(message.getText());
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[7]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch')]")).isSelected();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-growl-item')])[2]")).isDisplayed();
		WebElement toggle = driver.findElement(By.xpath("(//div[contains(@class,'ui-growl-item')])[2]"));
		System.out.println(toggle.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled();
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
		driver.findElement(By.xpath("(//input[contains (@class, 'ui-inputfield ui-inputtext')])")).sendKeys("paris");
		driver.findElement(By.xpath("(//div[contains (@class, 'ui-chkbox-box ui-widget')])[13]")).click();
		driver.findElement(By.xpath("(//input[contains (@class, 'ui-inputfield ui-inputtext')])")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[contains (@class, 'ui-chkbox-box ui-widget')])[12]")).click();
		
}
}