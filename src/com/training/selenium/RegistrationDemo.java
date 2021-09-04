package com.training.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo extends TestBase {

	public void registration() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='countries']"));

		Select sel = new Select(ele);

		// sel.selectByIndex(8); //select dropdown value using index position
		sel.selectByVisibleText("Canada");// select dropdown value using text
		// sel.selectByValue("French Polynesia");//select dropdown value using option
		// value
		WebElement selOption = sel.getFirstSelectedOption();
		String selectedOptionText = selOption.getText();

		System.out.println("selected dropdown value-->" + selectedOptionText);

		// all the options available in country
		List<WebElement> allCoutnries = sel.getOptions();
		System.out.println("total coutries -->" + allCoutnries.size());

		List<String> al = new ArrayList<String>();
		// for loop

		for (int i = 0; i < allCoutnries.size(); i++) {
			System.out.println(i + " country name " + allCoutnries.get(i).getText());
			if (allCoutnries.get(i).getText().equals("China")) {
				System.out.println("Chind is present in country dropdown list");
				break;
			}

		}
		
		//enhaced for loop
		for(WebElement element:allCoutnries) {
			System.out.println("country values-->"+element.getText());
		}

		// List methods -- size,get,add, contains
		// adding all the coutry values to ArrayList
		for (int i = 0; i < allCoutnries.size(); i++) {
			al.add(allCoutnries.get(i).getText());

		}
		System.out.println("total values in arraylist-->" + al);

		// using for loop iterating 'al' values
		System.out.println("using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// Enhance for loop
		System.out.println("using enhanced for loop");
		for (String cc : al) {
			System.out.println(cc);

		}

		boolean isCountryAvailable = al.contains("China");
		System.out.println("is China coutry available-->" + isCountryAvailable);

		Thread.sleep(4000);

		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		RegistrationDemo rd = new RegistrationDemo();
		rd.registration();

	}

}
