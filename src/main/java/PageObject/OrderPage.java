package PageObject;

import java1.EnvConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private final WebDriver driver;

    public By nameField = By.cssSelector(".Input_Input__1iN_Z[placeholder='* Имя']");//поле ввода имени
    public By lastNameField = By.cssSelector(".Input_Input__1iN_Z[placeholder='* Фамилия']");// поле ввода фамилии
    public By addressField = By.cssSelector(".Input_Input__1iN_Z[placeholder='* Адрес: куда привезти заказ']");// поле ввода адреса
    public By phoneField = By.cssSelector(".Input_Input__1iN_Z[placeholder='* Телефон: на него позвонит курьер']");//поле ввода телефона
    public By dataField = By.cssSelector(".Input_Input__1iN_Z[placeholder='* Когда привезти самокат']");//поле ввода даты
    public By commentField = By.cssSelector(".Input_Input__1iN_Z[placeholder='Комментарий для курьера']");//поле ввода комментария

    private final By cookieButton = By.className("App_CookieButton__3cvqF");//кнопка принятия куки
    private final By metroField = By.className("select-search__input");//поле станции метро
    private final By metroStation = By.cssSelector(".select-search__row[data-value='1']");//всплывающий список станций
    private final By nextButton = By.className("Button_Middle__1CSJM");//кнопка Далее
    private final By dataChoose = By.className("react-datepicker__day--020");//выбор даты во всплывающем окне
    private final By daysField = By.className("Dropdown-placeholder");//поле количества дней
    private final By chooseQuantity = By.cssSelector("div.Dropdown-option:nth-child(1)");//всплывающий список количества дней
    private final By blackColor = By.id("black");//выбор цвета самоката
    private final By orderButton = By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)");//кнопка Заказать
    private final By yesButton = By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)");//кнопка Да для подтверждения заказа
    private final By orderWindow = By.xpath("//div[text()='Заказ оформлен']");//окно подтверждения заказа

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCookieButton() {
        driver.findElement(cookieButton).click();
    }
    public void chooseStation() {
        driver.findElement(metroField).click();
        driver.findElement(metroStation).click();
    }
    public void clickOnNext() {
        driver.findElement(nextButton).click();
    }
    public void chooseTheData() {
        driver.findElement(dataChoose).click();
    }
    public void chooseDaysQuantity() {
        driver.findElement(daysField).click();
        driver.findElement(chooseQuantity).click();
    }
    public void chooseScooterColor() {
        driver.findElement(blackColor).click();
    }
    public void clickOnOrderButton() {
        driver.findElement(orderButton).click();
    }
    public void clickOnYes() {
        driver.findElement(yesButton).click();
    }
    public void checkOrder() {
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(orderWindow));
    }
}
