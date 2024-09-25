package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC005_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=5)
	public void searchIndustriesfilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC005_searchIndustries();
		Thread.sleep(2000);
		logger.info("***TC005 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
	}

}
