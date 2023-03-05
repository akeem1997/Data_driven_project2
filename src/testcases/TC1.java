package testcases;

import objectRepo.HomePageOR;
import objectRepo.TestingFormPageOR;
import utilities.baseclass;

public class TC1 extends baseclass{

	public static void main(String[] args) throws Exception {
		
		openBrowser("Firefox");
		openURL();
		HomePageOR.clickTestingFormPage(); 
		TestingFormPageOR.formFill("akeem", "atinuke", "pune", "India", "Male", "Cricket");
		Thread.sleep(7000);
		alertAction("ok");
		shutDown();
		
		
		
		
	
		
		
		
	}

}
