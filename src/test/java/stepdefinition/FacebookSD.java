package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.FacebookPage;
import org.testng.Assert;

public class FacebookSD {
    FacebookPage facebookPage=new FacebookPage();


    @Given("^I am on facebook home  page$")
    public void IamonFacebookPage(){
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(),"https://www.facebook.com/");
    }
    @When("^I enter (.+) into (firstname|lastname) text fields on home screen$")
    public void enterDataIntoTextField(String value,String textField){
        switch(textField){
            case"firstname":
                facebookPage.EnterFirstname(value);
                break;
            case"lastname":
                facebookPage.EnterLastname(value);


        }
    }
    @Then("^I verify that signup button is disable or not$")
    public void VerifyThatSignUpDisableOrnot(){
     facebookPage.IssignupButtonEnable();


    }
}
