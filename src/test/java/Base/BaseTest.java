package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Properties props;
    public static FileReader fReader;

    @BeforeTest
    public void setUp() throws IOException {
        if (driver == null) {
            loadProperties();
        }

        if (props.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(props.getProperty("url"));
        } else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(props.getProperty("url"));
        }
    }
    private void loadProperties() throws IOException {
        String propertiesPath = "src/test/resources/ConfigFiles/config.properties";
        fReader = new FileReader(propertiesPath);
        props = new Properties();
        props.load(fReader);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
