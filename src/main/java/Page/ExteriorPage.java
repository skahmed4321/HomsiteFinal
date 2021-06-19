package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExteriorPage {

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
    //1234
    WebElement lastName;
    @FindBy(xpath = "//*[@id='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@id='dateOfBirth']")
    WebElement DateOfBirth;
    @FindBy(xpath = "//div[@id='root']/main/div/form/div/div/div[2]/div/div/div/div[5]/button/span[1]")
    WebElement ccontinue;
    @FindBy(xpath = "//button[@id='newHome']")
    WebElement NewHome;
    @FindBy(xpath = "//div[@id='root']/main/div/div/div/div[2]/div/div/div/div[3]/button/span[1]")
    WebElement discount;
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
    @FindBy(xpath = "//div[@id='root']/main/div/div/div/div/form/div[2]/div/button")
    WebElement nextExterior;
    @FindBy(xpath = "//div[@id='propertySlopeQuestionLabel']/div[1]/div[1]")
    WebElement propertySloopText;
    @FindBy(xpath = "//div[@id='propertySlopeQuestionLabel']/div[2]/div[1]/div/div[2]/label/div/div")
    WebElement clickYes;
    @FindBy(xpath = "//div[@id='garage.typeAndSizeLabel']/div[1]/div/div")
    WebElement selectGarageText;

    public void clickBasicPage(){
        NewHome.click();
    }

    public void clickdiscount(){
        discount.click();
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
        stories.isSelected();
    }
    public void clickNextExterior(){
        nextExterior.click();
    }
    public void selectpropertySloop(){
        propertySloopText.isSelected();
    }
    public void clickYes(){
        clickYes.click();
    }
    public void selectGarage(){
        selectGarageText.isSelected();
    }

}
