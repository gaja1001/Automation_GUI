package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtility{
	WebDriver driver;
	Pathtype p;
	WebElement element;
	String extractPath;
	
	public TestUtility(WebDriver driver){
		this.driver = driver;
	}
	
	public String getElelemntLocator(String elementType){
		int i = elementType.indexOf('.');
		extractPath = elementType.substring(i+1);
		return extractPath;
	}
	public WebElement getElement(String elementType, String elementName){
		String path = getElelemntLocator(elementType);
		p = Pathtype.valueOf(path);
		try{
			switch(p){
			case id:
			element = driver.findElement(By.id(elementName));
			
			case css:
			element = driver.findElement(By.cssSelector(elementName));

			case name:
			element = driver.findElement(By.name(elementName));

			case xpath:
			element = driver.findElement(By.xpath(elementName));
						
			}
		
		}catch(NoSuchElementException e){
			
		}
		return element;
	}
}