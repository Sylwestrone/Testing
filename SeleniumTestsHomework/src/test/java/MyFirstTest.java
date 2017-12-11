import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startTest() {
        System.setProperty("webdriver.gecko.driver", "/home/ozinii/Selenium/Drivers/geckodriver-v0.19.1-linux64/geckodriver");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("http://seleniumsimplified.com");

        Assert.assertEquals("title should start differently", webDriver.getTitle().startsWith("Selenium Simplified"));
    }
}
