package Test2;

import Page.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    HomePage homepage;

    @BeforeMethod
    void setupHomepage(){
        setup();
        driver.get("https://go.homesite.com/");
        homepage = PageFactory.initElements(driver,HomePage.class);

    }
    // Test case no 1: getting a quote for home insurence
    @Test
    void homePageTest(){
        homepage.clickHome();
        homepage.sendZipCode();
        homepage.clickOnQuote();
        homepage.sendAddress();
        homepage.clickGetQuote();
//        homepage.clickContinue();
//        String currenturl = driver.getCurrentUrl();
//        Assert.assertEquals(currenturl,"https://home2.homesite.com/2711/home/manual-address");


    }

}
