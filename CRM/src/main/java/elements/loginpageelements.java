package elements;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageelements {

	

	

	public loginpageelements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//public void LoginPageElement(WebDriver pWebdriver) {

        
        //this.dvr=pWebdriver; public LoginPageElement(WebDriver pWebdriver){
        //
        //        PageFactory.initElements(pWebdriver,this);
        //        //this.dvr=pWebdriver;

   //
	
	@FindBy(xpath="//*[@id=\"main\"]/section/div/div/div/div[2]/div/div/div[3]/button")
	WebElement continued;
	
	public void clickcontinue() {
		continued.click();
	}
	@FindBy(xpath = "//*[@id=\"tilesHolder\"]/div[1]/div/div/div/div[2]/div[2]/small")
    WebElement dogmacrm;
	
	

public void clickloginbtn() throws InterruptedException  {
	dogmacrm.click();
}

@FindBy(xpath="//*[@id=\"i0118\"]")
WebElement pwdelement;


public void enterPassword() {
	pwdelement.sendKeys("Rx]6vdvYPJ4J>5:D");
}

@FindBy(css="#idSIButton9")
WebElement signinbtn;

public void clickSigninBtn() {
	signinbtn.click();
	
}
//@FindBy(id="#AppModuleTileSec_1_Item_13")
//WebElement salesHub;
//
//public void  salesHubClick() {
//	salesHub.click();
//}



}