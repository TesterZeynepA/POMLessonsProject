package pages.amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage {
    public AmazonHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement signIn;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement reklam;

    public void login(){
        signIn.click();
        reklam.click();
        signIn.click();
        emailBox.sendKeys("zeyneppaytop@gmail.com" + Keys.ENTER);
        passwordBox.sendKeys("İz1212" + Keys.ENTER);
    }
}
