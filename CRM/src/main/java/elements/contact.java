package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact {
	public contact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"sitemap-entity-Contact\"]/div/div/div[2]")
	WebElement contactmodule;
	
public void clickcontactmodule() {
	contactmodule.click();
}

@FindBy(xpath="//*[@id=\"contact|NoRelationship|HomePageGrid|Mscrm.NewRecordFromGrid11-button\"]/span/span[2]")
WebElement newcontact;
public void createnewcontact() {
	newcontact.click();
}

@FindBy(xpath="//*[@id=\"id-ca0d66aa-29bd-4c48-a6c3-3b3b292283e8-1-salutation4273edbd-ac1d-40d3-9fb2-095c621b552d-salutation.fieldControl-text-box-text\"]")
WebElement salutation;

public void enterSalutation() {
	salutation.sendKeys("Mrs");
}

@FindBy(xpath="//*[@id=\"id-ca0d66aa-29bd-4c48-a6c3-3b3b292283e8-2-fullname_compositionLinkControl_firstname4273edbd-ac1d-40d3-9fb2-095c621b552d-fullname_compositionLinkControl_firstname.fieldControl-text-box-text\"]")
WebElement firstName;

public void enterFirstName() {
	firstName.click();
	firstName.sendKeys("Mary");
}

@FindBy(xpath="//*[@id=\"id-ca0d66aa-29bd-4c48-a6c3-3b3b292283e8-4-fullname_compositionLinkControl_lastname4273edbd-ac1d-40d3-9fb2-095c621b552d-fullname_compositionLinkControl_lastname.fieldControl-text-box-text\"]")
WebElement lastName;

public void enterlastName() {
	lastName.click();
	lastName.sendKeys("Jane");
}

@FindBy(xpath="//*[@id=\"contact|NoRelationship|Form|Mscrm.SavePrimary02-button\"]/span/span[2]")
WebElement save;

public void clickSave() {
	save.click();
}

}
