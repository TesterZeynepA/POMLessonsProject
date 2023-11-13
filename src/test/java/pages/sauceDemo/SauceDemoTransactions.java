package pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SauceDemoTransactions {

    public SauceDemoTransactions() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = "select")
    public WebElement dropDown;

    @FindBy(xpath = "//span[contains(text(),'Price (low to high)')]")
    public WebElement dropDownText;

    @FindBy(className = "inventory_item_price")
    public List<WebElement> products;

}
