package calculator;

import core.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class AditionPage {

    private WebDriver driver;

    private static final String URL = "https://www.calculadora.org/";

    private static final By TWO_BUTTON_BY = By.cssSelector("span:nth-child(10)");
    private static final By ADDITION_OPERATOR_BY = By.cssSelector(".operator:nth-child(4)");
    private static final By ONE_BUTTON_BY = By.cssSelector("span:nth-child(9)");
    private static final By EQUAL_BUTTON_BY = By.cssSelector(".eval");
    private static final By SCREEN_BY = By.cssSelector(".screen");

    public AditionPage() {
        driver = WebDriverManager.getInstance().getWebDriver();
    }

    private String getResult() {
        return driver.findElement(SCREEN_BY).getText();
    }

    public String addTwoNumbers() {
        // Test name: addition
        // Step # | name | target | value | comment
        // 1 | open | / |  |
        driver.get(URL);
        // 2 | setWindowSize | 1050x740 |  |
        driver.manage().window().setSize(new Dimension(1050, 740));
        // 3 | click | css=span:nth-child(10) |  |
        driver.findElement(TWO_BUTTON_BY).click();
        // 4 | click | css=.operator:nth-child(4) |  |
        driver.findElement(ADDITION_OPERATOR_BY).click();
        // 5 | click | css=span:nth-child(9) |  |
        driver.findElement(ONE_BUTTON_BY).click();
        // 6 | click | css=.eval |  |
        driver.findElement(EQUAL_BUTTON_BY).click();
        // 7 | click | css=.screen |  |
        //driver.findElement(By.cssSelector(".screen")).click();
        // 8 | close |  |  |
        driver.quit();
        String result = getResult();
        return result ;
    }
}
