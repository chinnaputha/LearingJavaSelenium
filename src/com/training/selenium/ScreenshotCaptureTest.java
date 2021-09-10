package com.training.selenium;

import java.io.IOException;

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
