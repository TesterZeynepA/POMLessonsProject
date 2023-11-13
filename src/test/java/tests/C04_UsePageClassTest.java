package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.sauceDemo.SauceDemoLoginPage;
import pages.sauceDemo.SauceDemoTransactions;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_UsePageClassTest {
//Navigate to https://www.saucedemo.com/
//Enter the username as standard_user
//Enter the password as secret_sauce
//Click on login button.
//- Choose price low to high
//- Verify item prices are sorted from low to high with hard Assert.

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("sauceDemoUrl"));

        SauceDemoLoginPage sdemo= new SauceDemoLoginPage();

       sdemo.loginSauceDemo("standard_user","secret_sauce");

        SauceDemoTransactions sauceTransaction= new SauceDemoTransactions();
        Select select = new Select(sauceTransaction.dropDown);
        select.selectByValue("lohi");

        Assert.assertTrue(sauceTransaction.dropDownText.getText().contains("low to high"));

    }
}
