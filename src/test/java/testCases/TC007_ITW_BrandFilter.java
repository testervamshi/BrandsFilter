package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC007_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=7)
	public void allcloseddealfilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC007_selectClosedDeal();
		Thread.sleep(2000);
		logger.info("***TC007 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
	}

}
