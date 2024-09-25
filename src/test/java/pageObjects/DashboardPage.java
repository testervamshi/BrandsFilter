package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="//button[@id='side__nav__Inventories']")
	WebElement menu_Inventories;
	
	@FindBy (xpath="(//div[text()='02 Events'])[2]")
	WebElement event_assignedbrands;
	
	@FindBy (xpath="//div[text()='England Domestic One-Day Cup']")
	WebElement Event;
	
	@FindBy (xpath="//div[@class='flex justify-end']//button//*[name()='svg']")
	WebElement chart_close;
	
	@FindBy (xpath="//a[@rel='noopener noreferrer']")
	WebElement Inventory;
	
	@FindBy (xpath="//div[@class='flex flex-col gap-2 items-start']")
	WebElement Mybrands;
	
	@FindBy (xpath="//button[@aria-label='Filter Brands']")
	WebElement FilterBrand;
	
	@FindBy (xpath="//span[text()='HQ Regions & Cities']")
	WebElement HQ_locationcity;
	
	@FindBy (xpath="//span[text()='Southern Asia']")
	WebElement HQ_Regions;
	
	@FindBy (xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	WebElement AllCheckbox;
	
	@FindBy (xpath="//button[text()='DONE']")
	WebElement btn_Goback;
	
	@FindBy (xpath="//button[text()='APPLY FILTERS']")
	WebElement btn_applyfilter;
	
	@FindBy (xpath="//span[text()='Industries/ Categories']")
	WebElement Categories;
	
	@FindBy (xpath="//input[@id='default-search']")
	WebElement searchCategories;
	
	@FindBy (xpath="//span[text()='No']")
	WebElement closeddealno;
	
	@FindBy (xpath="//span[text()='All']")
	WebElement closeddealall;
	
	@FindBy (xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
	WebElement minvalue;
	//input[@id=':r13:']
	//(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]
	
	@FindBy (xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	WebElement maxvalue;
	//input[@id=':r14:']
	@FindBy (xpath="//button[text()='CLEAR']")
	WebElement btn_clear;
	
	@FindBy (xpath="//button[text()='CLEAR ALL']")
	WebElement btn_clearall;
	//(//fieldset[@class='MuiOutlinedInput-notchedOutline css-igs3ac'])[2]
	
	//div[@id='profile-menu']
	//body//div[@class='flex justify-end']//button
	
	@FindBy (xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium w-[48px] h-[48px] flex items-center justify-center css-1yxmbwk']")
	WebElement btn_close;
	
	@FindBy (xpath="//button[text()='DISCARD']")
	WebElement btn_discard;
	
	public void clickMenuInventory() throws InterruptedException {
		
		if(chart_close.isDisplayed()) {
			Thread.sleep(3000);
			chart_close.click();
		}
		Thread.sleep(3000);
		menu_Inventories.click();
	}
	
	public void selectBrandsAssigned() throws InterruptedException {
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(event_assignedbrands).click().perform();
		//event_assignedbrands.click();
		
	}
	public void selectEvent() throws InterruptedException {
		Thread.sleep(2000);
		Event.click();
	}
	public void selectInventory() throws InterruptedException{
		Thread.sleep(3000);
		Inventory.click();
	}
	public void selectMybrands() throws InterruptedException {
		Thread.sleep(2000);
		Mybrands.click();
		Thread.sleep(2000);
	}
	public void selectFilterBrand() throws InterruptedException {
		Thread.sleep(2000);
		FilterBrand.click();
	}
	public void TC001_HQlocation() throws InterruptedException {
		Thread.sleep(2000);
		HQ_locationcity.click();
		Thread.sleep(2000);
		HQ_Regions.click();
		Thread.sleep(2000);
		AllCheckbox.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_applyfilter.click();
	}
	public void TC002_HQRegion() throws InterruptedException {
		Thread.sleep(5000);
		HQ_locationcity.click();
		Thread.sleep(2000);
		HQ_Regions.click();
		//Thread.sleep(2000);
		//AllCheckbox.click();
		Thread.sleep(2000);
		btn_clear.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_applyfilter.click();
		
	}
	public void TC003_HQRegion() throws InterruptedException {
		Thread.sleep(5000);
		HQ_locationcity.click();
		Thread.sleep(2000);
		HQ_Regions.click();
		Thread.sleep(2000);
		AllCheckbox.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_clearall.click();
		Thread.sleep(10000);
		btn_close.click();
		Thread.sleep(2000);
		btn_discard.click();
	}
	public void TC004_Industries() throws InterruptedException {
		Thread.sleep(2000);
		Categories.click();
		Thread.sleep(2000);
		AllCheckbox.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_applyfilter.click();
	}
	public void TC005_searchIndustries() throws InterruptedException {
		Thread.sleep(2000);
		Categories.click();
		Thread.sleep(2000);
		searchCategories.sendKeys("Social Media & Networking");
		AllCheckbox.click();
		Thread.sleep(2000);
		btn_Goback.click();
		Thread.sleep(2000);
		btn_applyfilter.click();
	}
	public void TC006_selectClosedDeal() throws InterruptedException {
		Thread.sleep(2000);
		closeddealno.click();
		Thread.sleep(2000);
		btn_applyfilter.click();
	}
	public void TC007_selectClosedDeal() throws InterruptedException {
		Thread.sleep(2000);
		closeddealall.click();
		Thread.sleep(2000);
		btn_applyfilter.click();
	}
	public void TC008_filterAnnualRevenue() throws InterruptedException {
		Thread.sleep(2000);
		minvalue.click();
		Thread.sleep(2000);
		maxvalue.click();
		maxvalue.sendKeys(Keys.BACK_SPACE);		
		Thread.sleep(2000);
		btn_applyfilter.click();
	}
	

}
