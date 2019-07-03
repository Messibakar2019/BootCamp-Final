package Amazon;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement SignInButton;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement Email;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement Pass;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement Signin;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement Search;




    public void setSignInButton(){
        SignInButton.click();
    }

    public void goToSignInPage(String username, String pass){
        Signin.click();
        Email.sendKeys(username);
        Pass.sendKeys(pass, Keys.ENTER);
        sleepFor(5);
    }

    public void goToSearch(String watches){
        Search.sendKeys(watches,Keys.ENTER);
    }

  
}
