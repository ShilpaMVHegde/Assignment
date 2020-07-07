package com.ibm.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserNameTest {
	//write selenium script to verify whether entered value in the username textbox mercury new tours demo is manzoor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("SillyLilly");
						
		String Uname = driver.findElement(By.name("userName")).getAttribute("value");
		System.out.println(Uname);
		if(Uname.contains("SillyLilly"))
			System.out.println("Username entered is correct");
		else
			System.out.println("Username entered is incorrect");
		
		driver.quit();
	}	
}
