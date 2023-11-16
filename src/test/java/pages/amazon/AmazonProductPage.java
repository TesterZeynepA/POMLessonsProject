package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonProductPage {
    public AmazonProductPage() { PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//a[contains(text(),'Go to Cart')])[2]")
    public WebElement goToCartButton;

    public void productAddToCart(){
       addToCartButton.click();
    }

    public void goToCart(){
        goToCartButton.click();
    }

}
