package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemDescriptionPage {
    WebDriver driver;



    public ItemDescriptionPage(WebDriver Driver) {
        this.driver = Driver;
    }


    public void Scroll_Down_Till_The_Visibility_Of_An_Element(){
        WebElement Add_To_Cart_Quantity = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_4']"));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView();",Add_To_Cart_Quantity);
    }
    public void Change_Quantity_Of_The_Item_Chosen (String NewQuantity) {
  WebElement Add_To_Cart_Quantity = driver.findElement
          (By.xpath("//input[@id='product_enteredQuantity_4']"));
  WebElement Click_On_Add_To_Cart_Button = driver.findElement(By.id("add-to-cart-button-4"));

    Actions builder = new Actions(driver);
    Action DoubleClickOnQuantity = builder.doubleClick(Add_To_Cart_Quantity).build();
        DoubleClickOnQuantity.perform();
        Add_To_Cart_Quantity.sendKeys(NewQuantity);
        Click_On_Add_To_Cart_Button.click();
}

    /*public void Validate_That_Item_Added_To_The_Cart (){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//p[@class='content']"))));

        driver.switchTo().alert().dismiss();

    }*/





}
