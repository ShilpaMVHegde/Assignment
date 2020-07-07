package com.ibm.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrat_Test {
	public static void main(String[] args) {
		//Write Selenium script to confirm whether the application displays continue button upon successful registartion
		
		//Launch url
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://demowebshop.tricentis.com/");
		
		//click register link
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
			
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("BDilly");
		driver.findElement(By.id("LastName")).sendKeys("Tilly");
		driver.findElement(By.id("Email")).sendKeys("Dilly@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Welcome123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Welcome123");
		driver.findElement(By.id("register-button")).click();
		String continueBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).getAttribute("value");
		
		System.out.println(continueBtn);
		if(continueBtn.contains("Continue"))
			System.out.println("Registration completed successfully & Test Case is  Passed");
			else
			System.out.println("Registration unsuccessfull & Test Case is  Failed");
		
		driver.quit();
	}
}
