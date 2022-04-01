package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Scenario2testng;
import util.Browserfactory;

public class Scenario2testngtest {
	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver = Browserfactory.init();
		Scenario2testng scene2 = PageFactory.initElements(driver, Scenario2testng.class);
	scene2.duplicatedcategory();
	}

}


