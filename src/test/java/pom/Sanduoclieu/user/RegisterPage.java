package pom.Sanduoclieu.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.Sanduoclieu.HomePageObject;
import PageObject.Sanduoclieu.EmailPageObject;
import PageObject.Sanduoclieu.LoginPageObject;
import PageObject.Sanduoclieu.RegisterPageObject;
import commons.AbstractTest;
import commons.PageGeneratorManager;
import reportConfig.AllureTestListener;

@Listeners ({AllureTestListener.class})
public class RegisterPage extends AbstractTest {
 private WebDriver driver;
 HomePageObject homePage;
 LoginPageObject loginPage;
 RegisterPageObject registerPage;
 EmailPageObject emailPage;
 String email,text,address,registrationPaper,taxCode,value, phoneCompany, name, idCard, day, where, document, businessName, newPassword,passwordOder,account,password, pin,businessNameBuy ;
 
    @Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		email = "linh"+ randomNumber();
		
		address = "111 Lê Trọng Tấn, Khương Mai, Thanh Xuân, Hà Nội, Vietnam";
		registrationPaper = "Giấy kinh doanh"+randomNumber();
		taxCode = "789"+randomNumber();
		phoneCompany = "0998999888";
		name = "Doanh Nghiệp A";
		idCard = "187604111";
		day = "09/11/2013";
		where = "Nghệ An";
		document = "123.png";
		businessName = "Doanh nghiệp bán";
		businessNameBuy ="Doanh nghiệp mua";
		newPassword = "111111";
		passwordOder = "000000";
		homePage = PageGeneratorManager.getHomePage(driver);
		
    }
    
 @Test
  public void TC_Register_Enterprise_Buy() {
	   homePage.clickToLoginButton(driver);
	  loginPage= PageGeneratorManager.getLoginPage(driver);
	  loginPage .clickToLoginButton(driver);
	  registerPage= PageGeneratorManager.getRegisterPage(driver);
	  registerPage.inputToEmailTextbox(email+"@mailinator.com");
	  value = driver.findElement(By.name("emailContactPerson")).getAttribute("value");
	  
	 
	  registerPage.clickToVerificationButton();
	  sleepInSecond(1);
	  registerPage.openPageUrl(driver,"https://www.mailinator.com/v3/#/#inboxpane");
	  sleepInSecond(1);
	  emailPage =PageGeneratorManager.getEmailPage(driver);
	  emailPage.inputToEmailTextbox(email);
	  System.out.println(email);
	  emailPage.clickToGoButton();
	  
	  emailPage.clickToVerificationCode();
	  text = emailPage.getTextToVerificationCode();
	  
	  emailPage.openPageUrl(driver, "https://yduoccotruyen.com.vn/register/step1");
	  registerPage= PageGeneratorManager.getRegisterPage(driver);
	  registerPage.inputToEmailTextbox(email+"@mailinator.com");
	  registerPage.inputToVerification(text);
	  registerPage.clickToNextButton();
	  
	  registerPage.selectToSaleEnterprise(businessNameBuy);
	  registerPage.inputToNameEnterpriseTextbox(name);
	  registerPage.inputToAddressTextbox(address);
	  registerPage.inputToBusinessRegistrationCertificateTextbox(registrationPaper);
	  registerPage.inputToTaxCodeTextbox(taxCode);
	  registerPage.inputToEmailCompanyTextbox(email+"@mailinator.com");
	  
	  registerPage.inputToPhoneNumberTextbox(phoneCompany);
	  registerPage.inputToNameTextbox(name);
	  registerPage.inputToPhoneTextbox(phoneCompany);
	  registerPage.inputToIDCardTextbox(idCard);
	  registerPage.inputToDayTextbox(day);
	  registerPage.selectToWhereDropdown(where);
	  registerPage.clickToNextButton();
	  
	  
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("mã số thuế");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("người được ủy quyền");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicTitleName("chứng minh tài chính");
	  registerPage.clickToDynamicPaperName("3 năm trở lại");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("kèm hợp đồng");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToFinishButton();
	  verifyTrue(registerPage.isMessageSuccess());
  }
// @Test
 public void TC_Register_Enterprise_Sell() {
	   homePage.clickToLoginButton(driver);
	  loginPage= PageGeneratorManager.getLoginPage(driver);
	  loginPage .clickToLoginButton(driver);
	  registerPage= PageGeneratorManager.getRegisterPage(driver);
	  registerPage.inputToEmailTextbox(email+"@mailinator.com");
	 
	  registerPage.clickToVerificationButton();
	  sleepInSecond(1);
	 
	  registerPage.openPageUrl(driver,"https://www.mailinator.com/v3/#/#inboxpane");
	  sleepInSecond(1);
	  emailPage =PageGeneratorManager.getEmailPage(driver);
	  emailPage.inputToEmailTextbox(email);
	  System.out.println(email);
	  emailPage.clickToGoButton();
	  
	  emailPage.clickToVerificationCode();
	  text = emailPage.getTextToVerificationCode();
	  driver.switchTo().defaultContent();
	  
	  emailPage.openPageUrl(driver, "https://yduoccotruyen.com.vn/register/step1");
	  registerPage= PageGeneratorManager.getRegisterPage(driver);
	  registerPage.inputToEmailTextbox(email+"@mailinator.com");
	  registerPage.inputToVerification(text);
	  registerPage.clickToNextButton();
	  
	  registerPage.selectToSaleEnterprise(businessName);
	  registerPage.inputToNameEnterpriseTextbox(name);
	  registerPage.inputToAddressTextbox(address);
	  registerPage.inputToBusinessRegistrationCertificateTextbox(registrationPaper);
	  registerPage.inputToTaxCodeTextbox(taxCode);
	  registerPage.inputToEmailCompanyTextbox(email+"@mailinator.com");
	  
	  registerPage.inputToPhoneNumberTextbox(phoneCompany);
	  registerPage.inputToNameTextbox(name);
	  registerPage.inputToPhoneTextbox(phoneCompany);
	  registerPage.inputToIDCardTextbox(idCard);
	  registerPage.inputToDayTextbox(day);
	  registerPage.selectToWhereDropdown(where);
	  registerPage.clickToNextButton();
	  
	  
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("mã số thuế");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("người được ủy quyền");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicTitleName("Điều kiện kinh doanh");
	  registerPage.clickToDynamicPaperName("Thực hành tốt phân phối");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("nguyên liệu làm thuốc");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("phụ trách chuyên môn");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("điều kiện kinh doanh dược");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("tổng thể của kho");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicTitleName("chứng minh tài chính");
	  registerPage.clickToDynamicPaperName("3 năm trở lại");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToDynamicPaperName("kèm hợp đồng");
	  registerPage.uploadMultipleFiles(driver, document);
	  verifyTrue(registerPage.isDocumentDisplayed(document));
	  
	  registerPage.clickToFinishButton();
	  verifyTrue(registerPage.isMessageSuccess());
 }
  @AfterClass
	  public void afterClass() {
			removeDriver();
  }

}
