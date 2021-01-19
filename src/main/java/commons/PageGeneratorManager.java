package commons;

import org.openqa.selenium.WebDriver;

import PageObject.Sanduoclieu.HomePageObject;
import PageObject.Sanduoclieu.EmailPageObject;
import PageObject.Sanduoclieu.LoginPageObject;
import PageObject.Sanduoclieu.RegisterPageObject;

public class PageGeneratorManager {
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static EmailPageObject getEmailPage(WebDriver driver) {
		return new EmailPageObject(driver);
	}
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
}
