package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class browser {

	public browser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    String text = driver.findElement(By.tagName("h2")).getText();
	    System.out.println(text);
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RUBIKA");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.close();
	    
	    
	    
	}

}
