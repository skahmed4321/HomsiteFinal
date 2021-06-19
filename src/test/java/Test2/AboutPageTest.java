package Test2;

import Page.AboutPage;
import Page.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutPageTest extends BaseTest{

    AboutPage about;
    HomePage home;

    @BeforeMethod
    void setupAboutPage() {
        setup();
        driver.get("https://go.homesite.com/");
        about = PageFactory.initElements(driver,AboutPage.class);
        home = PageFactory.initElements(driver,HomePage.class);
        windowMaximize();

    }

    @Test
    public void aboutPageTest(){
        about.clickHome();
        about.sendZipcode();
        impliciteWait(5);
        about.clickOnQuote();
        impliciteWait(5);
        about.sendAddress();
        impliciteWait(5);
        about.clickGetQuote();
        impliciteWait(5);
        about.clickContinue();
        impliciteWait(5);
        about.sendFirstname();
        impliciteWait(5);
        about.sendLastname();
        impliciteWait(5);
        about.sendEmail();
        impliciteWait(5);
        about.sendDateOfBirth();
        impliciteWait(5);
        about.clickccontinue();

//        String currenturl = driver.getCurrentUrl();
//        Assert.assertEquals(currenturl,"https://home2.homesite.com/2711/home/about");




    }
}
