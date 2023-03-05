package objectRepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class TestingFormPageOR extends baseclass {
	public static By FirstName = By.xpath("//input[@id=\"ts_first_name\"]");
	public static By LastName  = By.xpath("//input[@id=\"ts_last_name\"]");
	public static By address  = By.xpath("//textarea[@id=\"ts_address\"]");
	public static By nationality = By.xpath("//select[@id=\"ts_country\"]");
	public static By male = By.xpath("//input[@value=\"male\"]");
	public static By female = By.xpath("//input[@value=\"female\"]");
	public static By cricket = By.xpath("//input[@id=\"ts_checkbox1\"]");
	public static By football = By.xpath("//input[@id=\"ts_checkbox2\"]");
	public static By hockey = By.xpath("//input[@id=\"ts_checkbox3\"]");
	public static By submit = By.name("Submit1");
	public static By pageheading = By.xpath("//strong[contains(text(), \"Automation Testing Form\")]");
	
	public static void formFill(String fname, String lname, String add, String citizen, String gender, String interest) {
		
		enterTxt(FirstName, fname);
		enterTxt(LastName, lname);
		enterTxt(address, add);
		select(nationality, citizen);
		
		if (gender.equalsIgnoreCase("Male")) {
			click(male);
			
		} else if(gender.equalsIgnoreCase("Female")) {
			click(female);
			

		}else {
			System.out.println("Invalid input:-" + gender);
		}
		
		if (interest.equalsIgnoreCase("cricket")) {
			click(cricket);
			
		} else if (interest.equalsIgnoreCase("football")) {
			click(football);
		}
		else if(interest.equalsIgnoreCase("hockey")){
			click(hockey);
			
			
		}
		else {
			System.out.println("invalid input:-" + interest);
		}
		
		click(submit);
		

		}
		
		
	}


