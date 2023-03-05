package testcases;

import org.testng.annotations.Test;

import objectRepo.HomePageOR;
import objectRepo.TestingFormPageOR;
import utilities.baseclass;

public class TC2 extends baseclass {
	@Test
	public void test1() throws Exception {
		openBrowser("Chrome");
		openURL();
		HomePageOR.clickTestingFormPage();
		TestingFormPageOR.formFill("sam", "hpba", "goajahha", "India", "Male", "Footbal");
		
		Thread.sleep(5000);
		driver.quit();
		
		
		shutDown();
		
	
		
	}

}
