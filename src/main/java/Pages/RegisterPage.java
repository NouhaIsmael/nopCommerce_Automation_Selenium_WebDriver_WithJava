package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegisterPage {
    private WebDriver driver;
     By SelectFemaleRadioButton = By.id("gender-female");
     By EnterFirstName = By.id("FirstName");
     By EnterLastName = By.id("LastName");
     By EnterEmail = By.id("Email");
     By EnterPassword = By.id("Password");
     By EnterConfirmedPassword = By.id("ConfirmPassword");
     By ClickOnRegisterButton = By.id("register-button");
    public RegisterPage (WebDriver Driver){this.driver = Driver;}

    //Step 1
    public boolean SelectFemaleRadioButton (){
       driver.findElement(SelectFemaleRadioButton).click();
        return true;}

    //Step 2
    public void FillEmptyFieldsInRegisterPage
            (String Fname, String Lname , String Email, String Pass, String ConfPass){

        driver.findElement(EnterFirstName).sendKeys(Fname);
        driver.findElement(EnterLastName).sendKeys(Lname);
        driver.findElement(EnterEmail).sendKeys(Email);
        driver.findElement(EnterPassword).sendKeys(Pass);
        driver.findElement(EnterConfirmedPassword).sendKeys(ConfPass);}

    //Step 3
    public void ClickOnRegisterButton (){
        driver.findElement(ClickOnRegisterButton).click();
    }

    //Step 4
    public boolean GetTextAfterRegistrationCompleted(){
        driver.findElement(By.xpath
         ("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).isDisplayed();
     return true;
    }

    //Step 5
    public HomePage ClickOnContinueButtonAfterCompletion(){
        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
        return new HomePage(driver);
    }



    
}
