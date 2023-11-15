package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCartPage {
    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    public WebElement quantity;
}
