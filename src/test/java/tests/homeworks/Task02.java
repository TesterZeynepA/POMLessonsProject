package tests.homeworks;

import org.testng.annotations.Test;
import pages.dhtmlgoodies.DhtmlGoodiesPage;
import utilities.Driver;

public class Task02{
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.

    @Test
    public void test(){
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlGoodiesPage dgoodies = new DhtmlGoodiesPage();
        dgoodies.fillInCapitalsByCountry();
    }

}
