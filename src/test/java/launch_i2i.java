import com.thoughtworks.gauge.Step;

public class launch_i2i {


    @Step("Launch i2i Application.")
     public void launchi2iApplication() {
        Driver.driver.manage().window().maximize();
        //Driver.driver.get("https://test2-us.i2.saiglobal.com/management/");
        //System.out.println("Browser Launched");

        String URL = "https://" +"customer:" +"petunia@" +"test2-us.i2.saiglobal.com/management/";

        System.out.println("New URL is = " +URL);
        Driver.driver.get(URL);

    }

}