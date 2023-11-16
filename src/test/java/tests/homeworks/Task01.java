package tests.homeworks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.amazon.*;
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

        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.login();

        //arama kutusuna {search_keyword} yazildiktan sonra arama yapilir
       AmazonBasePage amazonBasePage= new AmazonBasePage();
       amazonBasePage.productSearch();

        //gelen ilk urun sepete eklenir
        AmazonSearchPage amazonSearchPage= new AmazonSearchPage();
        amazonSearchPage.goToFirstProduct();
        AmazonProductPage amazonProductPage= new AmazonProductPage();
        amazonProductPage.productAddToCart();

        //sepete gidilir

        amazonProductPage.goToCart();

        //sepette alinan urunun sayisi{quantity} arttirilir
        AmazonCartPage amazonCartPage = new AmazonCartPage();
        amazonCartPage.setQuantity("7");


        //sepet tutari urunFiyati*quantity olarak bulunmalidir

        Double actual = amazonCartPage.calculateOfPrice();

        Assert.assertTrue(actual.equals(amazonCartPage.SubTotal.getText().substring(1)));

    }
}
