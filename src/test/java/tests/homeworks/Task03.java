package tests.homeworks;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.facebook.FacebookPage;
import utilities.Driver;

public class Task03 {
    // facebook url : https://www.facebook.com/ gidiniz
// login olunuz (faker class)
// girilemedi yazisini test ediniz


    @Test
    public void test(){
        Driver.getDriver().get("https://www.facebook.com/");

        FacebookPage fb = new FacebookPage();

        fb.setLogin();

        Assert.assertTrue(fb.errorMessage.isDisplayed());

    }
}
