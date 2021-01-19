//package reportConfig;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//
//public class ExtentTestListener implements ITestListener {
//	private static ExtentReports extent = ExtentManager.createInstance();
//	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
//
//	@Override // dành cho class trước khi chạy làm gì
//	public synchronized void onStart(ITestContext context) {
//	}
//
//	@Override // sau khi chạy làm gì
//	public synchronized void onFinish(ITestContext context) {
//		extent.flush();
//	}
//
//	@Override // dành cho TCs trước khi chạy làm gì
//	public synchronized void onTestStart(ITestResult result) {
//		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
//		test.set(extentTest);
//	}
//
//	@Override// sau khi chạy làm gì
//	public synchronized void onTestSuccess(ITestResult result) {
//		test.get().pass("Test passed");
//	}
//
//	@Override
//	public synchronized void onTestFailure(ITestResult result) {
//		test.get().fail("Test failed");
//		test.get().fail(result.getThrowable());
//	}
//
//	@Override
//	public synchronized void onTestSkipped(ITestResult result) {
//		test.get().skip("Test skipped");
//		test.get().skip(result.getThrowable());
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	}
//}
