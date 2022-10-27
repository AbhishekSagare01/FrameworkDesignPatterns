package AbstractComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractComponent {
	
	WebElement sectionElement;
	WebDriver driver;
	/* SRP : Here we have created custome findElement and fineElements method
	 * Which are called into NavigationBar and FooterNav classes
	 * 
	 * */
	
	public AbstractComponent(WebDriver driver,By sectionElement) {
		this.driver=driver;
		this.sectionElement =driver.findElement(sectionElement);

	}
	
	public WebElement findElement (By findElementBy) {
		
		return sectionElement.findElement(findElementBy);
	}

	public List<WebElement> findElements (By findElementsBy) {
		return sectionElement.findElements(findElementsBy);
		
		
	}
}
