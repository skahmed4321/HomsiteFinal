package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicPage {

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
    @FindBy(xpath = "//button[@id='newHome']")
    WebElement NewHome;
    @FindBy(xpath = "//button[@id='burglarAlarm']/span[1]")
    WebElement BurglarAlarm;
    @FindBy(xpath = "//button[@id='fireAlarm']/span[1]")
    WebElement FireAlarm;
    @FindBy(xpath = "//button[@id='indoorSprinklerSystem']/span[1]")
    WebElement IndoorSprink;
    @FindBy(xpath = "//div[@id='root']/main/div/div/div/div[2]/div/div/div/div[3]/button")
    WebElement Applydiscount;
    @FindBy(xpath = "//div[@id='propertyTypeLabel']/div[2]/div/ul/li[1]/label/div/div")
    WebElement singleFamiley;
    @FindBy(xpath = "//input[@id='yearBuilt']")
    WebElement constructionYear;
    @FindBy(xpath = "//input[@id='squareFootage']")
    WebElement livingArea;
    @FindBy(xpath = "//div[@id='root']/main/div/div/div/form/div[4]/div/button")
    WebElement next;
    @FindBy(xpath = "//div[@id='dwellingStyleQuestionLabel']/div[2]/div[4]/div/button/img")
    WebElement capeCod;
    @FindBy(xpath = "//div[@id='root']/main/div/div/div/form/div[2]/div/button")
    WebElement nextt;
    @FindBy(xpath = "//select[@id='numberOfStories']")
    WebElement stories;

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
        lastName.sendKeys("Khan ");
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

    public void clickNewHome(){
        NewHome.click();
    }
    public void clickburglarAlarm(){
        BurglarAlarm.click();
    }
    public void clickfireAlarm(){
        FireAlarm.click();
    }
    public void clickindoorSprink(){
        IndoorSprink.click();
    }

    public void clickapplydiscount(){
        Applydiscount.click();
    }

    public void clicksingleFamiley(){
        singleFamiley.click();
    }
    public void sendconstructionYear(){
        constructionYear.sendKeys("1920");
    }
    public void sendlivingArea(){
        livingArea.sendKeys("3000");
    }
    public void clickNext(){
        next.click();
    }
    public void clickcapeCod(){
        capeCod.click();
    }
    public void clickNextt(){
        nextt.click();
    }
    public void selectStories(){
        stories.click();
    }

}
