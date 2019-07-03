package Cigna;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaHomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/a")
    WebElement Glossary;
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/div/button")
    WebElement SearchIcon;
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")
    WebElement Searchinput;

    public void setGlossary (){
        Glossary.click();
    }
    public void setSearchinput(String Medicaltools){
        Searchinput.sendKeys(Medicaltools, Keys.ENTER);
        SearchIcon.click();
        sleepFor(5);



    }


}
