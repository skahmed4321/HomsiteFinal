package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

public class AboutPage {
    @FindBy(xpath = "//form[@id='columnarForm']/div/div[1]/div/label")
    WebElement home;
    @FindBy(xpath = "//input[@id='zip']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@id='submitGo']")
    WebElement quote;
    @FindBy(xpath = "//div[@id='root']/main/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/input")
    WebElement address;
    @FindBy(xpath = "//div[@id='root']/main/div/div[1]/div/div/div/div[2]/div/div/div[2]/button/span[1]")
    WebElement getQuote;
    @FindBy(xpath = "//div[@id='root']/main/div/div[2]/form/div/div/div[2]/div/div/div/div[5]/button/span[1]")
    WebElement Continue;
    @FindBy(xpath = "//*[@id='firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastName;
    @FindBy(xpath = "//*[@id='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@id='dateOfBirth']")
    WebElement DateOfBirth;
    @FindBy(xpath = "//div[@id='root']/main/div/form/div/div/div[2]/div/div/div/div[5]/button/span[1]")
    WebElement ccontinue;

    public void clickHome(){
        home.click();
    }
    public void sendZipcode(){
        zipcode.sendKeys("02122");
    }
    public void clickOnQuote(){
        quote.click();
    }
    public void sendAddress(){
        address.sendKeys("239 Bowdoin St Dorchester, MA");
    }
    public void clickGetQuote(){
        getQuote.click();
    }
    public void clickContinue(){
        Continue.click();
    }
    public void sendFirstname(){
        firstName.sendKeys("Md");
    }
    public void sendLastname(){
        lastName.sendKeys("Khan");
    }
    public void sendEmail(){
        Email.sendKeys("khan12@gmail.com");
    }
    public void sendDateOfBirth(){
        DateOfBirth.sendKeys("02/02/1990");
    }
    public void clickccontinue(){
        ccontinue.click();
    }


}
