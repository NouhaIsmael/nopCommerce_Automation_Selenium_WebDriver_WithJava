package BaseTEST;


import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        homepage = new HomePage(driver);

        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().maximize();
    }
  /*  @AfterClass
    public void TearDown(){
        driver.quit();
    }*/







}
