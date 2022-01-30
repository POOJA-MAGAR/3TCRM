package main;
import org.testng.annotations.Test;

import elements.contact;
public class contactfunction extends allsetups {

@Test	
 public static void main(String[] args) throws InterruptedException{
	contactfunction loginobj=new contactfunction();
	loginobj.login();
	contact obj=new contact(allsetups.driver);
	obj.clickcontactmodule();
	Thread.sleep(5000);
	obj.createnewcontact();
	Thread.sleep(4000);
	obj.enterSalutation();
	obj.enterFirstName();
	obj.enterlastName();
	obj.clickSave();

	}

}
