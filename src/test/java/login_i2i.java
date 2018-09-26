import com.thoughtworks.gauge.Step;
import i2iPageObjects.i2i_HomePage;
import org.openqa.selenium.support.PageFactory;

public class login_i2i {


    @Step("Login to i2i Application.")
    public void logini2iApplication() {


        i2i_HomePage HomePage = PageFactory.initElements(Driver.driver, i2i_HomePage.class);


        //Enter email address
        HomePage.txtbx_Email.sendKeys("virendra.rawat@saiglobal.com");

        //Enter password
        HomePage.txtbx_Password.sendKeys("abcd_1234");

        //Click Login Button
        HomePage.btn_Login.click();


    }
}
