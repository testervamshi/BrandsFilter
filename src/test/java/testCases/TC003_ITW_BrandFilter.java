package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import testBase.BaseTest;

public class TC003_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=3)
	public void  HQRegioncityfilter() throws InterruptedException {
		DashboardPage dp=new DashboardPage(driver);
		dp.selectFilterBrand();
		dp.TC003_HQRegion();
		Thread.sleep(2000);
		logger.info("***TC003 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
		
	}

}
