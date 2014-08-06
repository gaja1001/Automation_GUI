package pageClasses;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class LoginPageView {

		WebDriver driver;
		TestUtility uti;
			
		
		@Test
	  public void first() throws FileNotFoundException, IOException {
			Properties prop =  new Properties();
			prop.load(new FileInputStream(new File("./src/main/Object_Repository.properties")));
			
			String userID = prop.getProperty("Username.Id");
			String userPWD = prop.getProperty("Password.id");
			String userBtn = prop.getProperty("logIn.id");
			
			FirefoxBinary bin = new FirefoxBinary(new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe"));
			FirefoxProfile p = new FirefoxProfile();
			
			driver = new FirefoxDriver(bin, p);
			driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
			
			uti = new TestUtility(driver);

			WebElement userID_txtBox = uti.getElement("username.id", userID);
			userID_txtBox.sendKeys("gajanan.polaswar@yahoo.co.in");
			
			WebElement userPWD_txtBox = uti.getElement("Password.id", userPWD);
			userPWD_txtBox.sendKeys("banku@0411");
			
			WebElement Login_btn = uti.getElement("logIn.id", userBtn);
			Login_btn.click();		
	  }
	}


