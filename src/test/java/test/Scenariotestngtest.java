package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Scenariotestng;
import util.Browserfactory;

public class Scenariotestngtest {
	WebDriver driver;
	
public void testingscenarios() throws InterruptedException {
	driver=Browserfactory.init();
	Scenariotestng scntng=PageFactory.initElements(driver, Scenariotestng.class);
	
	scntng.addcategory();
	
}
}
