import com.thoughtworks.gauge.Step;
import i2iPageObjects.i2i_HomePage_DropDown;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class i2i_Login_DropDown {


    @Step("Login to i2i Application using menu.")
    public void logini2iApplicationusingmenu() {


        i2i_HomePage_DropDown HomePage_DropDown = PageFactory.initElements(Driver.driver, i2i_HomePage_DropDown.class);

        //Click Drop down icon
        HomePage_DropDown.icon_MyAccount.click();

        Driver.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        System.out.println("Email text box displayed = " +HomePage_DropDown.txtbx_MobileEmail.isDisplayed());

        //Enter email address
        HomePage_DropDown.txtbx_MobileEmail.sendKeys("virendra.rawat@saiglobal.com");

        //Enter password
        HomePage_DropDown.txtbx_MobilePassword.sendKeys("abcd_1234");

        //Click Login Button
        HomePage_DropDown.btn_MobileLogin.click();

    }

}
