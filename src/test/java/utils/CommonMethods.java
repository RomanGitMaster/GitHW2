package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.Pageinitilizer;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends Pageinitilizer {

    public static WebDriver driver;

    public void openBrowserAndLunchApp() {
        ConfigReader.readProperties(Constants.FILE_PATH);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ConfigReader.getPropertyValyue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        initilizeObjects();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
