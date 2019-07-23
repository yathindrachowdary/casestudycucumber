package testpack3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browserPack.UtilityClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginfactor3 {
	WebDriver driver;
	  
	  @Given("^User opens the browser and User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	  public void user_opens_the_browser_and_User_enters_username_and_password(String arg1, String arg2) throws Throwable {
	   driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
	   
	   driver.findElement(By.name("userName")).sendKeys(arg1);
	   driver.findElement(By.name("password")).sendKeys(arg2);
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	  }




	 @When("^User searches headphone in the search box$")
	  public void user_searches_headphone_in_the_search_box() throws Throwable {
	   //String b="head";
	   System.out.println("1");
	    // driver.findElement(By.id("myInput")).sendKeys("headphone");
	   driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
	     System.out.println("2");
	     driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	     System.out.println("3");




	 }




	 @Then("^Validating the search results$")
	  public void validating_the_search_results() throws Throwable {
	   String a=driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(1) > center:nth-child(1) > h4")).getText();
	   Assert.assertEquals(a, "Headphone");
	   System.out.println("Search engine provides an acccurate result and procceding");
	  }
}
