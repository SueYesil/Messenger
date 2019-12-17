package framework.webpages;

import org.openqa.selenium.By;

public class FacebookDataEntry extends ElementUtil{
    //Methods
             By firstName=By.name("firstname");
             By lastname=By.name("lastname");
             By signup=By.xpath("//button[starts-with(@id, 'u_0_13')]");
             By email1=By.xpath("//input[starts-with(@id, 'u_0_r')]");
             By invalidEmailMessage=By.xpath("div[class*='5633']");




    public void EnterFirstname(String FirstName){
        setValue(firstName,FirstName);
    }
    public void EnterLastname(String password){
        setValue(lastname,password);

    }
    public void EnterEmail(String email){
        setValue(email1,email);
    }
    public void ClickOnsignUp(){
        clickOn(signup);
    }
    public void GetText(){
        getTextFromElement(invalidEmailMessage);
    }
}
