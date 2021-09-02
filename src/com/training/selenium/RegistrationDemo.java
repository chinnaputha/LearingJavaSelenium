package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo extends TestBase {
	
	public  void registration() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='countries']"));
		
		Select sel = new Select(ele);
		
		//sel.selectByIndex(8); //select dropdown value using index position
		sel.selectByVisibleText("Canada");// select dropdown value using text
		//sel.selectByValue("French Polynesia");//select dropdown value using option value
		WebElement selOption= sel.getFirstSelectedOption();
		String selectedOptionText = selOption.getText();
		System.out.println("selected dropdown value-->"+selectedOptionText);
		
		Thread.sleep(4000);
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		RegistrationDemo rd = new RegistrationDemo();
		rd.registration();

	}

}
