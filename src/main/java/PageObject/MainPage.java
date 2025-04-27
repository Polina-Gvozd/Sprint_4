package PageObject;

import java1.EnvConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;

    private final By question1 = By.id("accordion__heading-0"); //кнопка первого вопроса
    private final By answer1 = By.id("accordion__panel-0"); //всплывающий ответ на первый вопрос
    private final By question2 = By.id("accordion__heading-1"); //кнопка второго вопроса
    private final By answer2 = By.id("accordion__panel-1"); //всплывающий ответ на второй вопрос
    private final By question3 = By.id("accordion__heading-2"); //кнопка третьего вопроса
    private final By answer3 = By.id("accordion__panel-2"); //всплывающий ответ на третий вопрос
    private final By question4 = By.id("accordion__heading-3"); //кнопка четвертого вопроса
    private final By answer4 = By.id("accordion__panel-3"); //всплывающий ответ на четвертый вопрос
    private final By question5 = By.id("accordion__heading-4"); //кнопка пятого вопроса
    private final By answer5 = By.id("accordion__panel-4"); //всплывающий ответ на пятый вопрос
    private final By question6 = By.id("accordion__heading-5"); //кнопка шестого вопроса
    private final By answer6 = By.id("accordion__panel-5"); //всплывающий ответ на шестой вопрос
    private final By question7 = By.id("accordion__heading-6"); //кнопка седьмого вопроса
    private final By answer7 = By.id("accordion__panel-6"); //всплывающий ответ на седьмой вопрос
    private final By question8 = By.id("accordion__heading-7"); //кнопка восьмого вопроса
    private final By answer8 = By.id("accordion__panel-7"); //всплывающий ответ на восьмой вопрос
    private final By orderButton1 = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']"); //кнопка "Заказать" вверху страницы
    private final By orderButton2 = By.className("Button_Middle__1CSJM"); //кнопка "Заказать" внизу страницы

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage() {
        driver.get(EnvConfig.BASE_URL);
    }
    public void scrollToQuestions(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.className("accordion")));
    }
    public void clickOnQuestion1(){
        driver.findElement(question1).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(answer1));
    }
    public String getTextFromAnswer1(){
       return driver.findElement(answer1).getText();
    }
    public void clickOnQuestion2(){
        driver.findElement(question2).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-1")));
    }
    public String getTextFromAnswer2(){
        return driver.findElement(answer2).getText();
    }
    public void clickOnQuestion3(){
        driver.findElement(question3).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-2")));
    }
    public String getTextFromAnswer3(){
        return driver.findElement(answer3).getText();
    }
    public void clickOnQuestion4(){
        driver.findElement(question4).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-3")));
    }
    public String getTextFromAnswer4(){
        return driver.findElement(answer4).getText();
    }
    public void clickOnQuestion5(){
        driver.findElement(question5).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-4")));
    }
    public String getTextFromAnswer5(){
        return driver.findElement(answer5).getText();
    }
    public void clickOnQuestion6(){
        driver.findElement(question6).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-5")));
    }
    public String getTextFromAnswer6(){
        return driver.findElement(answer6).getText();
    }
    public void clickOnQuestion7(){
        driver.findElement(question7).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-6")));
    }
    public String getTextFromAnswer7(){
        return driver.findElement(answer7).getText();
    }
    public void clickOnQuestion8(){
        driver.findElement(question8).click();
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-7")));
    }
    public String getTextFromAnswer8(){
        return driver.findElement(answer8).getText();
    }
    public void clickOrderButton1(){
        driver.findElement(orderButton1).click();
    }
    public void clickOrderButton2(){
        driver.findElement(orderButton2).click();
    }
    public void checkOrderButton(){
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.IMPLICITLY_WAIT)).until(ExpectedConditions.urlToBe(EnvConfig.ORDER_URL));
    }
    public void scrollToOrderButton2(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(orderButton2));
    }


}
