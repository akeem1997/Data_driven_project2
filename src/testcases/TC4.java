package testcases;

import org.testng.annotations.Test;

import objectRepo.HomePageOR;
import objectRepo.TestingFormPageOR;
import utilities.baseclass;

public class TC4 extends baseclass {
	
	
	@Test(priority = 1)
	public void presetup() {
		openBrowser("chrome");
		openURL();
		
		
	}
	
	@Test(priority = 2)
	public void navigatetestingformpage() {
		HomePageOR.clickTestingFormPage();
	}
	
	@Test(priority = 3)
	public void formfill(String fname, String lname, String add, String citizen, String gender, String interest) {
		TestingFormPageOR.formFill(fname, lname, add, citizen, gender, interest);
		alertAction("ok");
		
	}

}
