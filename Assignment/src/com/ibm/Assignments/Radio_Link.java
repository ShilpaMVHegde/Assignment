package com.ibm.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio_Link {
	public static void main(String[] args) {
		//write a selenium script to identify number of links & radio buttons present in the registration page.
		
		//Launch url
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://demowebshop.tricentis.com/");
		
		//click register link
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		//register page detail input
		List<WebElement> Radiolist = driver.findElements(By.xpath("//input[@type='radio']"));
		int ListofRadio = Radiolist.size();
		System.out.println("Total no. of radio buttons on Registration page is "+ListofRadio);
		
		List<WebElement> Linklist = driver.findElements(By.tagName("a"));
		int ListofLink = Linklist.size();
		System.out.println("Total no. of link buttons on Registration page is "+ListofLink);
		
	
		
		if(ListofRadio!=0 & ListofLink!=0)
			System.out.println("TC PASSED");
			else
			System.out.println("TC FAILED");
		
		driver.quit();
	}
}
