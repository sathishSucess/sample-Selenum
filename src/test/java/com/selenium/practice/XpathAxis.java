package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathAxis extends BaseClass{

	public static String getContryName(String company) {

		WebElement textCompany = driver.findElement(By.xpath("//td[text()='"+ company +"']//following-sibling::td[2]"));
		////td[text()='Ernst Handel']//follwing-sibling::td[2]
		// //td[text()='Alfreds Futterkiste']//following-sibling::td[2]
		String text = textCompany.getText();
		return text;
		
	}
	public static void main(String []args) {
		 getDriver();
		 enterUrl("https://www.w3schools.com/html/html_tables.asp");
		String contryName = getContryName("Alfreds Futterkiste");
		System.out.println(contryName);
		
		
	}
	
	
	
	
	
	
}
