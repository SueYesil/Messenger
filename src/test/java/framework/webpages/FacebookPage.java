package framework.webpages;

import org.openqa.selenium.By;

public class FacebookPage extends ElementUtil {

// Variables
    //Locators
    //Constructor
    //Methods
By firstName=By.name("firstname");
By lastname=By.name("lastname");
By signup=By.xpath("//button[@id='u_0_13']");



public void EnterFirstname(String FirstName){
    setValue(firstName,FirstName);
}
public void EnterLastname(String password){
    setValue(lastname,password);

}
public void IssignupButtonEnable(){
   boolean displayed= isElementDisplayed(signup);
    System.out.println("Login button is displayed:  "+displayed);
   boolean enable= isElementEnabled(signup);
    System.out.println("Login button is  :"+enable);
}

}
