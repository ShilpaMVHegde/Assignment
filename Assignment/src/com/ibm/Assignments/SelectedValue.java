package com.ibm.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedValue {
	//Write selenium script to check whether selected value of fromport is present in toport of new tours demo application
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
		
		Select fromDropDown = new Select(driver.findElement(By.name("fromPort")));
		List <WebElement> frmList = fromDropDown.getOptions();
		int frmCnt = frmList.size();
				
		Select toDropDown = new Select(driver.findElement(By.name("toPort")));
		List <WebElement> toList = toDropDown.getOptions();
		int toCnt = toList.size();
		
		Select frmDropDown = new Select(driver.findElement(By.name("fromPort")));
		frmDropDown.selectByValue("Frankfurt");
		
		for(int i=0; i<toCnt; i++) {
			WebElement toValue = toList.get(i);
					if (((List<WebElement>) toValue).contains("Frankfurt"))
						System.out.println("found");
		}
		
//		frmPort = frmPort+1;
//		}
//		
////		if (frmPort == 1) {
//		Select toDropDown = new Select(driver.findElement(By.name("toPort")));
//		
//		//toDropDown.selectByValue("Frankfurt");
//		frmPort = frmPort+1;
////		}
//		
//		if(frmPort==2)
//				System.out.println("From port selected is also available in To Port options");
//		else
//				System.out.println("From port selected is NOT available in To Port options");
	//driver.quit();
	}
}
