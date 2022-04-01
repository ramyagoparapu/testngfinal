package page;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Browserfactory;



public class Scenario3 extends Browserfactory {
 WebDriver driver;
public Scenario3(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[3]") WebElement monthelement;
  public void monthfinder() {
	  monthelement.isEnabled();
	 Select select=new Select(monthelement);
 for(int i=0;i<=12;i++) {
	 select.selectByIndex(i);
 }
List<WebElement> m = select.getOptions();
System.out.println("Drodown list items are: ");
for (int j= 0; j < m.size(); j++) {
    String s = m.get(j).getText();
    System.out.println(s);
}
    int size=m.size();
    System.out.println(size);
    Assert.assertEquals(size, 13);
    System.out.println("assertion passed");
    
    



 }}