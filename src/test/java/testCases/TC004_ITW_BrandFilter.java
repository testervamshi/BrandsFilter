package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC004_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=4)
	public void Industriesfilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC004_Industries();
		Thread.sleep(2000);
		logger.info("***TC004 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
	}

}
