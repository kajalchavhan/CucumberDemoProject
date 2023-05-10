package StepDefinition;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModel.LoginPageObject;
import Resources.Constant;
import Resources.baseClass;
import io.cucumber.junit.Cucumber;
import PageObjectModel.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefination extends baseClass{
	
	
     //public WebDriver driver;
	 public  LoginPageObject LPO;
	 @Given("^I navigate to the login page$")
	    public void i_navigate_to_the_login_page() throws Throwable {
	        System.out.println("Here is the Background keyword");
	    }
	 @Given("^initialize the browser$")
	    public void initialize_the_browser() throws Throwable {
		//driver=new ChromeDriver();
		initializeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    }

	    @When("^user navigates to \"([^\"]*)\"$")
	    public void user_navigates_to_something(String strArg1) throws Throwable {
	       driver.get(strArg1);
	    }

	    @And("^entre (.+) and (.+)$")
	    public void entre_and(String username, String password) throws Throwable {
	      /* driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);*/
	    	LPO=new LoginPageObject(driver);
	    	LPO.entreUsername().sendKeys(username);
	    	LPO.entrePassword().sendKeys(password);
	    }

	    @And("^click on login$")
	    public void click_on_login() throws Throwable {
	    	 
	    	 LPO.clickLogin().click();
	       // driver.findElement(By.xpath("//input[@type='submit']")).click();
	    }
	    @Then("^user user should be able to login$")
	    public void user_user_should_be_able_to_login() throws Throwable {
	        LPO.clickonerrorText().click();	
	 	//WebElement a=driver.findElement(By.xpath("//div[@id='error']"));
	 	  
	 	    String actualText=LPO.clickonerrorText().getText();
	 	   	String ExpectedText=Constant.loginExpectedMessage;
	 	   	CommonMethods.handleAssersions(actualText,ExpectedText, "Error massage is not match");
	    }
	
	
	
	    
	    
	    
	/* @Given("^initialize the browser$")
	    public void initialize_the_browser() throws Throwable {
		 driver=new EdgeDriver();
	 }
	 /* initializeDriver();	
			
			String url=prop.getProperty("url");
	    	driver.get(url);
	      driver=new EdgeDriver();
	       driver.manage().window().maximize();
	    }

	    @When("^user navigates to url and entre username and password$")
	    public void user_navigates_to_url_and_entre_username_and_password() throws Throwable {
	    	driver.get(null);
	    LPO=new LoginPageObject(driver);
	    LPO.entreUsername().sendKeys(Constant.username);
	    LPO.entrePassword().sendKeys(Constant.password);
	         
	    }
	    @And("^click on login$")
	    public void click_on_login() throws Throwable {
	    LPO.clickLogin().click();	
	   
	    }

	    @Then("^user user should be able to login succesfully$")
	    public void user_user_should_be_able_to_login_succesfully() throws Throwable {
	    LPO.clickonerrorText();	
	   // WebElement a=driver.findElement(By.xpath("//div[@id='error']"));
	    String actualText=LPO.clickonerrorText().getText();
	   	String ExpectedText=Constant.loginExpectedMessage;
	   	CommonMethods.handleAssersions(actualText,ExpectedText, "Error massage is not match");
	   
	   	
	    }*/

	    
	    
	    	
}
