package PageObject.Sanduoclieu;

import org.openqa.selenium.WebDriver;

import PageUI.Sanduoclieu.EmailPageUI;
import PageUI.Sanduoclieu.LoginPageUI;
import commons.AbstractPage;

public class LoginPageObject extends AbstractPage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToAccount(String account) {
		waitElementVisible(driver, LoginPageUI.ACCOUNT_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.ACCOUNT_TEXTBOX, account);
	}

	public void inputToPassword(String password) {
		waitElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToButton() {
		waitElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

	}

	public void inputToPasswordTextbox(String password) {
		waitElementVisible(driver, LoginPageUI.INPUT_PASSWORD);
		sendkeyToElement(driver, LoginPageUI.INPUT_PASSWORD, password);

	}

	public void inputToNewPassword(String newPassword) {
		waitElementVisible(driver, LoginPageUI.NEW_PASSWORD_TEXBOX);
		sendkeyToElement(driver, LoginPageUI.NEW_PASSWORD_TEXBOX, newPassword);
	}

	public void inputToConfirmPassword(String newPassword) {
		waitElementVisible(driver, LoginPageUI.CONFIRM_PASSWORD_TEXBOX);
		sendkeyToElement(driver, LoginPageUI.CONFIRM_PASSWORD_TEXBOX, newPassword);
	}

	public void clickToNextButton(String text) {
		waitElementClickable(driver, LoginPageUI.NEXT_BUTTON, text);
		clickToElement(driver, LoginPageUI.NEXT_BUTTON, text);
	}

	public void inputToPasswordOderTextbox(String pin) {
		waitElementVisible(driver, LoginPageUI.PASSWORD_ODER_TEXBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_ODER_TEXBOX, pin);
	}

	public void inputToNewPasswordOder(String newPassword) {
		waitElementVisible(driver, LoginPageUI.NEW_PASSWORD_ODER_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.NEW_PASSWORD_ODER_TEXTBOX, newPassword);
	}

	public void inputToConfirmPasswordOder(String newPassword) {
		waitElementVisible(driver, LoginPageUI.CONFIRM_PASSWORD_ODER_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.CONFIRM_PASSWORD_ODER_TEXTBOX, newPassword);
	}

	public void clickToForgotPassword(String forgotPass) {
		waitElementClickable(driver, LoginPageUI.NEXT_BUTTON, forgotPass);
		clickToElement(driver, LoginPageUI.NEXT_BUTTON, forgotPass);
	}

	public void inputToEmailTexbox(String email) {
		waitElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}

	public void inputToPaperRegisterBusiness(String businessCode) {
		waitElementVisible(driver, LoginPageUI.BUSINESS_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.BUSINESS_TEXTBOX, businessCode);
		sleepInSecond(1);
	}

	public void clickToButtonSend() {
		waitElementClickable(driver, LoginPageUI.SEND_BUTTON);
		clickToElement(driver, LoginPageUI.SEND_BUTTON);
	}

	public void inputToPasswordNew(String pass) {
		waitElementVisible(driver, LoginPageUI.PASSWORD_NEW_FORGOT);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_NEW_FORGOT, pass);
		
	}

	public void inputToConfirmPasswordNew(String pass) {
		waitElementVisible(driver, LoginPageUI.PASSWORD_CONFIRM_FORGOT);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_CONFIRM_FORGOT, pass);
	}

	public void inputToPinNew(String pin) {
		waitElementVisible(driver, LoginPageUI.PIN_NEW_FORGOT);
		sendkeyToElement(driver, LoginPageUI.PIN_NEW_FORGOT, pin);
	}

	public void inputToConfirmPinNew(String pin) {
		waitElementVisible(driver, LoginPageUI.PIN_CONFIRM_FORGOT);
		sendkeyToElement(driver, LoginPageUI.PIN_CONFIRM_FORGOT, pin);
		sleepInSecond(1);
	}

	public void clickToSendButton(String send) {
		waitElementClickable(driver, LoginPageUI.SEND_BUTTON, send);
		clickToElement(driver, LoginPageUI.SEND_BUTTON, send);
		sleepInSecond(1);
	}
}
