package page;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

import util.Browserfactory;


public class Scenario2testng extends Browserfactory {
 WebDriver driver;

	
public Scenario2testng(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/input[1]") WebElement createcategoryElement;
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/input[2]") WebElement addcategorybuttonWebElement;
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[2]")WebElement duedayElement;
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[3]") WebElement duemonthelement;
@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[4]")WebElement dueyearElement;
@FindBy(how=How.XPATH,using="//span[text()='TechFiosseptember']") WebElement duplicatedelement;

	
	public void duplicatedcategory() throws InterruptedException {
	
	createcategoryElement.sendKeys("TechFiosseptember");
	addcategorybuttonWebElement.click();
	driver.navigate().back();
	if(duplicatedelement.isDisplayed()){
		System.out.println("The category u want to add already exists");
	}else {
		System.out.println("not duplicated");
	}
		
	}}
	