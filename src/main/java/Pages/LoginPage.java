package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

         //   By.xpath("//button[normalize-space()='Register']");
    public LoginPage (WebDriver Driver){this.driver = Driver;}
    public String GetText (){
       return driver.findElement(By.xpath
               ("//h1[normalize-space()='Welcome, Please Sign In!']")).getText();}


    public void EnterValidUserCredentials (String Email, String Password){
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(Password);
        System.out.println("User entered his valid credentials successfully" );
        }
        public HomePage ClickOnLoginButton (){
            driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
            System.out.println("Then clicked on the Login Button and navigated to the Home Page.");
            return new HomePage(driver);
        }



    }




