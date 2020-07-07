package com.ibm.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortBy {
	//write selenium script to check whether sort by list box of demowebshop application has 6 values
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://demowebshop.tricentis.com/apparel-shoes");
		
		Select dropDown = new Select(driver.findElement(By.id("products-orderby")));
		List <WebElement> listCnt = dropDown.getOptions();
		int cnt = listCnt.size();
		System.out.println("Count of the items in Sort By drop down is :"+cnt);
		driver.quit();
	}
}
