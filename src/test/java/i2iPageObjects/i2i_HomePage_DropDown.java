package i2iPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class i2i_HomePage_DropDown {

    final WebDriver driver;

    //My account icon
    @FindBy(how = How.XPATH, using = "//a[@class='nav-link dropdown-toggle']//img[@alt = 'myaccount.svg']")
    public WebElement icon_MyAccount;


    //Email text box
    //@FindBy(how = How.XPATH, using = "//div[@id = 'mobile-nav']//input[@id = 'email_mobile']")
    //public WebElement txtbx_MobileEmail;

    @FindBy(how = How.ID, using = "email_dpdown")
    public WebElement txtbx_MobileEmail;

    //Password text box
    @FindBy(how = How.ID, using = "password_dpdown")
    public WebElement txtbx_MobilePassword;

    //Login button
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-login-i2i']")
    public WebElement btn_MobileLogin;


// This is a constructor, as every page need a base driver to find web elements

    public i2i_HomePage_DropDown(WebDriver driver){

        this.driver = driver;

    }
}
