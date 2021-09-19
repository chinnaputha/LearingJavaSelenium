package com.training.testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Class to search for mobile & select one and verify the Name & price
 * 
 * @author VishnuTej
 *
 */
public class vishnu_Flipkart extends BaseTest {
	@BeforeTest

	public void setUp() {
		appLaunch("https://flipkart.com/");
	}

	@Test
	@Parameters({ "email", "password" })
	public void selectMobile(String email, String password) throws InterruptedException {

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(email);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://www.flipkart.com/", "URL is not correct");

		// search for mobiles and clicks enter
		Thread.sleep(2000);//have to apply webdriver wait
		// elementToBeClickable("input[title='Search for products, brands and more']");
		WebElement search = driver.findElement(By.cssSelector("input[title='Search for products, brands and more']"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);

		// selects Min.range of 7000
		// elementToBeClickable("(//select[@class='_2YxCDZ'])[1]");
		Thread.sleep(2000); //have to apply webdriver wait
		WebElement min_vlaue = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));// dynamic class value
		Select select_min = new Select(min_vlaue);
		// select.selectByVisibleText("7000");
		select_min.selectByValue("7000");

		// selecting Min.range Using List
		/*
		 * List<WebElement> values_1 = select_min.getOptions();//stores all minimum
		 * values for (WebElement val : values_1) { val.getText().equals("7000");
		 * val.click(); }
		 */

		// selects Max.range of 20000
		// elementToBeClickable("(//select[@class='_2YxCDZ'])[2]");
		Thread.sleep(2000);// have to change to wait not working with wait
		WebElement max_value = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));// dynamic path used
		Select select_max = new Select(max_value);
		select_max.selectByValue("20000");

		// Selects 4GB Ram check box
		Thread.sleep(2000);//wait to be replace
		//elementToBeClickable("(//div[@class='_24_Dny'])[2]");
		WebElement ramSize = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[2]"));// dynamic class path used
		ramSize.click();

		// selecting Max.range Using List
		/*
		 * List<WebElement> values_2 = select_max.getOptions();//stores all max values
		 * for (WebElement val : values_2) { val.getText().equals("20000"); val.click();
		 * }
		 */

		// gives Name of mobile
		Thread.sleep(2000);
		// elementToBeClickable("//div[text()='POCO C3 (Arctic Blue, 64 GB)']");
		// WebElement mobileName = driver.findElement(By.xpath("//div[text()='POCO C3(Arctic Blue, 64 GB)']"));
		WebElement mobileName = driver.findElement(By.className("_4rR01T"));// dynamic class value used
		String name = mobileName.getText();
		System.out.println(name);

		// gives Price of mobile
		Thread.sleep(2000);
		 elementToBeClickable("//div[text()='POCO C3 (Arctic Blue, 64 GB)']");
		 WebElement mobilePrice = driver.findElement(By.xpath("(//div[text()='₹8,349'])[1]"));
		 String price = mobilePrice.getText();
		 System.out.println(price);

		// Window handle
		String parent_window = driver.getWindowHandle();
		System.out.println("parent window id is " + parent_window);
		// elementToBeClickable("//div[text()='POCO C3 (Arctic Blue, 64 GB)']");
		Thread.sleep(2000);

		mobileName.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println("total windows size is " + windows.size());

		for (String child_Window : windows) {
			System.out.println("child window id is " + child_Window);
			if (!child_Window.equals(parent_window)) {
				driver.switchTo().window(child_Window);

				Thread.sleep(2000);
				WebElement name_mobile = driver.findElement(By.xpath("//span[text()= 'POCO C3 (Arctic Blue, 64 GB)']"));
				String name_2 = name_mobile.getText();
				WebElement price_mobile = driver.findElement(By.xpath("(//div[text()='₹8,349'])[1]"));
				String price_2 = price_mobile.getText();

				/*
				 * if(name.equals(name_2)) {
				 * System.out.println("given name of the mobiles are same"); }
				 */

				Assert.assertEquals(price, price_2, "Price is not matched");
				Assert.assertEquals(name, name_2, "name of mobile is not matching");// validates mobile name

			} // end of if loop

		} // end of for loop

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
