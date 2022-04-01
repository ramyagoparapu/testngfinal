package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Scenario3;

import util.Browserfactory;

public class Scenario3test {
	WebDriver driver;
	@Test
public void testingscenarios() throws InterruptedException {
	driver=Browserfactory.init();
	Scenario3 scene=PageFactory.initElements(driver, Scenario3.class);
	scene.monthfinder();
}
}