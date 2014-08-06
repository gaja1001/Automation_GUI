package persistent.gaja1001M;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageClasses.Dashboard;
import pageClasses.Login;

public class LoginActions {
  
	WebDriver driver = new FirefoxDriver();
	Login loginUser;
	Dashboard dash;
	private static Logger log = Logger.getLogger(LoginActions.class);
	
	@Test
  public void Successful() throws BiffException, IOException {
		
		Workbook book = Workbook.getWorkbook(new File("./src/test/Names.xls"));
		Sheet sheet1 = book.getSheet("Sheet1");
		String name = sheet1.getCell(0, 0).getContents();
		String pwd = sheet1.getCell(1, 0).getContents();
		System.out.println(name+ " " + pwd);
		
		DOMConfigurator.configure("log4j.xml");
		log.info("First Log message");
		
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		//loginUser = new Login(driver);
		
		loginUser = PageFactory.initElements(driver, Login.class);
		dash = loginUser.Login_sucessful(name, pwd);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		loginUser =dash.Logout();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.quit();
  }

}
