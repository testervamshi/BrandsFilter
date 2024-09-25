package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC002_ITW_BrandFilter extends BaseTest{
	@Test(priority=2)
	public void HQRegionFilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC002_HQRegion();
		Thread.sleep(2000);
		logger.info("***TC002 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
	}
}
