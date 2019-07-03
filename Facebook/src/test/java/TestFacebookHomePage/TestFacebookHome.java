package TestFacebookHomePage;

import Facebook.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFacebookHome extends CommonAPI {
    HomePage home;
    String url = "https://www.facebook.com/";

    @BeforeClass
    public void intt(){
        home = PageFactory.initElements(driver,HomePage.class);
        driver.get(url);
    }

    @AfterMethod
    public void getback() { driver.get(url);}

    @Test
    public void clickOnSignUp(){
        home.setSingup("abu","bakar","abu@gamil","m","abu123");
    }


}
