package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
public WebDriver driver;
    private By tryForFree=By.xpath("//a[@id='signup_link']");
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By lastName=By.xpath("//input[@name='UserLastName']");
	private By jobTtitle=By.xpath("//select[@name='UserTitle']");
	
	private By phoneNum=By.xpath("//input[@name='UserPhone']");
	private By emailId=By.xpath("//input[@name='UserEmail']");

	private By companyName=By.xpath("//input[@name='CompanyName']");	
	private By employee=By.xpath("//select[@name='CompanyEmployees']");
	private By CompanyCountry=By.xpath("//select[@name='CompanyCountry']");
	private By checkValidatate=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	public WebElement ClickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
	public WebElement entreFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement entrelastName() {
		return driver.findElement(lastName);
	}
	public WebElement entreJobTtitle() {
		return driver.findElement(jobTtitle);
	}
	
	public WebElement entrePhoneNum() {
		return driver.findElement(phoneNum);
	}
	public WebElement entreEmailId() {
		return driver.findElement(emailId);
	}
	

	public WebElement entreCompanyName() {
	return driver.findElement(companyName);
	}
	
	//Static drop down list--
	public WebElement entreEmployee() {
	return driver.findElement(employee);
	
	}
	public WebElement entreCompanyCountry() {
	return driver.findElement(CompanyCountry);
	}
	public WebElement ClickCheckValidatate() {
		return driver.findElement(checkValidatate);
	}
}
