import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SocialMediaIcons {
    public static String facebookByXpath = "//li[@class='facebook']//a";
    public static String twitterByXpath = "//li[@class='twitter']//a";
    public static String youTubeByXpath = "//li[@class='youtube']//a";
    public static String googlePlusByXpath = "//li[@class='google-plus']//a";
    public static String facebookUrl = "https://www.facebook.com/groups/525066904174158/";
    public static String twitterUrl ="https://twitter.com/seleniumfrmwrk";
    public static String youTubeUrl ="https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA";
    public static String googlePlusUrl ="https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&followup=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&flowName=GlifWebSignIn&flowEntry=ServiceLogin";


    public static WebElement facebookElement(WebDriver driver){
        return driver.findElement(By.xpath(facebookByXpath));
    }
    public static void clickFacebook(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(facebookElement(driver)).perform();
        facebookElement(driver).click();
    }
    public static WebElement twitterElement (WebDriver driver){
        return driver.findElement(By.xpath(twitterByXpath));
    }
    public static void clickTwitter(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(twitterElement(driver)).perform();
        twitterElement(driver).click();
    }
    public static WebElement youTubeElement(WebDriver driver){
        return driver.findElement(By.xpath(youTubeByXpath));
    }
    public static void clickYouTube(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(youTubeElement(driver)).perform();
        youTubeElement(driver).click();
    }

    public static WebElement googlePlusElement (WebDriver driver){
        return driver.findElement(By.xpath(googlePlusByXpath));
    }
    public static void clickGooglePlus (WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(googlePlusElement(driver)).perform();
        googlePlusElement(driver).click();
    }
}