package pageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(id="user_pass")
	WebElement password;
	
	@FindBy(id="wp-submit")
	WebElement logIn;
	
	public Login(WebDriver driver){

		this.driver=driver;
	}
	public Dashboard Login_sucessful(String userID, String PWD){
		
		
		username.sendKeys(userID);		
		password.sendKeys(PWD);
		logIn.click();
		/*driver.findElement(By.id("user_login")).sendKeys(userID);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();*/
		//return new Dashboard(driver);
		return PageFactory.initElements(driver, Dashboard.class);
	}
}
