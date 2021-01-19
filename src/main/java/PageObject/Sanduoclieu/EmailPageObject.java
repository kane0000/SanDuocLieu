package PageObject.Sanduoclieu;

import org.openqa.selenium.WebDriver;

import PageUI.Sanduoclieu.EmailPageUI;
import commons.AbstractPage;

public class EmailPageObject extends AbstractPage {
	private WebDriver driver;

	public EmailPageObject(WebDriver driver) {
	this.driver = driver;
	}
	
	public void clickToChangePassword() {
		switchToFrameOrIframe(driver, EmailPageUI.IFRAME);
		scrollToElement(driver, EmailPageUI.CHANGE_PASSWORD);
		waitElementClickable(driver, EmailPageUI.CHANGE_PASSWORD);
		clickToElement(driver, EmailPageUI.CHANGE_PASSWORD);
		switchToDefaultContent(driver);
		switchToWindowByTitle(driver, EmailPageUI.TITLE);
	}

	public void inputToEmailTextbox(String name) {
		waitElementVisible(driver, EmailPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, EmailPageUI.EMAIL_TEXTBOX, name);
		
	}

	public void clickToGoButton() {
		waitElementClickable(driver, EmailPageUI.GO_BUTTON);
		clickToElement(driver, EmailPageUI.GO_BUTTON);
		
	}

	public void clickToContent() {
		waitElementClickable(driver, EmailPageUI.CONTENT);
		clickToElement(driver, EmailPageUI.CONTENT);		
	}
}
