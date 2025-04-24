package java1;

import PageObject.MainPage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FAQWebTest {

    @Rule
    public DriverRule driverRule = new DriverRule();

    @Test
    public void checkAnswer1() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion1();

        //проверяем текст ответа
        String actualAnswer1 = mainPage.getTextFromAnswer1();
        Assert.assertEquals(EnvConfig.ANSWER1, actualAnswer1);
    }
    @Test
    public void checkAnswer2() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion2();

        //проверяем текст ответа
        String actualAnswer2 = mainPage.getTextFromAnswer2();
        Assert.assertEquals(EnvConfig.ANSWER2, actualAnswer2);
    }
    @Test
    public void checkAnswer3() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion3();

        //проверяем текст ответа
        String actualAnswer3 = mainPage.getTextFromAnswer3();
        Assert.assertEquals(EnvConfig.ANSWER3, actualAnswer3);
    }
    @Test
    public void checkAnswer4() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion4();

        //проверяем текст ответа
        String actualAnswer4 = mainPage.getTextFromAnswer4();
        Assert.assertEquals(EnvConfig.ANSWER4, actualAnswer4);
    }
    @Test
    public void checkAnswer5() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion5();

        //проверяем текст ответа
        String actualAnswer5 = mainPage.getTextFromAnswer5();
        Assert.assertEquals(EnvConfig.ANSWER5, actualAnswer5);
    }
    @Test
    public void checkAnswer6() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion6();

        //проверяем текст ответа
        String actualAnswer6 = mainPage.getTextFromAnswer6();
        Assert.assertEquals(EnvConfig.ANSWER6, actualAnswer6);
    }
    @Test
    public void checkAnswer7() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion7();

        //проверяем текст ответа
        String actualAnswer7 = mainPage.getTextFromAnswer7();
        Assert.assertEquals(EnvConfig.ANSWER7, actualAnswer7);
    }
    @Test
    public void checkAnswer8() {
        WebDriver driver = driverRule.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.scrollToQuestions();

        mainPage.clickOnQuestion8();

        //проверяем текст ответа
        String actualAnswer8 = mainPage.getTextFromAnswer8();
        Assert.assertEquals(EnvConfig.ANSWER8, actualAnswer8);
    }
}
