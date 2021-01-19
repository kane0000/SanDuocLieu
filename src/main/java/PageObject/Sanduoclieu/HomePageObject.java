package PageObject.Sanduoclieu;

import org.openqa.selenium.WebDriver;

import PageUI.Sanduoclieu.HomePageUI;
import PageUI.Sanduoclieu.LoginPageUI;
import commons.AbstractPage;

public class HomePageObject extends AbstractPage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isMessageText() {
		waitElementClickable(driver, HomePageUI.MESSAGE_TEXT);
		return true;
	}

	public void clickToManagerButton(String managerName) {
		waitElementClickable(driver, HomePageUI.DYNAMIC_BUTTON, managerName);
		clickToElement(driver, HomePageUI.DYNAMIC_BUTTON, managerName);
	}

	public void clickToManagerProductButton() {
		waitElementClickable(driver, HomePageUI.MANAGER_PRODUCT_BUTTON);
		clickToElement(driver, HomePageUI.MANAGER_PRODUCT_BUTTON);
	}
	public void clickToPendingApproval() {
		waitElementClickable(driver, HomePageUI.PENDING_APPROVAL_BUTTON);
		clickToElement(driver, HomePageUI.PENDING_APPROVAL_BUTTON);
	}

	public void clickToProductRegister(String productButton) {
		waitElementClickable(driver, HomePageUI.DYNAMIC_BUTTON, productButton);
		clickToElement(driver, HomePageUI.DYNAMIC_BUTTON, productButton);

	}

	public void inputToProduct(String productName) {
		waitElementVisible(driver, HomePageUI.PRODUCT_NAME_TEXTBOX);
		sendkeyToElement(driver, HomePageUI.PRODUCT_NAME_TEXTBOX, productName);
		sendkeyEnterToElement(driver, HomePageUI.PRODUCT_NAME_TEXTBOX);
sleepInSecond(1);
	}

	public void inputTMass(String mass) {
		waitElementVisible(driver, HomePageUI.MASS_TEXTBOX);
		sendkeyToElement(driver, HomePageUI.MASS_TEXTBOX, mass);
	}

	public void selectToRepository(String repoName) {
		waitElementClickable(driver, HomePageUI.REPOSITORY_SELECT, repoName);
		clickToElementByJS(driver, HomePageUI.REPOSITORY_SELECT, repoName);
	}

	public void selectToMedicine(String medicineName) {
		waitElementClickable(driver, HomePageUI.REPOSITORY_SELECT, medicineName);
		clickToElementByJS(driver, HomePageUI.REPOSITORY_SELECT, medicineName);
	}

	public void clickToRegisterButton() {
		scrollToElement(driver, HomePageUI.REGISTER_BUTTON);
		waitElementClickable(driver, HomePageUI.REGISTER_BUTTON);
		clickToElement(driver, HomePageUI.REGISTER_BUTTON);
	}

	public void clickToDocumentButton(String document) {
		waitElementClickable(driver, HomePageUI.DYNAMIC_DOCUMENT_BUTTON, document);
		clickToElementByJS(driver, HomePageUI.DYNAMIC_DOCUMENT_BUTTON, document);		
	}

	public void clickToLoginName() {
		waitElementClickable(driver, HomePageUI.BUSINESS_NAME);
		clickToElement(driver, HomePageUI.BUSINESS_NAME);
	}
	public void clickToLogout() {
		waitElementClickable(driver, HomePageUI.LOGOUT_BUTTON);
		clickToElement(driver, HomePageUI.LOGOUT_BUTTON);
		
	}

	public void clickToMoreAddress(String moreAddress) {
		waitElementClickable(driver, HomePageUI.DYNAMIC_BUTTON, moreAddress);
		clickToElement(driver, HomePageUI.DYNAMIC_BUTTON, moreAddress);
	}

	public void inputToCustomerName(String customerName) {
		waitElementVisible(driver, HomePageUI.CUSTOMER_NAME);
		sendkeyToElement(driver, HomePageUI.CUSTOMER_NAME, customerName);
	}

	public void inputToProvince(String province) {
		scrollToElement(driver, HomePageUI.PROVINCE);
		waitElementVisible(driver, HomePageUI.PROVINCE);
		sendkeyToElement(driver, HomePageUI.PROVINCE, province);
		sendkeyEnterToElement(driver, HomePageUI.PROVINCE);
	}

	public void inputToCustomerPhone(String customerPhone) {
		scrollToElement(driver, HomePageUI.CUSTOMER_PHONE);
		waitElementVisible(driver, HomePageUI.CUSTOMER_PHONE);
		sendkeyToElement(driver, HomePageUI.CUSTOMER_PHONE, customerPhone);
		
	}

	public void inputToDistrict(String district) {
		scrollToElement(driver, HomePageUI.DISTRICT);
		waitElementVisible(driver, HomePageUI.DISTRICT);
		sendkeyToElement(driver, HomePageUI.DISTRICT, district);
		sendkeyEnterToElement(driver, HomePageUI.DISTRICT);
	}

	public void inputToCommune(String commune) {
		scrollToElement(driver, HomePageUI.COMMUNE);
		waitElementVisible(driver, HomePageUI.COMMUNE);
		sendkeyToElement(driver, HomePageUI.COMMUNE, commune);
		sendkeyEnterToElement(driver, HomePageUI.COMMUNE);
	}

	public void inputToCustomerAddress(String customerAddress) {
		scrollToElement(driver, HomePageUI.CUSTOMER_ADDRESS);
		waitElementVisible(driver, HomePageUI.CUSTOMER_ADDRESS);
		sendkeyToElement(driver, HomePageUI.CUSTOMER_ADDRESS, customerAddress);
		
	}

	public void clickToHomeDepot(String depot) {
		scrollToElement(driver, HomePageUI.MANAGER_BUTTON,depot);
		waitElementClickable(driver, HomePageUI.MANAGER_BUTTON,depot);
		clickToElement(driver, HomePageUI.MANAGER_BUTTON,depot);
	}

	public void clickToSendButton(String send) {
		waitElementClickable(driver, HomePageUI.DYNAMIC_BUTTON,send);
		clickToElement(driver, HomePageUI.DYNAMIC_BUTTON,send);
	}

	public void clickToAdress(String customerName) {
		waitElementClickable(driver, HomePageUI.ADDRESS,customerName);
		clickToElement(driver, HomePageUI.ADDRESS,customerName);
		
	}


}
