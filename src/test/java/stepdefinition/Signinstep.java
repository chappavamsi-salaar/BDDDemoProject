package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signinstep {
	WebDriver driver;
	@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
		driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();;
		
	   
	}

	@Then("the login result should be {string}")
	public void the_login_result_should_be(String url) {
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, url);
	   
	}


}
