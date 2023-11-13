package pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoLoginPage {


    //bir page sayfasi olsuturuldugunda mutlaka yapmamiz gerekn sey
    //*bir parametresiz constructor olusturup driver a ilk degeri atamaktir
    //*bu sayfadaki butun elemanlarin driverla baglantisi gerekiyor
    //*bunun icin asagidaki constructor eklendi ve PageFactory ile
    // driver uzerinden bu (this) sayfadaki butun elemanlar iliskilendirildi
    //boylece sayfadan obje turetildigi zaman degil, kullanildigi anda elemanlarin bulunmasi aktif olur.
    //*bu yontemle butun sayfalarda ayni isimde elemanlar var ise buradaki tanımlama hepsi icin gecerli hale gelir..
    //bu yapiya POM denir


    public SauceDemoLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //driver.findElement() yerine @FindBy notasyonu kullanılır.
//WebElement'ler POM ile;
// Test classlarında değil, Page Class'larda locate edilir.
// Erişim sağlanması adına Access Modifier public olmalıdır, kullanırken de @FindBy notasyonu ile locate edilir.
// Test classlarında kullanırken de Page Class'tan üretilen obje aracılığıyla kullanılabilir.

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void loginSauceDemo(String userName, String passWord) {

        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();
    }

}
