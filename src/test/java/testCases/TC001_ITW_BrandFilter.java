package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.HomePage;
import testBase.BaseTest;

public class TC001_ITW_BrandFilter extends BaseTest{
	
	@Test(priority=1)
	public void HQloction() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		DashboardPage dp=new DashboardPage(driver);
		hp.click_ITW();
		Thread.sleep(3000);
		hp.set_Login();
		Thread.sleep(5000);
		dp.clickMenuInventory();
		dp.selectBrandsAssigned();
		dp.selectEvent();
		dp.selectMybrands();
		captureScreen("test");
		logger.info("***screenshot captured***");
		
		dp.selectFilterBrand();
		dp.TC001_HQlocation();
		Thread.sleep(2000);
		logger.info("***TC001 executed***");
		captureScreen("test");
		logger.info("***screenshot captured***");
		
		
	}

}
