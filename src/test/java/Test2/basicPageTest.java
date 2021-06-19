package Test2;

import Page.AboutPage;
import Page.BasicPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basicPageTest extends BaseTest{

    BasicPage basic;
    AboutPage about;

    @BeforeMethod
    void setupAboutPage() {
        setup();
        driver.get("https://go.homesite.com/");
        basic = PageFactory.initElements(driver, BasicPage.class);
        about = PageFactory.initElements(driver,AboutPage.class);
        windowMaximize();
    }

    @Test
    public void basicPageTest(){
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
        basic.clickNewHome();
        impliciteWait(5);
        basic.clickburglarAlarm();
        impliciteWait(5);
        basic.clickfireAlarm();
        impliciteWait(5);
        basic.clickindoorSprink();
        impliciteWait(5);
        basic.clickapplydiscount();
        impliciteWait(5);
        basic.clicksingleFamiley();
        impliciteWait(5);
        basic.sendconstructionYear();
        impliciteWait(5);
        basic.sendlivingArea();
        impliciteWait(5);
        basic.clickNext();
        impliciteWait(5);
        basic.clickcapeCod();
        impliciteWait(5);
        basic.clickNextt();
        impliciteWait(5);
        basic.selectStories();
    }
}
