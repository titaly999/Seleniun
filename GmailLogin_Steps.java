package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin_Steps {
	
	public static WebDriver driver;
	public static WebDriverWait ExWait;
	
public void ExplicitWait() {		
		
		 ExWait=new WebDriverWait(driver,400);		
	}
	
	@Given("^User is on Homepage$")
	public void user_is_on_Homepage() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\Parul\\Framework\\GmailAutomation\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 driver.get("https://www.gmail.com");
		 //driver.manage().window().maximize();
		
	}
	
	@When("^Enter \"(.*?)\" and click on Next button$")
	public void enter_and_click_on_Next_button(String Username) throws Throwable {
	    
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}
	
	@When("^Enter \"(.*?)\" and click on Next Button$")
	public void enter_and_click_on_Next_Button(String Password) throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
	
	@When("^Click on Compose button$")
	public void click_on_Compose_button() throws Throwable {
		
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
	}
	
	@When("^Enter \"(.*?)\" and \"(.*?)\"$")
	public void enter_and(String EmailId, String Subject) throws Throwable {
	    
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(EmailId);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys(Subject);
		driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("Hi User, /n This is the test mail to infrm you that testing of Gmail Automation is in progress. /n Thank you, /n Support Team.");
	}
	
	@Then("^click on send button$")
	public void click_on_send_button() throws Throwable {
	   
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}

}

