package driverFactory;

import commons.Browser;

public class DriverFactory {
	public static DriverManager getBrowserDriver(String browserName) {
		Browser browser = Browser.valueOf(browserName.toUpperCase());
		DriverManager driverManager = null;
		
		if(browser == Browser.FIREFOX) {
			driverManager = new FirefoxDriverManager();
		}else if(browser == Browser.CHROME) {
			driverManager = new ChromeDriverManager();
		}else {
			throw new RuntimeException("Please choose your browser name!");
		}
		return driverManager;
	}
}
