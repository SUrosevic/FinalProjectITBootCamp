import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
    public static String subjectHeading = "#id_contact";
    public static String email = "//input[@id='email']";
    public static String orderReference = "//input[@id='id_order']";
    public static String uploadImage = "//input[@id='fileUpload']";
    public static String sendButton = "//span[contains(text(),'Send')]";
    public static String messageText = "//textarea[@id='message']";
    public static String urlContact = "http://automationpractice.com/index.php?controller=contact";
    public static void goToContactUs(WebDriver driver) {
        driver.get(urlContact);
    }
    public static WebElement confirmation (WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
    }

    public static void chooseSubject(WebDriver driver, String subject) { //Customer service, Webmaster
        Select categorySubject = new Select(driver.findElement(By.cssSelector(subjectHeading)));
        categorySubject.selectByVisibleText(subject);
    }

    public static WebElement emailBar (WebDriver driver) {
        return driver.findElement(By.xpath(email));
    }

    public static void inputEmail(WebDriver driver, String emailE) {
        Actions akcije = new Actions(driver);
        akcije.moveToElement(emailBar(driver)).perform();
        emailBar(driver).click();
        emailBar(driver).sendKeys(emailE);
    }


    public static WebElement orderReferenceElement(WebDriver driver) {
        return driver.findElement(By.xpath(orderReference));
    }

    public static void inputOrderReference(WebDriver driver, String reference) {
        Actions action = new Actions(driver);
        action.moveToElement(orderReferenceElement(driver)).perform();
        orderReferenceElement(driver).click();
        orderReferenceElement(driver).sendKeys(reference);
    }

    public static void uploadingImage(WebDriver driver) {
        WebElement addFile = driver.findElement(By.xpath(uploadImage));
        addFile.sendKeys("C:\\Users\\Sandra\\Desktop\\circle-1.jpg");
    }

    public static WebElement sendButtonElement(WebDriver driver) {
        return driver.findElement(By.xpath(sendButton));
    }

    public static void clickSendButton(WebDriver driver) {
        Actions akcije = new Actions(driver);
        akcije.moveToElement(sendButtonElement(driver)).perform();
        sendButtonElement(driver).click();
    }

    public static WebElement messageTextElement (WebDriver driver) {
        return driver.findElement(By.xpath(messageText));
    }

    public static void insertMessageText (WebDriver driver, String text) {
        Actions action = new Actions(driver);
        action.moveToElement(messageTextElement(driver)).perform();
        messageTextElement(driver).click();
        messageTextElement(driver).sendKeys(text);
    }


}