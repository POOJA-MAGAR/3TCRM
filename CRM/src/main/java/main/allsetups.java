package main;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import elements.loginpageelements;

public class allsetups {
	public static WebDriver driver;
	public void login() throws InterruptedException {

		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://3teenergyqa.crm11.dynamics.com/main.aspx?appid=9877474e-7e41-ec11-8c60-000d3a872e50&pagetype=dashboard&id=2701de60-8f2a-48a4-8262-4a35ca7441fa&type=system&_canOverride=true");
		//driver.get("https://3teenergyqa.crm11.dynamics.com/main.aspx?forceUCI=1&pagetype=apps");
		
		loginpageelements obj=new loginpageelements(driver);
	Thread.sleep(5000);
	obj.clickloginbtn();
		Thread.sleep(5000);
		obj.enterPassword();
		Thread.sleep(5000);
		obj.clickSigninBtn();
		Thread.sleep(20000);
		
		
	}	
		
	
	
}
