package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class BaseTests {

   private WebDriver driver;
   protected HomePage homePage;
   protected LoginPage loginPage;
   protected SecureAreaPage secureAreaPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        /**
         * once the driver has accessed the home page using the above code
         *         we are passing the handle to homePage
         */
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
