package CitiBank;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiBankHomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"creditcards\"]")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id=\"personetics-citi-menu\"]")
    WebElement SearchIcon;
    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content-searchbox-livesearch\"]")
    WebElement SearchInput;
    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]")
    WebElement SearchButton;






    public void setCreditCards (){
        creditCards.click();
    }

    public void setSearchInput(String CreditCards){
        SearchIcon.click();
        SearchInput.sendKeys(CreditCards, Keys.ENTER);
        sleepFor(5);
        SearchButton.click();
        sleepFor(5);
    }
    
}
