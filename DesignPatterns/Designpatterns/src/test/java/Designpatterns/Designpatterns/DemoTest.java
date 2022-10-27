package Designpatterns.Designpatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.TravelHomePage;

public class DemoTest {
	
	@Test
	public void flightTest()
	{
		System.setProperty("webdriver.chrome.driver","D:/AB_WORKSPACE/eclipse-workspace/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		TravelHomePage travelHomePage =new TravelHomePage(driver);
		travelHomePage.goTo();
		System.out.println(travelHomePage.getFooterNav().getFlightAttribute());	
		System.out.println(travelHomePage.getNavigatorBar().getFlightAttribute());
		System.out.println(travelHomePage.getFooterNav().getlinkCount());
		System.out.println(travelHomePage.getNavigatorBar().getlinkCount());
		
		driver.close();
	}

}
