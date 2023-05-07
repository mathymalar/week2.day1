package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mathy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Malar");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(4);
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec1 = new Select(ownershipDD);
		sec1.selectByVisibleText("Corporation");
		WebElement marketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec2 = new Select(marketingCampaignDD);
		sec2.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KV");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms.");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing in Selenium Java and TOSCA");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mathymalar.kv@gmail.com");
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(element);
		state.selectByVisibleText("Texas");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead | opentaps CRM")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
        String title1=driver.getTitle();
		
		System.out.println(title1);
	}
	

	}


