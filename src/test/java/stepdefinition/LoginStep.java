package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    // salaar
	}

	@When("user login with valid credentials")
	public void user_login_with_valid_credentials() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();;
		
	
	}

	@Then("user should be taken to inventory")
	public void user_should_be_taken_to_inventory() {
		String actualpageurl=driver.getCurrentUrl();
		String expectedurl="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualpageurl, expectedurl);

	}


}
