package PageUI.Sanduoclieu;

public class EmailPageUI {

	public static final String CHANGE_PASSWORD ="//td[contains(text(),'Đổi mật khẩu')]";
	public static final String IFRAME ="//iframe[@id='msg_body']";
	public static final String TITLE ="Sàn dược liệu";
	public static final String EMAIL_TEXTBOX ="//input[@id='inbox_field']";
	
	public static final String GO_BUTTON ="//button[@id='go_inbox']";
	public static final String CONTENT ="//div[@id='inboxpane']//tr[1]//td[3]";
	public static final String VERIFICATION ="//a[contains(text(),'Sàn dươc liệu')]/parent::td/preceding-sibling::td[1]";
	public static final String ACCOUNT_GET_TEXT ="//td[contains(text(),'Tài khoản đăng nhập:')]/following-sibling::td";
	public static final String PASSWORD_GET_TEXT ="//td[contains(text(),' Mật khẩu đăng nhập: ')]/following-sibling::td";
	public static final String PIN_GET_TEXT ="//td[contains(text(),'Mã PIN đặt lệnh:')]/following-sibling::td";
	public static final String VERIFICATION_CODE ="//td[@align='center']//tr[6]";
}
