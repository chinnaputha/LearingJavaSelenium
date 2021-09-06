package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestNaukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("Register for free")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.id("fname")).sendKeys("shivaraja");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("rgf99@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sfrdh10799");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='number']")).sendKeys("9856564345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='250']")).click();
		List<WebElement> list4 = driver
				.findElements(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/ul/li"));
		int size2 = list4.size();
		System.out.println(size2);
		for (WebElement opts : list4) {
			System.out.println(opts.getText());
			if (opts.getText().equals("Mumbai")) {
				opts.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("button[name='basicDetailSubmit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[name='qualification_0']")).click();

		List<WebElement> list5 = driver.findElements(By.xpath("//ul[@callback-ref='listingCallback'][1]/li"));
//int size=list5.size();
//System.out.println(size);
		for (WebElement otts : list5) {
			System.out.println(otts.getText());
			if (otts.getText().equals("Masters/Post-Graduation")) {
				otts.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input[tnmdependent='courseId_0']")).click();
		List<WebElement> list6 = driver.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[2]/li"));
		int size3 = list6.size();
		System.out.println("degree values" + size3);
		for (WebElement oppts5 : list6) {
			System.out.println(oppts5.getText());
			if (oppts5.getText().equals("CA")) {
				oppts5.click();
				break;
			}
		}
	}

}