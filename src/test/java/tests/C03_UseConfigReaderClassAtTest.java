package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_UseConfigReaderClassAtTest {
    // Go to Amazon
    //Go to Google
    //Use configReader class

    @Test
    public void UseConfigReader(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Driver.closeDriver();

        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Driver.closeDriver();

    }
}
