package main;

import java.util.Iterator;

import java.util.List;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import elements.loginpageelements;
import elements.contact;

public class setups {
public static WebDriver driver;
@Test
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://3teenergyqa.crm11.dynamics.com/main.aspx?appid=9877474e-7e41-ec11-8c60-000d3a872e50&pagetype=dashboard&id=2701de60-8f2a-48a4-8262-4a35ca7441fa&type=system&_canOverride=true");
		//driver.get("https://3teenergyqa.crm11.dynamics.com/main.aspx?forceUCI=1&pagetype=apps");
		
		loginpageelements obj=new loginpageelements(driver);
		contact cobj=new contact(driver);
	Thread.sleep(5000);
	obj.clickloginbtn();
		Thread.sleep(5000);
		obj.enterPassword();
		Thread.sleep(5000);
		obj.clickSigninBtn();
		Thread.sleep(20000);
		cobj.clickcontactmodule();
///		obj.salesHubClick();
		//WebElement elem = driver.findElement(By.xpath("//*[@id=\"AppModuleTileSec_1_Item_13\"]"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('style')", elem);
		//elem.click();
	
		
		
		
		}
	
	

}

