package pom.Sanduoclieu.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.Sanduoclieu.EmailPageObject;
import PageObject.Sanduoclieu.HomePageObject;
import PageObject.Sanduoclieu.LoginPageObject;
import PageObject.Sanduoclieu.RegisterPageObject;
import commons.AbstractTest;
import commons.PageGeneratorManager;
import reportConfig.AllureTestListener;

@Listeners({ AllureTestListener.class })
public class LoginPage extends AbstractTest {

	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	EmailPageObject emailPage;

	String account, password, passwordForgot, pinForgot, pin, newPassword, passwordOder, name, paper;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		passwordForgot = "222222";
		pinForgot = "888888";
		newPassword = "111111";
		passwordOder = "000000";
		name = "linh326174";
		paper = "Giấy kinh doanh522005";
				

	}

  @Test
	public void TC_01_Login() {
		emailPage = PageGeneratorManager.getEmailPage(driver);
		emailPage.inputToEmailTextbox(name);
		emailPage.clickToGoButton();
		
		emailPage.clickToVerificationCode();
		account = emailPage.getTextToAccount();
		driver.switchTo().defaultContent();
		password = emailPage.getTextToPassword();
		driver.switchTo().defaultContent();
		pin = emailPage.getTextToPin();
		driver.switchTo().defaultContent();

		// Change password for the first time
		emailPage.openPageUrl(driver, "https://yduoccotruyen.com.vn/");
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickToLoginButton(driver);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputToAccount(account);
		loginPage.inputToPassword(password);
		loginPage.clickToButton();

		loginPage.inputToPasswordTextbox(password);
		loginPage.inputToNewPassword(newPassword);
		loginPage.inputToConfirmPassword(newPassword);
		loginPage.clickToNextButton("Tiếp tục");

		loginPage.inputToPasswordOderTextbox(pin);
		loginPage.inputToNewPasswordOder(passwordOder);
		loginPage.inputToConfirmPasswordOder(passwordOder);
		loginPage.clickToNextButton("Đổi mật khẩu");

		loginPage.inputToAccount(account);
		loginPage.inputToPassword(newPassword);
		loginPage.clickToButton();
		homePage = PageGeneratorManager.getHomePage(driver);
		verifyTrue(homePage.isMessageText());
	}

	@Test
	public void TC_02_Forgot_Password() {
//		homePage = PageGeneratorManager.getHomePage(driver);
//		homePage.clickToLoginButton(driver);
	  homePage.clickToLoginName();
	  homePage.clickToLogout();
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.clickToForgotPassword("Quên mật khẩu?");
		loginPage.inputToEmailTexbox(name + "@mailinator.com");
		loginPage.inputToPaperRegisterBusiness(paper);
		loginPage.clickToSendButton("Gửi");
		
		loginPage.openPageUrl(driver, "https://www.mailinator.com/v3/#/#inboxpane");

		emailPage = PageGeneratorManager.getEmailPage(driver);
		
		emailPage.inputToEmailTextbox(name);
		emailPage.clickToGoButton();
		
		emailPage.clickToContent();
		emailPage.clickToChangePassword();

		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputToPasswordNew(passwordForgot);
		loginPage.inputToConfirmPasswordNew(passwordForgot);
		loginPage.inputToPinNew(pinForgot);
		loginPage.inputToConfirmPinNew(pinForgot);
		loginPage.clickToButtonSend();
		loginPage.inputToAccount(account);
		System.out.println(account);
		loginPage.inputToPassword(passwordForgot);
		loginPage.clickToButton();
		homePage = PageGeneratorManager.getHomePage(driver);
		verifyTrue(homePage.isMessageText());
	}
	
  @AfterClass
	  public void afterClass() {
			removeDriver();
  }

}
