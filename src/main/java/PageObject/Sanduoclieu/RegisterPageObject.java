package PageObject.Sanduoclieu;

import org.openqa.selenium.WebDriver;

import PageUI.Sanduoclieu.RegisterPageUI;
import commons.AbstractPage;

public class RegisterPageObject extends AbstractPage {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
	this.driver = driver;
	}

	public void inputToEmailTextbox(String email) {
		waitElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}

	public void clickToVerificationButton() {
		waitElementClickable(driver, RegisterPageUI.VERIFICATION_BUTTON);
		clickToElement(driver, RegisterPageUI.VERIFICATION_BUTTON);
	}

	public void inputToVerification(String text) {
		waitElementVisible(driver, RegisterPageUI.VERIFICATION_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.VERIFICATION_TEXTBOX, text);
		
	}

	public void clickToNextButton() {
		waitElementClickable(driver, RegisterPageUI.NEXT_BUTTON);
		clickToElement(driver, RegisterPageUI.NEXT_BUTTON);
		
	}

	public void selectToSaleEnterprise(String businessName) {
		waitElementClickable(driver, RegisterPageUI.SALEENTERPRISE_SELECT, businessName);
		clickToElementByJS(driver, RegisterPageUI.SALEENTERPRISE_SELECT, businessName);
		sleepInSecond(2);
	}

	public void inputToNameEnterpriseTextbox(String companyName) {
		waitElementVisible(driver, RegisterPageUI.COMPANY_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.COMPANY_NAME_TEXTBOX, companyName);
	
	}

	public void inputToAddressTextbox(String addressName) {
		waitElementVisible(driver, RegisterPageUI.ADDRESS_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.ADDRESS_TEXTBOX, addressName);
		waitElementClickable(driver, RegisterPageUI.ADDRESS_SELECT);
		clickToElement(driver, RegisterPageUI.ADDRESS_SELECT);
		sleepInSecond(1);
		
	}

	public void inputToBusinessRegistrationCertificateTextbox(String registrationPaper) {
		waitElementVisible(driver, RegisterPageUI.REGISTRATION_PAPER_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.REGISTRATION_PAPER_TEXTBOX, registrationPaper);
		
	}

	public void inputToTaxCodeTextbox(String taxCode) {
		waitElementVisible(driver, RegisterPageUI.TAX_CODE_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.TAX_CODE_TEXTBOX, taxCode);
		
	}

	public void inputToEmailCompanyTextbox(String emailCompany) {
		waitElementVisible(driver, RegisterPageUI.EMAIL_COMPANY_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_COMPANY_TEXTBOX, emailCompany);
		
	}

	public void inputToPhoneNumberTextbox(String phoneCompany) {
		waitElementVisible(driver, RegisterPageUI.PHONE_COMPANY_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PHONE_COMPANY_TEXTBOX, phoneCompany);
		
	}

	public void inputToNameTextbox(String name) {
		waitElementVisible(driver, RegisterPageUI.REPRESENT_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.REPRESENT_NAME_TEXTBOX, name);
		
	}

	public void inputToPhoneTextbox(String value) {
		waitElementVisible(driver, RegisterPageUI.PHONE_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PHONE_TEXTBOX, value);
		
	}

	public void inputToIDCardTextbox(String idCard) {
		waitElementVisible(driver, RegisterPageUI.ID_CARD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.ID_CARD_TEXTBOX, idCard);
		
	}

	public void inputToDayTextbox(String day) {
		waitElementVisible(driver, RegisterPageUI.DAY_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.DAY_TEXTBOX, day);
		sendkeyEnterToElement(driver, RegisterPageUI.DAY_TEXTBOX);
	}

	public void selectToWhereDropdown(String where) {
		waitElementVisible(driver, RegisterPageUI.WHERE_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.WHERE_TEXTBOX, where);
//		waitElementVisible(driver, LoginPageUI.WHERE);
		sendkeyEnterToElement(driver, RegisterPageUI.WHERE_TEXTBOX);
//		sleepInSecond(1);
	}

	public void clickToDocumentName() {
		waitElementClickable(driver, RegisterPageUI.DOCUMENT_NAME);
		clickToElementByJS(driver, RegisterPageUI.DOCUMENT_NAME);
				
	}

	public void clickToDynamicPaperName(String paperName) {
		waitElementClickable(driver, RegisterPageUI.DYNAMIC_PAPER_NAME, paperName);
		clickToElement(driver, RegisterPageUI.DYNAMIC_PAPER_NAME, paperName);
		sleepInSecond(1);
		
	}

	public void clickToDynamicTitleName(String titleName) {
		waitElementClickable(driver, RegisterPageUI.DYNAMIC_TITLE_NAME, titleName);
		clickToElement(driver, RegisterPageUI.DYNAMIC_TITLE_NAME, titleName);
	}

	public void clickToFinishButton() {
		waitElementClickable(driver, RegisterPageUI.FINISH_BUTTON);
		clickToElementByJS(driver, RegisterPageUI.FINISH_BUTTON);
	}

	public boolean isDocumentDisplayed(String documentText) {
		waitElementClickable(driver, RegisterPageUI.DYNAMIC_DISPLAYED, documentText);
		sleepInSecond(1);
		return true;
	}

	public boolean isMessageSuccess() {
		waitElementClickable(driver, RegisterPageUI.MESSAGE_TEXT);
		sleepInSecond(1);		
		return true;
	}

	

	
	
	
}
