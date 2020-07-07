package com.ibm.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListBox {
//write selenium script to verify whether fromport of newtours demo application has 10 elements
	
	public static void main(String[] args) {
				
		// Launch url
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
				
		//login
		driver.findElement(By.name("userName")).sendKeys("SillyLilly");
		driver.findElement(By.name("password")).sendKeys("Welcome123");
		driver.findElement(By.name("login")).click();
	
		Select dropDown = new Select(driver.findElement(By.name("fromPort")));
		List <WebElement> list = dropDown.getOptions();
		int cnt = list.size();
		System.out.println("The count of the From Port list is :"+cnt);
		driver.quit();
	}
}
