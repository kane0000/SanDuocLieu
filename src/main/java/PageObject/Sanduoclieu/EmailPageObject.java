package PageObject.Sanduoclieu;

import org.openqa.selenium.By;
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
		sleepInSecond(3);
		driver.findElement(By.xpath("//input[@id='inbox_field']")).clear();
		sendkeyToElement(driver, EmailPageUI.EMAIL_TEXTBOX, name);
	}

	public void clickToGoButton() {
		waitElementClickable(driver, EmailPageUI.GO_BUTTON);
		clickToElement(driver, EmailPageUI.GO_BUTTON);
		sleepInSecond(2);
	}

	public void clickToContent() {
		waitElementClickable(driver, EmailPageUI.CONTENT);
		clickToElement(driver, EmailPageUI.CONTENT);
	}

	public void clickToVerificationCode() {
		waitElementClickable(driver, EmailPageUI.VERIFICATION);
		clickToElement(driver, EmailPageUI.VERIFICATION);
		
	}

	public String getTextToVerificationCode() {
		switchToFrameOrIframe(driver, EmailPageUI.IFRAME);
		scrollToElement(driver, EmailPageUI.VERIFICATION_CODE);
		waitElementVisible(driver, EmailPageUI.VERIFICATION_CODE);
		return getTextElement(driver, EmailPageUI.VERIFICATION_CODE);
		
	}

	public String getTextToAccount() {
		switchToFrameOrIframe(driver, EmailPageUI.IFRAME);
		waitElementVisible(driver, EmailPageUI.ACCOUNT_GET_TEXT);
		return getTextElement(driver, EmailPageUI.ACCOUNT_GET_TEXT);
	}

	public String getTextToPassword() {
		switchToFrameOrIframe(driver, EmailPageUI.IFRAME);
		waitElementVisible(driver, EmailPageUI.PASSWORD_GET_TEXT);
		return getTextElement(driver, EmailPageUI.PASSWORD_GET_TEXT);
	}

	public String getTextToPin() {
		switchToFrameOrIframe(driver, EmailPageUI.IFRAME);
		waitElementVisible(driver, EmailPageUI.PIN_GET_TEXT);
		return getTextElement(driver, EmailPageUI.PIN_GET_TEXT);
	}
}
