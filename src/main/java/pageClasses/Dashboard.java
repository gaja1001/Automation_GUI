package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;
	
	public Dashboard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public Login Logout(){
		
		//driver.findElement(By.xpath("/html/body/header/div/nav[2]/ul/li[3]/img")).click();
		driver.findElement(By.id("wp-admin-bar-my-account"));
		driver.findElement(By.cssSelector("html.js.no-touch body.logged-in.mp6.newdash.newdash-read header.toolbar.wpcom-masterbar.wpcom-header div.wpcom-navigation.site-navigation nav.user-actions ul.actions-menu li#wp-admin-bar-my-account.user-account.no-grav ul.sub-menu.dropdown li#wp-admin-bar-logout.user-info-item a.ab-item")).click();
		return new Login(driver);
		
	}
}
