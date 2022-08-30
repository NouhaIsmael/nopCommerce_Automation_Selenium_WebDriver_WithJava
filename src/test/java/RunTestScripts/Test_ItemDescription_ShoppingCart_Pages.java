package RunTestScripts;

import BaseTEST.BaseTest;
import Pages.ItemDescriptionPage;
import Pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ItemDescription_ShoppingCart_Pages extends BaseTest {

    @Test
  public void Run_ItemDescription_ShoppingCartScripts (){

  ItemDescriptionPage item = homepage.ScrollDownToCertainElement();

  item.Scroll_Down_Till_The_Visibility_Of_An_Element();

  item.Change_Quantity_Of_The_Item_Chosen("3");

 // item.Validate_That_Item_Added_To_The_Cart();

   ShoppingCartPage shoppincartpage = homepage.Scroll_Up_to_the_top_of_the_page();

   shoppincartpage.ClickOnGiftWrappingDropDownMenu();
       // shoppincartpage.Validate_About_The_Selection();
   Assert.assertTrue("Gift wrapping: Yes [+$10.00]"
         .contains(shoppincartpage.Validate_About_The_Selection()),"NO selection has done");
}}
