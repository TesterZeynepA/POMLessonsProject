package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonSearchPage {
    public AmazonSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']")
    public WebElement firstProduct;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
    public WebElement goToCart;
}
