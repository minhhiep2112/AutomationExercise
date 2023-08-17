package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FindProperty {
	
	public static String getProperty(String key) throws IOException {
		FileInputStream f = new FileInputStream("./configuration/data.properties");
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key).toString();
	}
	
	public static String getSignupLoginPageProperty(String key) throws IOException {
		FileInputStream f = new FileInputStream("./configuration/signupLoginPage.properties");
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key).toString();
	}
	
	public static String getSignupPageProperty(String key) throws IOException {
		FileInputStream f = new FileInputStream("./configuration/signupPage.properties");
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key).toString();
	}
	
	public static String getHomePageProperty(String key) throws IOException {
		FileInputStream f = new FileInputStream("./configuration/homePage.properties");
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key).toString();
	}
	
}
