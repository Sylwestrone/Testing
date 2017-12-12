package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.FirstPage;

public class TestFirstPage extends FirstPage {
	
	private final String URL = "basic-first-form-demo.html";
	
	public TestFirstPage openViaUrl() {
		webDriver.navigate().to(URL);
		return this;
	}
	
	@Before
	public void setUp() {
		 //System.setProperty("webdriver.gecko.driver", "D:\\Pliki u¿ytkownika\\Student\\Pobrane\\geckodriver.exe");

	}
}
