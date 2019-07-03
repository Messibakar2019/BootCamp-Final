package CNN;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNNHomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[7]")
    WebElement entertainment;
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[3]")
    WebElement Politics;
    @FindBy(xpath = "//*[@id=\"menu\"]")
    WebElement Navigation;
    @FindBy(xpath = "//*[@id=\"search-input-field\"]")
    WebElement SearchBar;
    @FindBy(xpath = "//*[@id=\"search-button\"]")
    WebElement SearchIcon;


    public void setEntertainment(){
        entertainment.click();
    }
    public void setPolitics(){
        Politics.click();
    }
    public void setNavigation(String sreachSomething){
        Navigation.click();
        SearchBar.sendKeys(sreachSomething, Keys.ENTER);
        SearchIcon.click();
    }

}
