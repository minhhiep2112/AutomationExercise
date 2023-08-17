package testcases;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import initDriver.InitialDriver;
import utility.FindProperty;

public class TestCase001 extends InitialDriver{
	
	String name="TesterABC01234";
	String email="testerabcd@gmail.com";
	
	@Test
	public void TC01_RegisterUser() throws IOException, InterruptedException {
		
		// go to register page
		homePage.clickSignupLoginButton();
		
		// verify message New user sign up
		assertTrue(driver.findElement(By.xpath(FindProperty.getSignupLoginPageProperty("new_user_signup_xpath"))).isDisplayed(),
				"New user signup is not displayed!");
		
		signupLoginPage.enterSignupName(name);
		signupLoginPage.enterSignupEmail(email);
		signupLoginPage.clickSignupButton();
		
		// verify message ENTER ACCOUNT INFORMATION
		assertTrue(driver.findElement(By.xpath(FindProperty.getSignupPageProperty("enter_account_information_xpath"))).isDisplayed(),
				"Missing message!");
		
		// start fill in information
		signupPage.chooseTitle(); // Title is Mr
		signupPage.enterPassword("123456abc");		
		
		// select DOB
		signupPage.selectDate("21");
		signupPage.selectMonth("January");
		signupPage.selectYear("1989");
		
		signupPage.selectNewsletterCheckBox();
		
		// Fill in address information
		signupPage.enterFirstName("Andrew");
		signupPage.enterLastName("Vo");
		signupPage.enterCompany("ABC");
		signupPage.enterAddress1("12345 quoc lo 1A, My Tho, Tien Giang");
		signupPage.selectCountry("Singapore");
		signupPage.enterState("Tien Giang");
		signupPage.enterCity("My Tho");
		signupPage.enterZipcode("123456");
		signupPage.enterMobileNumber("987645123");
		
		// click create account button and verify message
		signupPage.clickCreateButton();
		assertTrue(driver.findElement(By.xpath(FindProperty.getSignupPageProperty("account_created_xpath"))).isDisplayed(),
				"Missing message Account created");
		
		signupPage.clickContinueButton();
		
		// verify 'Logged in as' message
		assertTrue(driver.findElement(By.xpath(FindProperty.getHomePageProperty("logged_in_as_xpath"))).isDisplayed(),
				"Missing message Logged in");
		
		// delete account
		homePage.clickDeleteButton();
		
		// verify delete massage and continue
		
		assertTrue(driver.findElement(By.xpath(FindProperty.getHomePageProperty("account_delete_message_xpath"))).isDisplayed(),
				"Missing message Account delete");
		homePage.clickContinueButton();
		
	
		
	}
	
}
