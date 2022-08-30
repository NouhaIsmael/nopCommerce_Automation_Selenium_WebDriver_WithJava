package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By ClickOnRegisterButton =
            By.linkText("Register");
    public HomePage (WebDriver Driver){this.driver = Driver;}
    public void user_is_on_the_homepage_of_nop_commerce_application() {
        System.out.println("User Visits the Home Page of the nopCommerce application.");}

    public RegisterPage As_A_new_Customer_Click_On_Register_Button () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.
                elementToBeClickable(driver.findElement(ClickOnRegisterButton))).click();
        System.out.println("User Filled the fields with valid data.");
        return new RegisterPage(driver);
    }
   public LoginPage ClickOnLogInIconAboveTheHomePage(){
         driver.findElement(By.linkText("Log in")).click();
         System.out.println("User CLicked on the Login Button above the " +
                 "page to Login with his valid Credentials after registration.");
        return new LoginPage(driver);
       }
       public boolean getTextFromHomePage (){
        return driver.findElement(By.linkText("My account")).isDisplayed();
       }

      public ItemDescriptionPage ScrollDownToCertainElement (){
          WebElement AppleLabTop = driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
           JavascriptExecutor scroll =  (JavascriptExecutor)driver;
           scroll.executeScript("arguments[0].scrollIntoView();",AppleLabTop);
           AppleLabTop.click();
          return new ItemDescriptionPage(driver);
       }

       public ShoppingCartPage Scroll_Up_to_the_top_of_the_page (){
        WebElement ShoppingCart_Icon = driver.findElement(By.id("topcartlink"));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView();",ShoppingCart_Icon);
        ShoppingCart_Icon.click();
        return new ShoppingCartPage (driver);
    }

    public void Click_On_LogOut_Icon (){
        driver.findElement(By.linkText("Log out")).click();
    }
}
