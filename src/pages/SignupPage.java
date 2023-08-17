package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.FindProperty;

public class SignupPage {
	WebDriver driver;
	WebDriverWait wait;
	
	// constructor to receive driver and declare explicit wait
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	// choose title
	public void chooseTitle() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("title_radio_button_xpath"))))).click();
	}
	
	// enter name
	public void enterName(String name) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("field_name_xpath"))))).sendKeys(name);
	}
	
	// enter password
	public void enterPassword(String pass) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("field_password_xpath"))))).sendKeys(pass);
	}
	
	//select date by visible text
	public void selectDate(String date) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("select_Date_xpath")))));
		Select selectDate = new Select(driver.findElement(By.xpath(FindProperty.getSignupPageProperty("select_Date_xpath"))));
		selectDate.selectByVisibleText(date);
	}
	
	//select month by visible text
	public void selectMonth(String month) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("select_Month_xpath")))));
		Select selectDate = new Select(driver.findElement(By.xpath(FindProperty.getSignupPageProperty("select_Month_xpath"))));
		selectDate.selectByVisibleText(month);
	}
	
	//select year by visible text
	public void selectYear(String year) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("select_Year_xpath")))));
		Select selectDate = new Select(driver.findElement(By.xpath(FindProperty.getSignupPageProperty("select_Year_xpath"))));
		selectDate.selectByVisibleText(year);
	}	
	
	// select check box sign up for newsletter
	public void selectNewsletterCheckBox() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("newsletter_xpath"))))).click();;
		
	}
	
	
	// enter first name
	public void enterFirstName(String fname) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("firstname_xpath"))))).sendKeys(fname);
	}
	
	// enter first name
	public void enterLastName(String lname) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("lastname_xpath"))))).sendKeys(lname);
	}	
	
	//enter company
	public void enterCompany(String comp) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("company_xpath"))))).sendKeys(comp);
	}	
	
	// enter address 1
	public void enterAddress1(String a) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("address1_xpath"))))).sendKeys(a);
	}	
	
	// select country by visible text
	public void selectCountry(String country) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("country_xpath")))));
		Select selectDate = new Select(driver.findElement(By.xpath(FindProperty.getSignupPageProperty("country_xpath"))));
		selectDate.selectByVisibleText(country);
	}	
	
	// enter state
	public void enterState(String state) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("state_xpath"))))).sendKeys(state);
	}	
	
	// enter city
	public void enterCity(String city) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("city_xpath"))))).sendKeys(city);
	}
	
	// enter zipcode
	public void enterZipcode(String zip) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("zipcode_xpath"))))).sendKeys(zip);
	}
	
	// enter mobile number
	public void enterMobileNumber(String num) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("mobile_xpath"))))).sendKeys(num);
	}
	
	// click create account button
	public void clickCreateButton() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("create_button_xpath"))))).click();
	}
	
	// click continue button
	public void clickContinueButton() throws IOException {
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath(FindProperty.getSignupPageProperty("continue_xpath"))))).click();
	}
	
	
}
