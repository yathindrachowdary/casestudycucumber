package testpack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browserPack.UtilityClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginfactor4 {
	WebDriver driver;
	
	  @Given("^User opens the browser and User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	  public void user_opens_the_browser_and_User_enters_username_and_password(String arg1, String arg2) throws Throwable {
	   driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
	   
	   driver.findElement(By.name("userName")).sendKeys(arg1);
	   driver.findElement(By.name("password")).sendKeys(arg2);
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	  }
	  
	  
	  
@When("^User searches headphone in the search box and proceed to pay without adding any item in cart$")
public void user_searches_headphone_in_the_search_box_and_proceed_to_pay_without_adding_any_item_in_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
	driver.findElement(By.id("myInput")).sendKeys("Headphone");
    driver.findElement(By.xpath(".//input[@value='FIND DETAILS']")).click();
}



@Then("^TestMeApp doesn't display the cart icon$")
public void testmeapp_doesn_t_display_the_cart_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	
	if (driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {
	       driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
	       System.out.println("SOMETHING SOMETHING");
	        }
	      else {
	       System.out.println("\n\nICON NOT FOUND\n\n");
	        }  
}
}
