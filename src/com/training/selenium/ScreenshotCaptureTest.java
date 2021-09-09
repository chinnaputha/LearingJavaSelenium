package com.training.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotCaptureTest extends TestBase {

	public void captureScreen() throws InterruptedException, IOException {
		openApplication("https://www.facebook.com/");
		Thread.sleep(4000);

		captureScreenshot();

		driver.close();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		ScreenshotCaptureTest sct = new ScreenshotCaptureTest();
		sct.captureScreen();
	}

}
