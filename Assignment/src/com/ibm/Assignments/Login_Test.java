package com.ibm.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Test {
	public static void main(String[] args) {
		//write selenium script to check page title before & after logging into the application
		
		// Launch url
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//get title before login
		String titleB4Login = driver.getTitle();
		System.out.println(titleB4Login);
		
		//login
		driver.findElement(By.name("userName")).sendKeys("SillyLilly");
		driver.findElement(By.name("password")).sendKeys("Welcome123");
		driver.findElement(By.name("login")).click();
		
		//get title after login
		String titleAfterLogin = driver.getTitle();
		System.out.println(titleAfterLogin);
		
		//Validation
		
		if(titleB4Login == titleAfterLogin) {
			System.out.println("Title before login :"+titleB4Login);
			System.out.println("Title after login :"+titleAfterLogin);
			System.out.println("Title before & after login are not same and TC is PASSED");
		}
		else
			System.out.println("Title before & after login are same and TC is FAILED");
			
		driver.quit();
	}
}
