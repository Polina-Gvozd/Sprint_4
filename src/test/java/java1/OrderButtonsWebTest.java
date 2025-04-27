package java1;

import PageObject.MainPage;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OrderButtonsWebTest {
    @Rule
    public DriverRule driverRule = new DriverRule();

    @Test
    public void checkOrderButton1 () {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.clickOrderButton1();

        mainPage.checkOrderButton();
    }
    @Test
    public void checkOrderButton2 () {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToOrderButton2();

        mainPage.clickOrderButton2();

        mainPage.checkOrderButton();
    }
}
