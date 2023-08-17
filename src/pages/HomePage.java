package pages;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.FindProperty;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	// click on signup/login button
	public void clickSignupLoginButton() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getHomePageProperty("signup_login_button_xpath"))))).click();
		
	}
	
	// click delete button
	public void clickDeleteButton() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getHomePageProperty("delete_account_xpath"))))).click();
		
	}
	
	public void clickContinueButton() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getHomePageProperty("continue_button_xpath"))))).click();
	}
	
}
