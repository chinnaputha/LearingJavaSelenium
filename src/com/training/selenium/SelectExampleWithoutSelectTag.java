package com.training.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Perform dropdown options where select tag not present, in this case we should not use select class
 * @author Chinna.Putha
 *
 */
public class SelectExampleWithoutSelectTag extends TestBase {

	public void registration() throws InterruptedException, IOException {
		openApplication("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		
		List<WebElement> allOptions= driver.findElements(By.xpath("//ul[@id='select2-country-results']/descendant::li"));
		//iterating dropdown values using for each loop
		for(WebElement opt: allOptions) {
			System.out.println("option text-->"+opt.getText());
			if(opt.getText().equals("Bangladesh")) {
				opt.click();
				break;
			}
		}
		captureScreenshot();
		Thread.sleep(4000);
		driver.close();
	}

	public static void main(String[] args) throws Exception {
		SelectExampleWithoutSelectTag rd = new SelectExampleWithoutSelectTag();
		rd.registration();

	}

}
