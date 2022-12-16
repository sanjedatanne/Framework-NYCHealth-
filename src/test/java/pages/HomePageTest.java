package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Base;

public class HomePageTest extends Base {

	@Test(enabled = false, priority = 1)
	public void clickLogo() {
		homePage.logoDisplayed();
	}
	
	@Test (enabled = false, priority = 2 )
	public void  logoDisplayed02 () {
		boolean flagDisplayed = driver.findElement(By.xpath("///a[@class= 'logo']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flagDisplayed);
	}
	
	@Test(enabled = false, priority = 3)
	public void search () throws InterruptedException {
		homePage.searchTool();
	}
	
	@Test(enabled = false, priority = 4)
	public void location () throws InterruptedException {
		homePage.location();
		}
	
	@Test(enabled = true, priority = 5)
	public void showMenu() throws InterruptedException {
		homePage.showMenu();
	}
	
	@Test (enabled = false, priority = 5)
	public void doctorName() throws InterruptedException {
		homePage.doctor();
	
	}
	@Test(enabled = false, priority = 6)
	public void searchTool02() throws InterruptedException {
		boolean searchToolEnabled = driver.findElement(By.xpath("//button[@class= 'search-button']")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + searchToolEnabled);
		Thread.sleep(4000);
}
}
