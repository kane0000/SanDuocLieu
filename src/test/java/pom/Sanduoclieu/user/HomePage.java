package pom.Sanduoclieu.user;

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
public class HomePage extends AbstractTest {
 private WebDriver driver;
 HomePageObject homePage;
 LoginPageObject loginPage;
 RegisterPageObject registerPage;
 EmailPageObject informationPage;
 String account,newPassword,document, customerName;
 
    @Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		account = "SDL18159938";
		newPassword = "111111";
		document = "123.png";
		customerName = "Nguyen Van D";
    }
//    @Test
    public void TC_Register_Product_Sell_At_Depot_of_San() {
  	  homePage= PageGeneratorManager.getHomePage(driver);
  	  homePage.clickToLoginButton(driver);
  	  loginPage = PageGeneratorManager.getLoginPage(driver);
  	  loginPage.inputToAccount(account);
  	  loginPage.inputToPassword(newPassword);
  	  loginPage.clickToButton();
  	  homePage= PageGeneratorManager.getHomePage(driver);
  	  homePage.clickToManagerButton("Quản lý");
  	  homePage.clickToManagerProductButton();
  	  homePage.clickToPendingApproval();
  	  homePage.clickToProductRegister("Đăng ký sản phẩm");
  	  homePage.inputToProduct("Bạch thược loại 1");
  	  homePage.inputTMass("10000");
  	  homePage.selectToRepository("Tại kho của sàn");
  	  homePage.selectToMedicine("Dược liệu trong nước");
  	  homePage.uploadMultipleFiles(driver, document);
  	  homePage.uploadMultipleFiles1(driver, document);
  	  homePage.uploadMultipleFiles2(driver, document);
  	  homePage.uploadMultipleFiles3(driver, document);
  	  homePage.uploadMultipleFiles4(driver,document);
  	  homePage.clickToRegisterButton();
  	  
    }
    @Test
    public void TC_Register_Product_Sell_At_Depot_Of_Enterprise() {
    	homePage= PageGeneratorManager.getHomePage(driver);
    	  homePage.clickToLoginButton(driver);
    	  loginPage = PageGeneratorManager.getLoginPage(driver);
    	  loginPage.inputToAccount(account);
    	  loginPage.inputToPassword(newPassword);
    	  loginPage.clickToButton();
    	  homePage= PageGeneratorManager.getHomePage(driver);
    	  homePage.clickToManagerButton("Quản lý");
    	  homePage.clickToManagerProductButton();
    	  homePage.clickToPendingApproval();
    	  homePage.clickToProductRegister("Đăng ký sản phẩm");
    	  homePage.inputToProduct("Bạch thược loại 1");
    	  homePage.inputTMass("10000");
    	  homePage.selectToRepository("Tại kho của doanh nghiệp");
    	  homePage.clickToMoreAddress("Thêm địa chỉ");
    	  homePage.inputToCustomerName(customerName);
    	  homePage.inputToCustomerPhone("0988999881");
    	  homePage.inputToProvince("Hà Nội");
    	  homePage.inputToDistrict("Thanh Xuân");
    	  homePage.inputToCommune("Khương Mai");
    	  homePage.inputToCustomerAddress("163 Lê Trọng Tấn");
    	  homePage.clickToHomeDepot("Nhà kho");
    	  homePage.clickToSendButton("Gửi");
    	  homePage.clickToAdress(customerName);
    	  homePage.selectToMedicine("Dược liệu trong nước");
    	  homePage.uploadMultipleFiles(driver, document);
    	  homePage.uploadMultipleFiles1(driver, document);
    	  homePage.uploadMultipleFiles2(driver, document);
    	  homePage.uploadMultipleFiles3(driver, document);
    	  homePage.uploadMultipleFiles4(driver,document);
    	  homePage.clickToRegisterButton();
    }

//  @AfterClass
//	  public void afterClass() {
//			removeDriver();
//  }

}
