package testPack;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import browserPack.UtilityClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginWithFactor {
//	WebDriver driver;
	WebDriver driver;
	  
	  @Given("^User should be in registeration page$")
	  public void user_should_be_in_registeration_page() throws Throwable {
	   
	   //driver=Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/RegisterUser.htm");  

	   driver=UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/RegisterUser.htm");


	 }




	 
	  
	  @When("^Enter the user details in the registration page username \"([^\"]*)\" firstname \"([^\"]*)\" lastName \"([^\"]*)\" password$")
	  public void enter_the_user_details_in_the_registration_page_username_firstname_lastName_password(String arg1, String arg2, String arg3) throws Throwable {
	     driver.findElement(By.name("userName")).sendKeys(arg1);
	     driver.findElement(By.name("firstName")).sendKeys(arg2);
	     driver.findElement(By.name("lastName")).sendKeys(arg3);
	  }




	 @When("^\"([^\"]*)\" confirmPassword \"([^\"]*)\" emailAddress \"([^\"]*)\" mobileNumber \"([^\"]*)\" dob \"([^\"]*)\"$")
	  public void confirmpassword_emailAddress_mobileNumber_dob(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {




	      driver.findElement(By.name("password")).sendKeys(arg1);
	     driver.findElement(By.name("confirmPassword")).sendKeys(arg2);
	     driver.findElement(By.xpath("//input[@value='Male']")).click();
	     driver.findElement(By.name("emailAddress")).sendKeys(arg3);
	     driver.findElement(By.name("mobileNumber")).sendKeys(arg4);
	     driver.findElement(By.name("dob")).sendKeys(arg5);
	  }




	 @When("^address \"([^\"]*)\" answer \"([^\"]*)\"$")
	  public void address_answer(String arg1, String arg2) throws Throwable {
	     driver.findElement(By.name("address")).sendKeys(arg1);
	     Select sq=new Select(driver.findElement(By.name("securityQuestion")));
	     sq.selectByIndex(1);
	     driver.findElement(By.name("answer")).sendKeys(arg2);
	     driver.findElement(By.xpath("//input[@value='Register']")).click();
	  }
	  
	 /* @When("^Enter the user details in the registration page$")
	  public void enter_the_user_details_in_the_registration_page() throws Throwable {
	   
	     driver.findElement(By.name("userName")).sendKeys("arifjamru1800");
	     driver.findElement(By.name("firstName")).sendKeys("arif");
	     driver.findElement(By.name("lastName")).sendKeys("jamru");
	     driver.findElement(By.name("password")).sendKeys("arif123");
	     driver.findElement(By.name("confirmPassword")).sendKeys("arif123");
	     driver.findElement(By.xpath("//input[@value='Male']")).click();
	     driver.findElement(By.name("emailAddress")).sendKeys("arif@gmail.com");
	     driver.findElement(By.name("mobileNumber")).sendKeys("9876543211");
	     driver.findElement(By.name("dob")).sendKeys("13/08/1997");
	     driver.findElement(By.name("address")).sendKeys("12,north street");
	     Select sq=new Select(driver.findElement(By.name("securityQuestion")));
	     sq.selectByIndex(1);
	     driver.findElement(By.name("answer")).sendKeys("blue");
	     driver.findElement(By.xpath("//input[@value='Register']")).click();




	 }*/




	 @Then("^Registration successful$")
	  public void registration_successful() throws Throwable {
	   
	   WebDriverWait wait= new WebDriverWait(driver, 50);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
	   Assert.assertEquals(driver.getTitle(), "Login");
	   System.out.println("Registered Successfully !!");
	   driver.close();




	 }
}
