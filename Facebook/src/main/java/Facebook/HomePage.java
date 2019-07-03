package Facebook;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {

    @FindBy (name = "firstname")
    WebElement Firstname;
    @FindBy (name = "lastname")
    WebElement Lastname;
    @FindBy (name = "reg_email__")
    WebElement Email;
    @FindBy (name = "reg_passwd__")
    WebElement Pass;
    @FindBy (name = "sex")
    WebElement Gender;
    @FindBy (xpath = "//*[@id=\"month\"]")
    WebElement MonthButton;
    @FindBy (xpath = "//*[@id=\"day\"]")
    WebElement DayButton;
    @FindBy (xpath = "//*[@id=\"year\"]")
    WebElement YearButtton;
    @FindBy (name = "websubmit")
    WebElement Sinnup;


    public void setSingup(String firstname, String lastname, String email, String sex, String pass ) {
        Firstname.sendKeys(firstname);
        Lastname.sendKeys(lastname);
        Email.sendKeys(email);
        Pass.sendKeys(pass);
        Select sell = new Select(MonthButton);
        sell.selectByIndex(5);
        Select sell2 = new Select(DayButton);
        sell.selectByIndex(1);
        Select sell3 = new Select(YearButtton);
        sell.selectByIndex(6);
        Gender.click();
        Sinnup.click();
        sleepFor(5);

    }



    }



