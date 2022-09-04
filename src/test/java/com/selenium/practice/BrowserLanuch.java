package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanuch {

	
	public static void main(String[] args) {
		
		
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver=new EdgeDriver();
		
	
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// login page loactor
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("sathishFam");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("741@85BN");
		WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();

		// Search Hotel page locator

		WebElement loction = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		Select selectLoc = new Select(loction);
		selectLoc.selectByValue("London");

		WebElement hotel = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
		Select selectHotels = new Select(hotel);
		selectHotels.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
		Select selectRoomType = new Select(room);
		selectRoomType.selectByValue("Double");
		WebElement roomNo = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select selectRoomNo = new Select(roomNo);
		selectRoomNo.selectByValue("8");
		driver.findElement(By.xpath("//input[@name=\"datepick_in\"]")).sendKeys("12/08/2022");

		driver.findElement(By.xpath("//input[@name=\"datepick_out\"]")).sendKeys("15/08/2022");

		WebElement numRoom = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
		Select selectAdultRoom = new Select(numRoom);
		selectAdultRoom.selectByValue("2");
		WebElement childRoom = driver.findElement(By.xpath("//select[@name=\"child_room\"]"));
		Select selectChildRoom = new Select(childRoom);
		selectChildRoom.selectByValue("3");
		driver.findElement(By.id("Submit")).click();

		// Select hotel locator

		driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")).click();
		driver.findElement(By.id("continue")).click();

		// Book Hotel locator

		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Sathish");

		driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Kumar");

		driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys("Omr Chennai");

		WebElement cardNum = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
		cardNum.sendKeys("1234567891234567");
		WebElement cardType = driver.findElement(By.xpath("//select[@name=\"cc_type\"]"));
		Select selectCardType = new Select(cardType);
		selectCardType.selectByValue("VISA");
		WebElement monthExp = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		Select selectMonthExp = new Select(monthExp);
		selectMonthExp.selectByVisibleText("November");
		WebElement expYear = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		Select selectExpireYear = new Select(expYear);
		selectExpireYear.selectByVisibleText("2022");
		driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]")).sendKeys("1211");
        driver.findElement(By.xpath("//input[@name=\"book_now\"]")).click();

        //Booking Confirmation locator
		
        WebElement orderId = driver.findElement(By.xpath("//input[@name=\"order_no\"]"));
        String attributeValue = orderId.getAttribute("value");
        System.out.println(attributeValue);
	}

		
		
	
	
}
