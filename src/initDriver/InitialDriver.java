package initDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.SignupLoginPage;
import pages.SignupPage;
import utility.FindProperty;

public class InitialDriver {
	
	protected WebDriver driver;
	protected HomePage homePage;
	protected SignupLoginPage signupLoginPage;
	protected SignupPage signupPage;
	
	@BeforeMethod
	public void startBrowser() throws IOException, InterruptedException {
		
		//start browser
		if(FindProperty.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			// install extension adblock to prevent google ad
			// other browser I have not researched yet
			ChromeOptions options = new ChromeOptions();
			options.addArguments("load-extension=C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\gighmmpiobklfepjocnamgkkbiglidom\\5.6.0_0");
			driver = new ChromeDriver(options);
			
			Thread.sleep(10000);
			driver.switchTo().newWindow(WindowType.TAB);
			
		}
		else if(FindProperty.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(FindProperty.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		// maximize and set implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// go to URL
		driver.navigate().to(FindProperty.getProperty("base_URL"));
		
		// declare pages
		homePage = new HomePage(driver);
		signupLoginPage = new SignupLoginPage(driver);
		signupPage = new SignupPage(driver);
		
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
	//	Thread.sleep(3000);
		driver.quit();
	}
	
}	
