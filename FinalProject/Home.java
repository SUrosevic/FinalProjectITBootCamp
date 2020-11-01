
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Home {

    public static String url = "http://automationpractice.com/index.php";
    private static final String hoverWomenXPath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    private static final String summerDressesFromHoveringWomenXPath = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]";
    private static final String hoverDressesXPath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]";
    private static final String summerDressesFromHoveringDressesXPath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    public static String summerDressesHovDresses = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String summerDressesHovWoman = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String secondDress = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]";
    public static String addSecondDress = "//i[@class='icon-plus']";
    public static String dressSize = "group_1";
    public static String whiteColorDress = "#color_8";
    public static String addToCart = "//span[contains(text(),'Add to cart')]";
    public static String closePopUp = "//span[@class='cross']";
    public static String enterCart = "//b[contains(text(),'Cart')]";
    public static String searchBar = "//input[@id='search_query_top']";
    public static String searchSubmit = "//button[@name='submit_search']";
    public static String threeYellowElements = "//*[@id=\"center_column\"]/div[1]/div[2]/div[2]";
    public static void goToHome(WebDriver driver) {
        driver.get(url);
    }
    public static WebElement checkThreeYellowElements (WebDriver driver) {
        return driver.findElement(By.xpath(threeYellowElements));
    }

    public static WebElement selectSecondDress(WebDriver driver) {
        return driver.findElement(By.xpath(secondDress));
    }
    public static WebElement inputSearchBar(WebDriver driver) {
        return driver.findElement(By.xpath(searchBar));
    }
    public static WebElement submitSearch (WebDriver driver) {
        return driver.findElement(By.xpath(searchSubmit));
    }

    public static WebElement selectAddSecondDress(WebDriver driver) {
        return driver.findElement(By.xpath(addSecondDress));
    }
    public static WebElement getSize(WebDriver driver) {
        return driver.findElement(By.id(dressSize));
    }
    public static WebElement getWhiteColor(WebDriver driver) {
        return driver.findElement(By.cssSelector(whiteColorDress));
    }
    public static WebElement addDressToCart(WebDriver driver) {
        return driver.findElement(By.xpath(addToCart));
    }
    public static WebElement exitPopUp(WebDriver driver) {
        return driver.findElement(By.xpath(closePopUp));
    }
    public static WebElement enterInCart (WebDriver driver) {
        return driver.findElement(By.xpath(enterCart));
    }

    public static void clickSecondDress(WebDriver driver) {
        driver.manage().window().maximize();
        clickSummerDressesFromHoveringDresses(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", selectSecondDress(driver));
        selectSecondDress(driver);
        selectSecondDress(driver).click();
        getWhiteColor(driver).click();

    }

    public static void pickTwoWhiteDresses(WebDriver driver) throws InterruptedException {
        clickSecondDress(driver);
        driver.getWindowHandles();
        selectAddSecondDress(driver);
        selectAddSecondDress(driver).click();
        Select select = new Select(getSize(driver));
        select.selectByVisibleText("M");
        addDressToCart(driver).click();
        Thread.sleep(2000);
        exitPopUp(driver).click();
        enterInCart(driver).click();
    }
    public static void trysearchBar(WebDriver driver){

        inputSearchBar(driver).click();
        inputSearchBar(driver).sendKeys("yellow");
        submitSearch(driver).click();
    }


    public static WebElement getHoverWomen(WebDriver driver) {
        return driver.findElement(By.xpath(hoverWomenXPath));
    }

    public static WebElement getSummerDressesFromHoveringWomen(WebDriver driver) {
        return driver.findElement(By.xpath(summerDressesFromHoveringWomenXPath));
    }

    public static WebElement getHoverDresses(WebDriver driver) {
        return driver.findElement(By.xpath(hoverDressesXPath));
    }

    public static WebElement getsummerDressesFromHoveringDresses(WebDriver driver) {
        return driver.findElement(By.xpath(summerDressesFromHoveringDressesXPath));
    }
    public static String inTheCart(WebDriver driver){
    WebElement description = driver.findElement(By.xpath("//td[@class='cart_description']//a[contains(text(),'Color : White, Size : M')]"));
    return description.getText();

    }

    public static void actionHoverWomen(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(getHoverWomen(driver)).perform();
    }

    public static void clickSummerDressesFromHoveringWomen(WebDriver driver) {
        actionHoverWomen(driver);
        getSummerDressesFromHoveringWomen(driver).click();
    }

    public static String clickSummerDressesFromHoveringWomenURL(WebDriver driver) {
        clickSummerDressesFromHoveringWomen(driver);
        return driver.getCurrentUrl();
    }

    public static void actionHoverDresses(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(getHoverDresses(driver)).perform();
    }

    public static void clickSummerDressesFromHoveringDresses(WebDriver driver) {
        actionHoverDresses(driver);
        getsummerDressesFromHoveringDresses(driver).click();
    }

    public static String clickSummerDressesFromHoveringDressesURL(WebDriver driver) {
        clickSummerDressesFromHoveringDresses(driver);
        return driver.getCurrentUrl();
    }

    public static void pickTwoDresses(WebDriver driver) {
        clickSummerDressesFromHoveringDresses(driver);


    }
}