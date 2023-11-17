package pages.amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class AmazonCartPage {
    public AmazonCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//div[@class='sc-badge-price']")
    public WebElement price;


    @FindBy(xpath = "(//span[contains(text(),'$489.93')])[1]")
    public WebElement SubTotal;

    public void setQuantity(String number) {
      Select select=new Select(quantity);
      select.selectByVisibleText(number);
    }

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    public WebElement lastQuantity;

    public Double calculateOfPrice(){

        double productPrice = Double.parseDouble(price.getText().substring(1));

        int quantity = Integer.parseInt(lastQuantity.getText());

        double yuvarlanmisSayi = Math.round((productPrice * quantity) * 100.0) / 100.0;

        return yuvarlanmisSayi;
    }

    public Double expectedPrice(){
        Double expected = Double.parseDouble(SubTotal.getText().substring(1));
        return expected;
    }
}

