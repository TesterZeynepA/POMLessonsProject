package pages.dhtmlgoodies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlGoodiesPage {
    public DhtmlGoodiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "box1")
    public WebElement oslo;

    @FindBy(id = "box2")
    public WebElement stockholm;

    @FindBy(id = "box3")
    public WebElement washington;

    @FindBy(id = "box4")
    public WebElement copenhagen;

    @FindBy(id = "box5")
    public WebElement seoul;

    @FindBy(id = "box6")
    public WebElement rome;

    @FindBy(id = "box7")
    public WebElement madrid;


    @FindBy(id = "box106")
    public WebElement italy;

    @FindBy(id = "box107")
    public WebElement spain;

    @FindBy(id = "box101")
    public WebElement norway;

    @FindBy(id = "box104")
    public WebElement denmark;

    @FindBy(id = "box105")
    public WebElement southKorea;

    @FindBy(id = "box102")
    public WebElement sweden;

    @FindBy(id = "box103")
    public WebElement unitedStates;

    public void fillInCapitalsByCountry(){
        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(rome,italy).dragAndDrop(stockholm,sweden).dragAndDrop(madrid,spain).dragAndDrop(seoul,southKorea)
                .dragAndDrop(copenhagen,denmark).dragAndDrop(oslo,norway).dragAndDrop(washington,unitedStates).perform();

    }
}
