package TestCNNHomePage;

import CNN.CNNHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCNNHome extends CommonAPI {
    CNNHomePage home;
    String url = "https://www.cnn.com/";

    @BeforeClass
    public void init(){
        home = PageFactory.initElements(driver,CNNHomePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void getback (){
        driver.get(url);
    }

    @Test
    public void clickOnEntertainment (){
        home.setEntertainment();
        sleepFor(5);
    }
    @Test
    public void clickOnPolitics(){
        home.setPolitics();
        sleepFor(5);
     }

    @Test
    public void clickOnSearchBar(){
        home.setNavigation("Sports news");
        sleepFor(5);
    }

}
