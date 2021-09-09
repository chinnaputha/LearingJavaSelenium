package com.training.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class to Register Naukri Portal
 * 
 * @author Shiva Rajasekhar
 *
 */
public class TestNaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.partialLinkText("Register for free")).click();
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.id("fname")).sendKeys("shivaraja");
		String email = RandomStringUtils.randomAlphabetic(12);
		driver.findElement(By.name("email")).sendKeys(email + "@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sfrdh10799");
		driver.findElement(By.cssSelector("input[name='number']")).sendKeys("9856564345");
		driver.findElement(By.xpath("//input[@maxlength='250']")).click();
		List<WebElement> list1 = driver
				.findElements(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/ul/li"));
		int size1 = list1.size();
		System.out.println(size1);
		for (WebElement opts1 : list1) {
			System.out.println(opts1.getText());
			if (opts1.getText().equals("Mumbai")) {
				opts1.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("button[name='basicDetailSubmit']")).click();
		driver.findElement(By.cssSelector("input[name='qualification_0']")).click();

		List<WebElement> list2 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[1]/li/descendant::span"));
		// int size2=list5.size();
		// System.out.println(size2);
		for (WebElement otts2 : list2) {
			System.out.println(otts2.getText());
			if (otts2.getText().equals("Masters/Post-Graduation")) {
				otts2.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input[tnmdependent='courseId_0']")).click();
		List<WebElement> list3 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[2]/li/descendant::span"));
		int size3 = list3.size();
		System.out.println("degree values " + size3);
		for (WebElement oppts3 : list3) {
			System.out.println(oppts3.getText());
			if (oppts3.getText().equals("MCA")) {
				oppts3.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("[name='spec_0']")).click();
		List<WebElement> list4 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[3]/li/descendant::span"));
		int size4 = list4.size();
		System.out.println("degree values " + size4);
		for (WebElement oppts4 : list4) {
			System.out.println(oppts4.getText());
			if (oppts4.getText().equals("Computers")) {
				oppts4.click();
				break;
			}

		}
		driver.findElement(By.name("institute_0")).sendKeys("Vignan university");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='couseType_full_0']")).click();
		driver.findElement(By.xpath("//input[@name='passingYear_0']")).click();
		List<WebElement> list5 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[4]/li/descendant::span"));
		int size5 = list5.size();
		System.out.println(size5);
		for (WebElement optts5 : list5) {
			System.out.println(optts5.getText());
			if (optts5.getText().equals("2021")) {
				optts5.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@name='qualification_1']")).click();
		List<WebElement> list6 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[5]/li/descendant::span"));
		int size6 = list6.size();
		System.out.println(size6);
		for (WebElement optts6 : list6) {
			System.out.println(optts6.getText());
			if (optts6.getText().equals("Graduation/Diploma")) {
				optts6.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@tnmdependent='courseId_1']")).click();
		List<WebElement> list7 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[6]/li/descendant::span"));
		int size7 = list7.size();
		System.out.println(size7);
		for (WebElement optts7 : list7) {
			System.out.println(optts7.getText());
			if (optts7.getText().equals("B.Sc")) {
				optts7.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='spec_1']")).click();
		Thread.sleep(7000);
		List<WebElement> list8 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[7]/li/descendant::span"));
		int size8 = list8.size();
		System.out.println(size8);
		for (WebElement optts8 : list8) {
			System.out.println(optts8.getText());
			if (optts8.getText().equals("Computers")) {
				optts8.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='institute_1']")).sendKeys("Chalapathi DegreeCollage");
		driver.findElement(By.xpath("//label[@for='couseType_full_1']")).click();
		driver.findElement(By.xpath("//input[@name='passingYear_1']")).click();
		List<WebElement> list9 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[8]/li/descendant::span"));
		int size9 = list9.size();
		System.out.println(size9);
		for (WebElement optts9 : list9) {
			System.out.println(optts9.getText());
			if (optts9.getText().equals("2019")) {
				optts9.click();
				break;
			}
		}
		driver.findElement(By.linkText("+ Add more education")).click();
		driver.findElement(By.cssSelector("input[name='qualification_2']")).click();

		List<WebElement> list10 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[9]/li/descendant::span"));
// int size10=list10.size();
// System.out.println(size10);
		for (WebElement otts10 : list10) {
			System.out.println(otts10.getText());
			if (otts10.getText().equals("12th")) {
				otts10.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='schoolBoardId_2']")).click();
// need to reslove the issue
		List<WebElement> list11 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[10]/li/descendant::span"));
		int size11 = list11.size();
		System.out.println("degree values " + size11);
		for (WebElement oppts11 : list11) {
			System.out.println(oppts11.getText());
			if (oppts11.getText().equals("Andhra Pradesh")) {
				oppts11.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='schoolCompletionYear_2']")).click();
		Thread.sleep(2000);
		List<WebElement> list12 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[11]/li/descendant::span"));
		int size12 = list12.size();
		System.out.println(size12);
		for (WebElement optts12 : list12) {
			System.out.println(optts12.getText());
			if (optts12.getText().equals("2016")) {
				optts12.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='schoolMediumId_2']")).click();
		Thread.sleep(2000);

		List<WebElement> list13 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[12]/li/descendant::span"));
		int size13 = list13.size();
		System.out.println(size13);
		for (WebElement optts13 : list13) {
			System.out.println(optts13.getText());
			if (optts13.getText().equals("English")) {
				optts13.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='schoolPercentageId_2']")).click();
		Thread.sleep(2000);

		List<WebElement> list14 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[13]/li/descendant::span"));
		int size14 = list14.size();
		System.out.println(size14);
		for (WebElement optts14 : list14) {
			System.out.println(optts14.getText());
			if (optts14.getText().equals("75-79.9%")) {
				optts14.click();
				break;
			}
		}
		driver.findElement(By.linkText("+ Add more education")).click();
		driver.findElement(By.cssSelector("input[name='qualification_3']")).click();

		List<WebElement> list15 = driver
				.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[14]/li/descendant::span"));
		int size15 = list15.size();
		System.out.println(size15);
		for (WebElement otts15 : list15) {
			System.out.println(otts15.getText());
			if (otts15.getText().equals("10th")) {
				otts15.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("[name='schoolBoardId_3']")).click();
				List<WebElement> list16 = driver
						.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[15]/li/descendant::span"));
				int size16 = list11.size();
				System.out.println("degree values " + size16);
				for (WebElement oppts16 : list16) {
					System.out.println(oppts16.getText());
					if (oppts16.getText().equals("Andhra Pradesh")) {
						oppts16.click();
						break;
					}
				}
				driver.findElement(By.cssSelector("[name='schoolCompletionYear_3']")).click();
				Thread.sleep(2000);
				List<WebElement> list17 = driver
						.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[16]/li/descendant::span"));
				int size17 = list16.size();
				System.out.println(size17);
				for (WebElement optts17 : list17) {
					System.out.println(optts17.getText());
					if (optts17.getText().equals("2014")) {
						optts17.click();
						break;
					}
				}
				driver.findElement(By.cssSelector("[name='schoolMediumId_3']")).click();
				Thread.sleep(2000);

				List<WebElement> list18 = driver
						.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[17]/li/descendant::span"));
				int size18 = list18.size();
				System.out.println(size18);
				for (WebElement optts18 : list18) {
					System.out.println(optts18.getText());
					if (optts18.getText().equals("English")) {
						optts18.click();
						break;
					}
				}
				driver.findElement(By.cssSelector("[name='schoolPercentageId_3']")).click();
				Thread.sleep(2000);

				List<WebElement> list19 = driver
						.findElements(By.xpath("(//ul[@callback-ref='listingCallback'])[18]/li/descendant::span"));
				int size19 = list19.size();
				System.out.println(size19);
				for (WebElement optts19 : list19) {
					System.out.println(optts19.getText());
					if (optts19.getText().equals("75-79.9%")) {
						optts19.click();
						break;
					}
				}
driver.findElement(By.cssSelector("[name='keyskills']")).sendKeys("manul,corejava,automation");
driver.findElement(By.cssSelector("[name='submitEducationDetail']")).click();
	}
}