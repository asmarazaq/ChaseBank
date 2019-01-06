package home;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

    @FindBy(id = "MasterPageHeaderContent_CClampATMBranch")
    public static WebElement atmAndBranch;

    public void checkAtmAndBranch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atmAndBranch.click();
    }
}
