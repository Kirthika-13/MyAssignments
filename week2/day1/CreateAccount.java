package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kirthika-Test Account");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDD=driver.findElement(By.xpath("(//select [@class='inputBox'])[2]"));
		Select secIndustry = new Select(industryDD);
		secIndustry.selectByIndex(4);
		
		WebElement ownershipDD=driver.findElement(By.xpath("(//select [@class='inputBox'])[3]"));
		Select secOwnership = new Select(ownershipDD);
		secOwnership.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD=driver.findElement(By.id("dataSourceId"));
		Select secSource = new Select(sourceDD);
		secSource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select secMarketing = new Select(marketingCampaignDD);
		secMarketing.selectByIndex(6);
		
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select secState = new Select(stateDD);
		secState.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		
	}

}
