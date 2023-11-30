package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1:User is on login page");
		//To setup Chrome browser automatically
		WebDriverManager.chromedriver().setup();
		//To launch the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		
	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step2:User enters username and password");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Step3:User clicks on submit button");
		driver.findElement(By.name("Submit")).click();
	   
	}

	@Then("user should land on homepage")
	public void user_should_land_on_homepage() {
		System.out.println("Step4:User lands on homepage");
		driver.close();
	    
	}

}
