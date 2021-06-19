package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    void impliciteWait(long wait){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    void windowMaximize(){
        driver.manage().window().maximize();
    }

    void deleteCookies(){
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();

    }
}
