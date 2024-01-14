package finxPages.home;

import finxCommon.FinXBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends FinXBase {

    /**
     * ==============================================================================================================
     * Constructor
     */
    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    /**
     * ==============================================================================================================
     * Common
     */
    public boolean isDisplay() {
        return true;
    }
}
