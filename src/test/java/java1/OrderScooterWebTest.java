package java1;

import PageObject.MainPage;
import PageObject.OrderPage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class OrderScooterWebTest {

    private final String name;
    private final String lastname;
    private final String address;
    private final String phone;
    private final String data;
    private final String comment;

    public OrderScooterWebTest(String name, String lastname, String address, String phone, String data, String comment) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.data = data;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Готье", "Хитклиф", "Октавия", "+79998887766", "20.05.2025", "Отмените следующий заказ"},
                {"Скэриэл", "Лоу", "Запретные земли", "+75554443322", "20.05.2025", "Отмените предыдущий заказ"},
        };
    }
    @Rule
    public DriverRule driverRule = new DriverRule();
    @Test
    public void orderScooter() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);
        var orderPage = new OrderPage(driver);

        mainPage.openMainPage();
        mainPage.clickOrderButton1();
        orderPage.clickOnCookieButton();
        driver.findElement(By.cssSelector(".Input_Input__1iN_Z[placeholder='* Имя']")).sendKeys(name);
        driver.findElement(By.cssSelector(".Input_Input__1iN_Z[placeholder='* Фамилия']")).sendKeys(lastname);
        driver.findElement(By.cssSelector(".Input_Input__1iN_Z[placeholder='* Адрес: куда привезти заказ']")).sendKeys(address);
        orderPage.chooseStation();
        driver.findElement(By.cssSelector(".Input_Input__1iN_Z[placeholder='* Телефон: на него позвонит курьер']")).sendKeys(phone);
        orderPage.clickOnNext();
        driver.findElement(By.cssSelector(".Input_Input__1iN_Z[placeholder='* Когда привезти самокат']")).sendKeys(data);
        orderPage.chooseTheData();
        orderPage.chooseDaysQuantity();
        orderPage.chooseScooterColor();
        driver.findElement(By.cssSelector(".Input_Input__1iN_Z[placeholder='Комментарий для курьера']")).sendKeys(comment);
        orderPage.clickOnOrderButton();
        orderPage.clickOnYes();
        orderPage.checkOrder();
    }
}
