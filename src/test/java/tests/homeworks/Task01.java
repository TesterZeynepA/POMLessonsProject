package tests.homeworks;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.amazon.AmazonBasePage;
import pages.amazon.AmazonCartPage;
import pages.amazon.AmazonSearchPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Task01 {
    //https://www.amazon.com/ a gidilir
    //arama kutusuna {nikon} yazildiktan sonra arama yapilir
    //gelen ilk urun sepete eklenir
    //sepete gidilir
    //sepette alinan urunun sayisi{quantity} arttirilir
    //sepet tutari urunFiyati*quantity olarak bulunmalidir

    //anaSayfa-aramaSayfasi-urunSayfasi-sepetSayfasi


    @Test
    public void test(){
        //https://www.amazon.com/ a gidilir
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //arama kutusuna {search_keyword} yazildiktan sonra arama yapilir
        AmazonBasePage amazonBasePage = new AmazonBasePage();
        amazonBasePage.searchBox.sendKeys("mac" + Keys.ENTER);


        //gelen ilk urun sepete eklenir

        AmazonSearchPage amazonSearchPage = new AmazonSearchPage();
        amazonSearchPage.firstProduct.click();
        amazonSearchPage.addToCartButton.click();

        //sepete gidilir
        amazonSearchPage.goToCart.click();

        //sepette alinan urunun sayisi{quantity} arttirilir
        AmazonCartPage amazonCartPage = new AmazonCartPage();
        amazonCartPage.quantity.sendKeys("3" + Keys.ENTER);








    }
}
