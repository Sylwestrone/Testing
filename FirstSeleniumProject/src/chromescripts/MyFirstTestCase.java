package chromescripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyFirstTestCase {

	public static void main(String[] args) {
		
		
		
		//WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		//driver.get("http://www.google.com");
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\firefox_driver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		//driver.quit();
		String source = driver.getPageSource();
		//System.out.println(source);
		String str = driver.findElement(By.id("user_message")).getAttribute("text");
		//System.out.println(str);
		
	}

}
