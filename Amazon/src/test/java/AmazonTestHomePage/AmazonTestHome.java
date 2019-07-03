package AmazonTestHomePage;

import Amazon.AmazonHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTestHome extends CommonAPI {
    AmazonHomePage home;
    String url = "https://www.amazon.com/";

    @BeforeClass
    public void init(){
        home = PageFactory.initElements(driver,AmazonHomePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void getback(){
        driver.get(url);
    }
   //Test
    public void clickOnSignInButton(){
        home.setSignInButton();
        sleepFor(5);
    }
    //Test
    public void SignInTest(){
        home.goToSignInPage("abu@gmail","abu123");
    }

    @Test
    public void clickOnSearch(){
        home.goToSearch("Carriere By Gendarme For Women. Eau De Parfum Spray 4 Ounces");
        sleepFor(5);
    }
}
