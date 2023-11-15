package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchPage {
    @FindBy(xpath = "(//div[@class='puisg-row'])[1]")
    public WebElement firstProduct;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
    public WebElement goToCart;
}
