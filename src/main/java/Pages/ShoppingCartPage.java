package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {

    WebDriver driver;
    public ShoppingCartPage (WebDriver Driver){
        this.driver = Driver;
    }
     public void ClickOnGiftWrappingDropDownMenu (){

    Select dropdownmenu = new Select(driver.findElement(By.id("checkout_attribute_1")));
    dropdownmenu.selectByVisibleText("Yes [+$10.00]");
}
    public String Validate_About_The_Selection (){
       return driver.findElement(By.xpath("//div[@class='selected-checkout-attributes']")).getText();
}


}
