package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC006_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=6)
	public void closeddealfilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC006_selectClosedDeal();
		Thread.sleep(2000);
		logger.info("***TC006 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
	}

}
