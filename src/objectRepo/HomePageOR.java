package objectRepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class HomePageOR extends baseclass {
	
	public static By testingFormPage = By.xpath("//a[contains(text(), \"Testing Form Page\")]");
	public static By xPathOperator = By.xpath("//a[contains(text(), \"Xpath Operators\")]");
	public static By  newTab = By.xpath("//a[contains(text(), \"NewTab\")]");
	
	public static void clickTestingFormPage() {
		click(testingFormPage);
		
		
	}
	
	public static void clickxPathOperator () {
		click(xPathOperator);
		
		
	}
	
	public static void clickNewTab () {
		clickNewTab();
		
	
	}
		 
			 
		 
	

}
