package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.PageInitilizer;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitilizer {

    public static WebDriver driver;

    public void openBrowserAndLunchApp() {
        ConfigReader.readProperties(Constants.FILE_PATH);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ConfigReader.getPropertyValyue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        initilizePages();
    }

    public void closeBrowser() {
        driver.quit();
    }
    public void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);
    }
}
