package pages;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.FindProperty;

public class SignupLoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	// constructor to receive driver and declare explicit wait
	public SignupLoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	// enter name to signup
	public void enterSignupName(String name) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupLoginPageProperty("signup_name_xpath"))))).sendKeys(name);;
	}
	
	// enter email to signup
	public void enterSignupEmail(String email) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupLoginPageProperty("signup_email_xpath"))))).sendKeys(email);;
	}
	
	// click on signup button
	public void clickSignupButton() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupLoginPageProperty("signup_button_xpath"))))).click();
	}
	
	
	
	
}
