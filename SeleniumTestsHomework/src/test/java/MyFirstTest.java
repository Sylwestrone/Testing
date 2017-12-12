import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startTest() {
        System.setProperty("webdriver.gecko.driver", "D:\\Pliki u¿ytkownika\\Student\\Pobrane\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("http://www.seleniumeasy.com/test/basic-first-form-demo.html");

        //Assert.assertEquals("test", webdr);
        
       // webDriver.close();
    }
}
