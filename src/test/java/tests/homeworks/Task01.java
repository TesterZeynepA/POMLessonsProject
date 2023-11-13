package tests.homeworks;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Task01 {
    //https://www.amazon.com/ a gidilir
    //arama kutusuna {search_keyword} yazildiktan sonra arama yapilir
    //gelen ilk urun sepete eklenir
    //sepete gidilir
    //sepette alinan urunun sayisi{quantity} arttirilir
    //sepet tutari urunFiyati*quantity olarak bulunmalidir

    //anaSayfa-aramaSayfasi-urunSayfasi-sepetSayfasi


    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));



    }
}
