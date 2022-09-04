package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

static WebDriver driver;
	
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void enterUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public void elementSendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void elementClick(WebElement element) {
		element.click();
	}

	public String getApplicationTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement elementFindById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement elementFindByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement elementFindByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement elementFindXpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;
	}

	public void windowClose() {
		driver.close();

	}

	public static void windowQuit() {
		driver.quit();

	}

	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String elementGetAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String elementGetAttributeValue1(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public String getApplicationUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void elementSendkeysJS(WebElement element, String data) {
		JavascriptExecutor excutor = (JavascriptExecutor) driver;
		excutor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	public void cancelAlert() {
		driver.switchTo().alert().dismiss();

	}

	public String getpageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public void mouseOverAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void sendKeysByActions(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.sendKeys(data);
	}
	
	
	
	
	
	
	
	
	
	
	
//
//	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
//		String res = null;
//		File file = new File("");
//		FileInputStream stream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(rowNum);
//		Cell cell = row.getCell(cellNum);
//		CellType type = cell.getCellType();
//
//		switch (type) {
//		case STRING:
//			res = cell.getStringCellValue();
//
//			break;
//		case NUMERIC:
//			if (DateUtil.isCellDateFormatted(cell)) {
//				Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yy");
//				res = dateFormat.format(dateCellValue);
//
//			} else {
//
//				double numericCellValue = cell.getNumericCellValue();
//				BigDecimal decimal = new BigDecimal(numericCellValue);
//				res = decimal.toString();
//
//			}
//
//			break;
//		default:
//			break;
//		}
//		return res;
//
//	}
//	
//	public void updateData(String sheetName,int rowNum,int cellNum,String oldData,String newData) throws IOException {
//	
//		File file=new File("");
//		FileInputStream stream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(rowNum);
//		Cell cell = row.getCell(cellNum);
//		CellType type = cell.getCellType();
//         String value = cell.getStringCellValue();
//         if (value.equals(oldData)) {
//			cell.setCellValue(newData);
//		}
//	FileOutputStream fileOutputStream=new FileOutputStream(file);
//	workbook.write(fileOutputStream);
//	
//}
//	public void writeData(String sheetName,int rowNum,int cellNum,String newData) throws IOException {
//		File file=new File("");
//		FileInputStream stream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(rowNum);
//		Cell cell = row.createCell(cellNum);
//		cell.setCellValue(newData);
//		FileOutputStream fileOutPutStream=new FileOutputStream(file);
//		workbook.write(fileOutPutStream);
//	}
	
	
	

}
