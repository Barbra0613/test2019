package test;

import java.util.regex.Pattern;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestGit {
 
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  String driverPath = "/usr/local/Cellar/geckodriver/0.24.0/bin/geckodriver";
	  System.setProperty("webdriver.gecko.driver", driverPath);

  }

  @Test
  public void testGit() throws Exception {
	  File excelFile = new File("/Users/a/eclipse-workspace/test.lab2/软件测试名单.xlsx"); 
	   XSSFWorkbook xssfWorkbook = null;
	
	   try { 
	    InputStream in = new FileInputStream(excelFile); 
	    xssfWorkbook = new XSSFWorkbook(in);
	    XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
	    
	  	for ( int i = 2 ; i < 145 ; i++ )  
	  	{
	 	    XSSFRow xssfRow = sheet.getRow(i);
	 	  	if (xssfRow != null) {
	 	  		
	 	  		DecimalFormat df = new DecimalFormat("0");           
	 	  		String id =  df.format(xssfRow.getCell(1).getNumericCellValue()); 
	 	  		String name = xssfRow.getCell(2).toString();
	 	  		String git = xssfRow.getCell(3).toString();
	 	  		String password = id.substring(4);  
	 	  		
	 	  		
	 	     	WebDriver driver = new FirefoxDriver();
	 	  		driver.get("http://121.193.130.195:8800/login");
	 	  		

	 			driver.findElement(By.name("id")).sendKeys(id);
	 		
	 			driver.findElement(By.name("password")).sendKeys(password);
	 			
	 			WebElement btn = driver.findElement(By.id("btn_login"));
	 			btn.sendKeys(Keys.ENTER);
	            
	 			
	 			assertEquals(id , driver.findElement(By.id("student-id")).getText());
	 			assertEquals(name , driver.findElement(By.id("student-name")).getText());
	 			assertEquals(git , driver.findElement(By.id("student-git")).getText());	
	 			
	 			driver.close();
	  		    
	      	}
	  	 }
	  	}
	  	catch (FileNotFoundException e) {
	  	// TODO Auto-generated catch block
	  	e.printStackTrace();
	  	} catch (IOException e) {
	  	// TODO Auto-generated catch block
	  	e.printStackTrace();
	  	}
	 

	  
  }
}

 