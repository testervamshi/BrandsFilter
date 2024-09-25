package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC008_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=8)
	public void annualRevenuefilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC008_filterAnnualRevenue();
		Thread.sleep(2000);
		logger.info("***TC008 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
	}

}
