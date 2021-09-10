package com.training.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class to check Brokenlinks verification
 * @author Rajasekhar
 *
 */
public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			System.out.println("URL-->"+url);
			URL link=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			httpcon.connect();
			int rescode=httpcon.getResponseCode();
			System.out.println("status code-->"+rescode);
			if(rescode>400) {
				System.out.println(url+"is broken links");
			}
			else {
				System.out.println(url+"is valid");
			}
		}
	}

}
