package testpack11;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browserPack.UtilityClass;
//import brwoser.utilityclass;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginfactor11 {
	WebDriver driver;
	@Given("^user want to signup in testme app$")
	public void user_want_to_signup_in_testme_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@When("^user opens the testme app using url$")
	public void user_opens_the_testme_app_using_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver=UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Then("^click on the signup button$")
	public void click_on_the_signup_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@Then("^fill the required fields$")
	public void fill_the_required_fields(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class); 
		for(int i=0;i<list.size();i++) {
			driver.findElement(By.name("userName")).sendKeys(list.get(i).get("username"));
			driver.findElement(By.name("firstName")).sendKeys(list.get(i).get("firstname"));
			driver.findElement(By.name("lastName")).sendKeys(list.get(i).get("lastname"));
			driver.findElement(By.name("password")).sendKeys(list.get(i).get("password"));
			driver.findElement(By.name("confirmPassword")).sendKeys(list.get(i).get("conform Password"));
			switch(list.get(i).get("gender")) {
			case "m":
				driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
				break;
			case "f":
				driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
			break;
			}
			driver.findElement(By.id("emailAddress")).sendKeys(list.get(i).get("e-mail"));
			driver.findElement(By.id("mobileNumber")).sendKeys(list.get(i).get("mobile number"));
			driver.findElement(By.name("dob")).sendKeys(list.get(i).get("dob"));
			driver.findElement(By.name("address")).sendKeys(list.get(i).get("address"));
			 driver.findElement(By.name("answer")).sendKeys(list.get(i).get("answer"));
		}
	}

	@Then("^click on registration button$")
	public void click_on_registration_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("Submit")).click();
	}
}
