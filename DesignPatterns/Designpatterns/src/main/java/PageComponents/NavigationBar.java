package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponents.AbstractComponent;

public class NavigationBar extends AbstractComponent {
	
	By flights= By.cssSelector("[title='Flights']");
	By links = By.cssSelector("a");
	
	public NavigationBar(WebDriver driver, By sectionElement) {
		
		super (driver,sectionElement);
		
	}
	
	public String getFlightAttribute() {
		// TODO Auto-generated method stub
		return findElement(flights).getAttribute("class");
		
	}
	public int getlinkCount() {
		
		return findElements(links).size();
		
		
	}


}
