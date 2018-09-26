package i2iPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class i2i_HomePage {

    final WebDriver driver;

    //Email text box
    @FindBy(how = How.ID, using = "email")
    public WebElement txtbx_Email;

    //Password text box
    @FindBy(how = How.ID, using = "password")
    public WebElement txtbx_Password;

    //Login button
    @FindBy(how = How.ID, using = "dsktp_signin")
    public WebElement btn_Login ;

// This is a constructor, as every page need a base driver to find web elements

    public i2i_HomePage(WebDriver driver){

        this.driver = driver;

    }

}
