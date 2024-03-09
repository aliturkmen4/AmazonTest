package Pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept= By.id("sp-cc-accept");

    static By seach=By.id("twotabsearchtextbox");

    static By searchButton=By.id("nav-search-submit-button");

    static By amazonFilter=By.cssSelector("span[class='s-navigation-icon-text aok-relative'] span[class='a-size-base a-color-base']");

    static By appleFilter=By.cssSelector("[aria-label='Apple'] .a-size-base");

    static By firstProduct=By.xpath("//img[@alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");

    static By addCart=By.id("add-to-cart-button");

    static By goCart=By.xpath("//a[@href='/cart?ref_=sw_gtc']");

    static By checkCart=By.xpath("(//*[text()='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu'])[1]");

    public AmazonPages(WebDriver driver){
        this.driver=driver;
        this.elementHelper=new ElementHelper(driver);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void HomePage() {

    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(seach);
    }

    public static void writeProduct() {
        elementHelper.sendKey(seach,"Airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(addCart);
        elementHelper.click(goCart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(checkCart);
    }
}
