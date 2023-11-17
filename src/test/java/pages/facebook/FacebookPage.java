package pages.facebook;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='pass']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMessage;

    public void setLogin(){
        Faker faker = new Faker();
        email.sendKeys(faker.internet().emailAddress());

        password.sendKeys(faker.internet().password());

        login.click();

    }
}
