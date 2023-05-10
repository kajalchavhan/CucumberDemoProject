package StepDefinition;
import io.cucumber.junit.Cucumber;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModel.CommonMethods;
import PageObjectModel.SignUpPageObject;
import Resources.Constant;
import Resources.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class verifySignUp extends baseClass{

    	//public WebDriver driver;
	    public  SignUpPageObject SPO;
	    
	    @Given("^the saleforce home page$")
	    public void the_saleforce_home_page() throws Throwable {
	    	//driver=new ChromeDriver(); 
	    	initializeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    }
	    
	    @When("^user navigates to homepage \"([^\"]*)\"$")
	    public void user_navigates_to_homepage_something(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    	
	    }

	    @And("^click on tryforfree$")
	    public void click_on_tryforfree() throws Throwable {
	    	SPO=new SignUpPageObject(driver);
	    	SPO.ClickOnTryForFree().click();
	    }
	    @And("^first entre employee firstname and lastname then entre email$")
	    public void first_entre_employee_firstname_and_lastname_then_entre_email_and_jobtitle() throws Throwable {
	    	SPO.entreFirstName().sendKeys(Constant.FirstName);
		    SPO.entrelastName().sendKeys(Constant.LastName);
		    SPO.entreEmailId().sendKeys(Constant.EmailID);
		   // SPO.entreJobTtitle().sendKeys(Constant.JobTitle);
	    }
	    @And("^select jobtitle$")
	    public void select_jobtitle() throws Throwable {
	    	CommonMethods.handleDropdown(SPO.entreJobTtitle(), 3);
	    }
	    @And("^entre company Name$")
	    public void entre_company_name() throws Throwable {
	    	SPO.entreCompanyName().sendKeys(Constant.CompanyName);
	    }
	    @Then("^select employee and entre phoneno$")
	    public void select_employee_and_entre_phoneno() throws Throwable {
	    	CommonMethods.handleDropdown(SPO.entreEmployee(), 1);
	    	SPO.entrePhoneNum().sendKeys(Constant.PhoneNo);
	    }
	    @Then("^select company country$")
	    public void select_company_country() throws Throwable {
	    	CommonMethods.handleDropdown(SPO.entreCompanyCountry(), 5);
	    }
	 /*   @Then("^click on check box$")
	    public void click_on_check_box() throws Throwable {
	    	SPO.ClickCheckValidatate().click();
	    }
	    //Then click on check box
	    *
	    */
	 

	    
	    
	
	   

	   

	    


}
