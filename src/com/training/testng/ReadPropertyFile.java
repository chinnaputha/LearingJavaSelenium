package com.training.testng;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {
	FileInputStream fis;
	
	@Test
	public void readData() {
		//find the file path
		File file= new File("suites\\login.properties");
		try {
			//read data from the file
			fis = new FileInputStream(file);
		} catch (Throwable e) {
			System.out.println("File not available");
			e.printStackTrace();
		}
		
		Properties pro= new Properties();
		
		//load the property file using load method of Property class
		try {
			pro.load(fis);
		} catch (IOException e) {
			System.out.println("File not have any data");
			e.printStackTrace();
		}
		
		System.out.println("user name--->"+pro.getProperty("username"));//
		System.out.println("password --->"+pro.getProperty("password"));
		System.out.println("browser --->"+pro.getProperty("browser"));
		System.out.println("browser --->"+pro.getProperty("browser1"));
		
	}

}
