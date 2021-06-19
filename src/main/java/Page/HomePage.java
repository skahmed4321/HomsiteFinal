package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//form[@id='columnarForm']/div/div[1]/div/label")
    WebElement home;
    @FindBy(xpath = "//input[@id='zip']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@id='submitGo']")
    WebElement quote;
    @FindBy(xpath = "//div[@id='root']/main/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/input")
    WebElement address;
    @FindBy(xpath = "//div[@id='root']/main/div/div[1]/div/div/div/div[2]/div/div/div[2]/button/span[1]")
    WebElement getquoteforhome;
//    @FindBy(xpath = "//div[@id='root']/main/div/div[2]/form/div/div/div[2]/div/div/div/div[5]/button")
//    WebElement Continue;

    public void clickHome(){
        home.click();
    }
    public void sendZipCode(){
        zipcode.sendKeys("02122");
    }
    public void clickOnQuote(){
        quote.click();
    }
    public void sendAddress(){
        address.sendKeys("239 Bowdoin st, Dorchester, MA 02122");
    }
    public void clickGetQuote(){
        getquoteforhome.click();
    }
//    public void clickContinue(){
//        Continue.click();
//    }


}
