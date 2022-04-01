package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Factory;

import util.Browserfactory;



public class Scenariotestng  extends Browserfactory{

	
     WebDriver driver;
     public Scenariotestng(WebDriver driver) {
    	 this.driver=driver;
     }
     @FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/input[1]") WebElement createcategoryElement;
     @FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/input[2]") WebElement addcategorybuttonWebElement;
     @FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[2]")WebElement duedayElement;
    @FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[3]") WebElement duemonthelement;
    @FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[4]")WebElement dueyearElement;
    @FindBy(how=How.XPATH,using="//span[text()='TechFiosseptember']")WebElement actualelementElement;
public void addcategory() throws InterruptedException {
//createcategoryElement.sendKeys("TechFiosseptember");
//Select select=new Select(duedayElement);
//select.selectByVisibleText("5");
//Select select2=new Select(duemonthelement);
//select2.selectByVisibleText("Mar");
//Select select3=new Select(dueyearElement);
//select3.selectByVisibleText("2022");
//
//Thread.sleep(2000);
//	addcategorybuttonWebElement.click();
//	Thread.sleep(3000);
//driver.navigate().back();
	String actualval= actualelementElement.getText();
    Assert.assertEquals(actualval, "TechFiosseptember");
  	 System.out.println("assertion passed");
   }


}
