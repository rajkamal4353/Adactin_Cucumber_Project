package com.StepD;

import org.openqa.selenium.WebDriver;
import com.Base_Class_Adactin.Base_Class;
import com.Runner_Adactin.Test_Runner;
import com.Sdp.Page_Object_Manager;
import com.configuration.helper.File_Reader_Manager_Adactin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	
	public static WebDriver driver = Test_Runner.driver;
	
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getUrl();
		geturl(url);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		
		inputelement(pom.getInstanceUlp().getUsername(),username);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		
		inputelement(pom.getInstanceUlp().getPassword(),password);
	    
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    
		click(pom.getInstanceUlp().getLogin_Btn());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		
		drop_down(pom.getInstanceShp().getLocation(),"ByVisibleText", "Brisbane");
	    
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		
		drop_down(pom.getInstanceShp().getHotels(),"ByIndex", "3");
	    
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		
		drop_down(pom.getInstanceShp().getRoom_Type(),"ByIndex","3");
	    
	}

	@When("^user Select Number Of Room Required$")
	public void user_Select_Number_Of_Room_Required() throws Throwable {
		
		drop_down(pom.getInstanceShp().getRoom_Nos(),"ByIndex", "8");
	    
	}

	@When("^user Select Checkin Date$")
	public void user_Select_Checkin_Date() throws Throwable {
		
		inputelement(pom.getInstanceShp().getCheck_In(),"17/10/2021");
	    
	}

	@When("^user Select Checkout Date$")
	public void user_Select_Checkout_Date() throws Throwable {
		
		inputelement(pom.getInstanceShp().getCheck_Out(),"18/10/2021");
	    
	}

	@When("^user Select Number Of Adults Per Room$")
	public void user_Select_Number_Of_Adults_Per_Room() throws Throwable {
		
		drop_down(pom.getInstanceShp().getAdult_Room(),"ByIndex", "3");
	    
	}

	@When("^user Select Number Of Child Per Room$")
	public void user_Select_Number_Of_Child_Per_Room() throws Throwable {
		
		drop_down(pom.getInstanceShp().getChild_Room(),"ByIndex", "3");
	    
	}

	@Then("^user Click On Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	    
		click(pom.getInstanceShp().getSubmit());
		
	}

	@When("^user Click On The Select Hotel Button$")
	public void user_Click_On_The_Select_Hotel_Button() throws Throwable {
		
		click(pom.getInstanceSlhp().getRadio());

	}

	@Then("^user Click On Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	   
		click(pom.getInstanceSlhp().getContinue());
		
	}

	@When("^user Enter The Firstname$")
	public void user_Enter_The_Firstname() throws Throwable {
		
		inputelement(pom.getInstanceBhp().getFirst_Name(),"Rajkamal");
	    
	}

	@When("^user Enter The Lastname$")
	public void user_Enter_The_Lastname() throws Throwable {
		
		inputelement(pom.getInstanceBhp().getLast_Name(),"Muniappan");
	    
	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
		
		inputelement(pom.getInstanceBhp().getAddress(),"6/88R,Batman road,Gotham City,Brisbane");
	    
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		
		String CreditCardNo = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getCreditCardNo();
		inputelement(pom.getInstanceBhp().getCC_Num(),CreditCardNo);
	    
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		
		drop_down(pom.getInstanceBhp().getCC_Type(),"ByIndex", "3");
	    
	}

	@When("^user Select Credit Card Expiry Month$")
	public void user_Select_Credit_Card_Expiry_Month() throws Throwable {
		
		drop_down(pom.getInstanceBhp().getCC_Expm(),"ByIndex", "8");
	    
	}

	@When("^user Select Credit Card Expiry Year$")
	public void user_Select_Credit_Card_Expiry_Year() throws Throwable {
		
		drop_down(pom.getInstanceBhp().getCC_Expy(),"ByIndex", "12");
	    
	}

	@When("^user Enter Cvv Number$")
	public void user_Enter_Cvv_Number() throws Throwable {
		
		String Cvv = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getCvv();
		inputelement(pom.getInstanceBhp().getCC_Cvv(),Cvv);
	    
	}

	@Then("^user Click on Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_on_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	   
		click(pom.getInstanceBhp().getBook_Now());
	}

	@Then("^user Click On My Itinerary Button And It Naviagtes To Booked Itinerary Page$")
	public void user_Click_On_My_Itinerary_Button_And_It_Naviagtes_To_Booked_Itinerary_Page() throws Throwable {
	    
		imwait(10);
		click(pom.getInstanceBcp().getMy_Itinerary());
		
	}

	@Then("^user Click On Logout Button And It Navigates To Login Again Page$")
	public void user_Click_On_Logout_Button_And_It_Navigates_To_Login_Again_Page() throws Throwable {
	    
        screenshot("6.png");
		imwait(5);
		click(pom.getInstanceLgt().getLogout());
		
	}

	@Then("^user Click On Login Again Button And It Naviagtes To Login Page$")
	public void user_Click_On_Login_Again_Button_And_It_Naviagtes_To_Login_Page() throws Throwable {
	    
		click(pom.getInstanceLgag().getLogin_Again());
	}

}
