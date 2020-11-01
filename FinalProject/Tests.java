
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public class Testovi {
    @Test
    public void methodTestSummerDressesUrlFromWomen() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        SoftAssert sa = new SoftAssert();

        sa.assertEquals(Home.summerDressesHovWoman, Home.clickSummerDressesFromHoveringWomenURL(driver));
        sa.assertAll();
        driver.close();
    }

    @Test
    public void methodTestSummerDressesUrlFromDresses() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        SoftAssert sa = new SoftAssert();

        sa.assertEquals(Home.summerDressesHovDresses, Home.clickSummerDressesFromHoveringDressesURL(driver));
        sa.assertAll();
        driver.close();

    }

    @Test
    public void methodTestSummerDressesBothUrl() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();


        SoftAssert sa = new SoftAssert();

        sa.assertEquals(Home.clickSummerDressesFromHoveringWomenURL(driver), Home.clickSummerDressesFromHoveringDressesURL(driver));
        sa.assertAll();
        driver.close();


    }

    @Test
    public void methodTwoSummerDresses() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        Home.pickTwoWhiteDresses(driver);

        Assert.assertEquals(Home.inTheCart(driver), "Color : White, Size : M");
        driver.close();
    }

    @Test
    public void methodThreeYellowItems() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        Home.trysearchBar(driver);

        Assert.assertEquals(Home.checkThreeYellowElements(driver).getText(), "Showing 1 - 3 of 3 items");
        boolean yellow = false;
        List<WebElement> searchResults = driver.findElements(By.className("color_to_pick_list"));
        for (int i = 0; i < searchResults.size(); i++) {
            List<WebElement> searchColours = searchResults.get(i).findElements(By.className("color_pick"));
            for (int j = 0; j < searchColours.size(); j++) {
                if (searchColours.get(j).getAttribute("style").contains("background: rgb(241, 196, 15);")) {
                    yellow = true;
                }
            }
        }
        Assert.assertEquals(yellow, true);
        driver.close();

    }

    @Test
    public void methodContactUsConfirmation() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        ContactUs.goToContactUs(driver);
        driver.manage().window().maximize();
        ContactUs.chooseSubject(driver, "Webmaster");
        ContactUs.inputEmail(driver, "blabla@gmail.com");
        ContactUs.inputOrderReference(driver, "bla");
        ContactUs.uploadingImage(driver);
        ContactUs.insertMessageText(driver, "sandraaaaaa");
        ContactUs.clickSendButton(driver);


        Assert.assertEquals(ContactUs.confirmation(driver).getText(), "Your message has been successfully sent to our team.");
        driver.close();
    }

    @Test
    public void methodSocialMedia1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        SocialMediaIcons.clickFacebook(driver);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String newUrl = driver.getCurrentUrl();

        Assert.assertEquals(newUrl, SocialMediaIcons.facebookUrl);
        driver.quit();
    }

    @Test
    public void methodSocialMedia2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        SocialMediaIcons.clickTwitter(driver);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String newUrl1 = driver.getCurrentUrl();

        Assert.assertEquals(newUrl1, SocialMediaIcons.twitterUrl);
        driver.quit();
    }

    @Test
    public void methodSocialMedia3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        SocialMediaIcons.clickYouTube(driver);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String newUrl2 = driver.getCurrentUrl();

        Assert.assertEquals(newUrl2, SocialMediaIcons.youTubeUrl);
        driver.quit();
    }

    @Test
    public void methodSocialMedia4() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        Home.goToHome(driver);
        driver.manage().window().maximize();
        SocialMediaIcons.clickGooglePlus(driver);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String newUrl3 = driver.getCurrentUrl();

        Assert.assertEquals(newUrl3, SocialMediaIcons.googlePlusUrl);
        driver.quit();

    }

    @Test
    public void sendMessagesOutOfExcel() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandra\\Downloads\\zaselenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        XSSFWorkbook wb;
        FileInputStream insertFile;
        try {
            insertFile = new FileInputStream("C:\\Users\\Sandra\\Desktop\\ITBOOTCAMP\\30_pitanja.xlsx");
            wb = new XSSFWorkbook(insertFile);

            Sheet list = wb.getSheetAt(0);

            for (int i = 1; i <= 30; i++) {
                Row row = list.getRow(i);
                ContactUs.goToContactUs(driver);
                driver.manage().window().maximize();
                Cell subject = row.getCell(0);
                ContactUs.chooseSubject(driver, subject.toString());
                Cell email = row.getCell(1);
                ContactUs.inputEmail(driver, email.toString());
                Cell reference = row.getCell(2);
                ContactUs.inputOrderReference(driver, reference.toString());
                ContactUs.uploadingImage(driver);
                Cell text = row.getCell(3);
                ContactUs.insertMessageText(driver, text.toString());
                ContactUs.clickSendButton(driver);

                Assert.assertEquals(ContactUs.confirmation(driver).getText(), "Your message has been successfully sent to our team.");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}