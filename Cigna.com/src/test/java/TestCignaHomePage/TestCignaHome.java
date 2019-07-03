package TestCignaHomePage;

import Cigna.CignaHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCignaHome extends CommonAPI {
    CignaHomePage home;
    String url = "https://www.cigna.com/";

    @BeforeClass
    public void init (){
        home = PageFactory.initElements(driver,CignaHomePage.class);
        driver.get(url);
    }

    @AfterMethod
    public void getback(){
        driver.get(url);
    }

    @Test
    public void clickOnGlossary() {
        home.setGlossary();
        sleepFor(5);
    }
    @Test
    public void clickOnSetSearchInput(){
        home.setSearchinput("Medical tools");
        sleepFor(5);

    }






}
