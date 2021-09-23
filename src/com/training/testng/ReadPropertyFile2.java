package com.training.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile2 {
	FileInputStream fis;

	@Test
	public void readData() throws Exception {
		// find the file path
		File file = new File("suites\\login.properties");
		// read data from the file
		fis = new FileInputStream(file);
		Properties pro = new Properties();
		// load the property file using load method of Property class

		pro.load(fis);
		String username= pro.getProperty("username");
		pro.setProperty("app", "www.google.com");

		System.out.println("user name--->" + pro.getProperty("username"));//
		System.out.println("password --->" + pro.getProperty("password"));
		System.out.println("browser --->" + pro.getProperty("browser"));
		System.out.println("browser --->" + pro.getProperty("app"));
		

	}

}
