package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void navigate() {
        driver.get("https://demo.opencart.com.gr/index.php?route=common/home");
    }

    // Locators
    private final By MyAccountDropdown = By.cssSelector("a[title='My Account']");
    private final By Register_Button = By.xpath("//a[text()='Register']");
    private final By Login_Button=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");


    private final By macbookAddToCart = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]");
    private final By macbookAddToWishList=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]");
    private final By iphoneAddToCart=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]");
    private final By iphoneAddToWishList=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]");
    private final By AddToCart_I=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/button");
    private final By AddToCart_M=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button");
    public void clickRegister() {
        driver.findElement(MyAccountDropdown).click();
        driver.findElement(Register_Button).click();
    }
    public void clickLogin()
    {
        driver.findElement(MyAccountDropdown).click();
        driver.findElement(Login_Button).click();
    }

    public void addMacbookToCart() {
        driver.findElement(macbookAddToCart).click();
    }
    public void addMacbookToWishList()
    {
        driver.findElement(macbookAddToWishList).click();
    }
    public void addiphoneToCart()
    {
        driver.findElement(iphoneAddToCart).click();
    }
    public void addiphoneToWishList()
    {
        driver.findElement(iphoneAddToWishList).click();
    }
    public void openWishListPage() {
        driver.get("https://demo.opencart.com.gr/index.php?route=account/wishlist");
    }
    public void openShoppingCart()
    {
        driver.get("https://demo.opencart.com.gr/index.php?route=checkout/cart");
    }
    public void AddtoCartI()
    {
        driver.findElement(AddToCart_I).click();
    }
    public void AddtoCartM()
    {
        driver.findElement(AddToCart_M).click();
    }
}