package testcases;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.HomePageOR;
import objectRepo.TestingFormPageOR;
import utilities.baseclass;

public class TC3 extends baseclass {
	
	
	@Test(priority = 1)
	public void presetup() {
		openBrowser("Edge");
		openURL();
		
		
	}
	
	@Test(priority = 2)
	public void navigatetestingformpage() {
		HomePageOR.clickTestingFormPage();
	}
	
	@Test(priority = 3, dataProvider = "supplyData")
	public void formfill(String fname, String lname, String add, String citizen, String gender, String interest) {
		TestingFormPageOR.formFill(fname, lname, add, citizen, gender, interest);
		alertAction("ok");
		
	}
	
	@DataProvider
	public Object[][] supplyData() throws Exception{
		//file location to allow system to get data from it
		FileInputStream fis = new FileInputStream(".\\src\\dataSet\\testdadexcel.xlsx");
		
		//open the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//declare the sheet you want to use for reading
		Sheet sh = wb.getSheet("Signup");
		int norows = sh.getLastRowNum()+1;
		int nocols = sh.getRow(0).getLastCellNum();
		
		//declaring each dimensions
		Object[][] dataset = new Object[norows][nocols];
		
		for(int row=0; row<norows; row++) {
			for(int col=0; col<nocols; col++)
			{
			  dataset[row][col] = sh.getRow(row).getCell(col).toString();	
			}
		}
		
		return dataset;
	}
	
	@Test(priority = 4)
	public void closesbrowser() {
		shutDown();
	}
	
	
	
	
	
	
	
	
	
				
				
				
			
		}
		
		
	


