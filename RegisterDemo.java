package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterDemo {
	
	WebDriver driver;
	

	@Given("^Open Browser and start application$")
	public void open_Browser_and_start_application() throws Throwable {
	    
		//System.setProperty("webdriver.chrome.driver","C:/Users/nagal/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demoqa.com/registration/");
	    driver.manage().window().maximize();
		
	}

	@When("^User click on Submit$")
	public void user_click_on_Submit() throws Throwable {
		driver.findElement(By.name("pie_submit")).click();
	}

	@Then("^Error message is generated$")
	public void error_message_is_generated() throws Throwable {
	   
	}

	@When("^User click on Marital Status$")
	public void user_click_on_Marital_Status() throws Throwable {
		driver.findElement(By.xpath("//input[@name='radio_4[]' and @value='married']")).click();
	}

	@When("^User set Country$")
	public void user_set_Country() throws Throwable {
		new Select(driver.findElement(By.id("dropdown_7"))).selectByVisibleText("Albania");
	}

	@When("^User select Date of Birth$")
	public void user_select_Date_of_Birth() throws Throwable {
		new Select(driver.findElement(By.id("mm_date_8"))).selectByVisibleText("7");
		
		 new Select(driver.findElement(By.id("dd_date_8"))).selectByVisibleText("7");
		
		 new Select(driver.findElement(By.id("yy_date_8"))).selectByVisibleText("1988");
	}

	@When("^User upload profile picture$")
	public void user_upload_profile_picture() throws Throwable {
	   
	}

	@When("^User enters description about yourself$")
	public void user_enters_description_about_yourself() throws Throwable {
		driver.findElement(By.id("description")).sendKeys("I am fond of dancing");
	}
	
	@Then("^Click Submit and Error message is generated$")
	public void click_Submit_and_Error_message_is_generated() throws Throwable {
		driver.findElement(By.name("pie_submit")).click();
	}

	@When("^User enters First Name as \"([^\"]*)\"$")
	public void user_enters_First_Name_as(String firstname) throws Throwable {
		driver.findElement(By.id("name_3_firstname")).sendKeys(firstname);
	}

	@When("^User enters Last Name	as \"([^\"]*)\"$")
	public void user_enters_Last_Name_as(String lastname) throws Throwable {
		driver.findElement(By.id("name_3_lastname")).sendKeys(lastname);
	}

	@When("^User click on Marital Status as \"([^\"]*)\"$")
	public void user_click_on_Marital_Status_as(String status) throws Throwable {
		List<WebElement> radiobtn = driver.findElements(By.name("radio_4[]"));
		int valueSize = radiobtn.size();
		for(int i=0; i<valueSize; i++)
		{
			String sValue = radiobtn.get(i).getAttribute("value");
			if(sValue.equals(status))
			{
				radiobtn.get(i).click();
				break;
			}
			
		}
	}

	@When("^User select Hobby as	\"([^\"]*)\"$")
	public void user_select_Hobby_as(String hobby) throws Throwable {
		List<WebElement> checkbox = driver.findElements(By.name("checkbox_5[]"));
		int valSize = checkbox.size();
		for(int j=0; j<valSize; j++)
		{
			String sValue = checkbox.get(j).getAttribute("value");
			if(sValue.equals(hobby))
			{
				checkbox.get(j).click();
				break;
			}
			
		}
	}

	@When("^User set Country to \"([^\"]*)\"$")
	public void user_set_Country_to(String country) throws Throwable {
		new Select(driver.findElement(By.id("dropdown_7"))).selectByVisibleText(country);
	}

	@When("^User select Month to \"([^\"]*)\" ,Day to \"([^\"]*)\" and Year to \"([^\"]*)\"$")
	public void user_select_Month_to_Day_to_and_Year_to(String month, String day, String year) throws Throwable {
		new Select(driver.findElement(By.id("mm_date_8"))).selectByVisibleText(month);
		
		 new Select(driver.findElement(By.id("dd_date_8"))).selectByVisibleText(day);
		
		 new Select(driver.findElement(By.id("yy_date_8"))).selectByVisibleText(year);
	}

	@When("^User enters Phone as \"([^\"]*)\"$")
	public void user_enters_Phone_as(String phone) throws Throwable {
		driver.findElement(By.id("phone_9")).sendKeys(phone);
	}

	@When("^User enters Username as \"([^\"]*)\"$")
	public void user_enters_Username_as(String username) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@When("^User enters Email as \"([^\"]*)\"$")
	public void user_enters_Email_as(String email) throws Throwable {
		driver.findElement(By.id("email_1")).sendKeys(email);
	}

	@When("^User enters description about myself \"([^\"]*)\"$")
	public void user_enters_description_about_myself(String desc) throws Throwable {
		driver.findElement(By.id("description")).sendKeys(desc);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String pwd) throws Throwable {
		driver.findElement(By.id("password_2")).sendKeys(pwd);
	}

	@When("^User enters confirm password \"([^\"]*)\"$")
	public void user_enters_confirm_password(String confirmpwd) throws Throwable {
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(confirmpwd);
	}

	@Then("^The User should see the message \"([^\"]*)\"$")
	public void the_User_should_see_the_message(String arg1) throws Throwable {
		driver.findElement(By.name("pie_submit")).click();
	}


}
