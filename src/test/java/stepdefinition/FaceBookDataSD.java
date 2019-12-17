package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.FacebookDataEntry;
import org.testng.Assert;

public class FaceBookDataSD {

    FacebookDataEntry facebookDataEntry=new FacebookDataEntry();

    @Given("^I am on facebook home page$")
    public void IamonFacebookPage(){
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(),"https://www.facebook.com/");
    }
    @When("^I enter (.+) into (firstname|lastname) text fields on home page screen$")
    public void enterDataIntoTextField(String value,String textField) throws InterruptedException {
        switch (textField) {
            case "firstname":
                facebookDataEntry.EnterFirstname(value);
                break;
            case "lastname":
                facebookDataEntry.EnterLastname(value);
          Thread.sleep(3000);

        }
    }

    @And("^I enter (.+) into (Mobilenumber) text fields on home screen$")
    public void enterEmailONTextfield(String anyText,String textField){
        switch (textField) {
            case "email":
                facebookDataEntry.EnterEmail(anyText);


        }

        }
        @And("^I click on signup button on home page screen$")
     public void ClickSignUp(){
        facebookDataEntry.ClickOnsignUp();
        }

        @Then("^I verify Error message for invalid email on homepage$")
    public void verifyErrorMessage(){
         facebookDataEntry.GetText();
        }
}
