package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloseAds {
	
	
	public static void testCloseAdsGoogle(WebDriver driver) {
	    try {
	     
	        //Get element in frame by ID
	        WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
	        //Switch to frame with element
	        driver.switchTo().frame(frame1);
	        //Check button X or Close displays
	        List < WebElement > checkButtonX = driver.findElements(By.xpath("//div[@id='dismiss-button']"));
	        System.out.println("checkButtonX: " + checkButtonX.size());
	        if (checkButtonX.size() > 0) {
	            driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	        } else {
	            WebElement frame2 = driver.findElement(By.id("ad_iframe"));
	            driver.switchTo().frame(frame2);
	            Thread.sleep(1000);
	            List < WebElement > checkButtonClose = driver.findElements(By.xpath("//div[@id='dismiss-button']//span[normalize-space()='Close']"));
	            System.out.println("checkButtonClose: " + checkButtonClose.size());
	            if (checkButtonClose.size() > 0) {
	                driver.findElement(By.xpath("//div[@id='dismiss-button']//span[normalize-space()='Close']")).click();
	            } else {
	                driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	            }
	        }

	        driver.switchTo().defaultContent();
	        Thread.sleep(2000);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
