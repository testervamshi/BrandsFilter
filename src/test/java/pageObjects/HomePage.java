package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath="//span[text()=' ENTER ITW UNIVERSE']")
	WebElement btn_ITW;
	
	@FindBy (xpath="//input[@type='email']")
	WebElement txt_email;
	
	@FindBy (xpath="//span[text()='Next']")
	WebElement btn_next;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement txt_password;
	
	public void click_ITW() throws InterruptedException {
		Thread.sleep(3000);
		btn_ITW.click();
	}
	
	public void set_Login() throws InterruptedException {
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String p=it.next();
		String c=it.next();
		driver.switchTo().window(c);
		txt_email.sendKeys("vamshi@thealteroffice.com");
		btn_next.click();
		Thread.sleep(3000);
		txt_password.sendKeys("Nani@1507");
		btn_next.click();
		Thread.sleep(3000);
		driver.switchTo().window(p);
	}

}
