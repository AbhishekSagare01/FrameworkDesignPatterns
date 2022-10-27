package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponents.AbstractComponent;

public class FooterNav extends AbstractComponent{
	
	WebDriver driver;
    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");


	public FooterNav(WebDriver driver, By sectionElement) {
		
		super(driver,sectionElement); 
		//when you inherit parent class- you should invoke parent class constructor
        //in your own child constructor
	}


	public String getFlightAttribute() {
		// TODO Auto-generated method stub
		return findElement(flights).getAttribute("class");
		
	}
	
	public int getlinkCount() {
		
		return findElements(links).size();
		
		
	}
	
	
	
	

}
