package com.ibm.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page_Title_Test {
	public static void main(String[] args) {
		
	
		//Write Selenium script to confirm whether the application displays manzoormehadi26@gmail.com upon successful login
		//Launch URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://demowebshop.tricentis.com/");
		
		//Click on Login link
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		//Enter Credentials
		driver.findElement(By.id("Email")).sendKeys("Gilly@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Welcome123");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		//Email validation
		String email = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		
		if (email.contains("Gilly@gmail.com"))
			System.out.println("Log in Successful and "+email+" displayed on HOME page");
		else
			System.out.println("Log in NOT Successful");
		
		driver.quit();
		
	}
}
