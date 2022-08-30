package RunTestScripts;

import BaseTEST.BaseTest;


import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Registration_Page extends BaseTest {
    @Test
    public void RunRegistrationScript (){

        homepage.user_is_on_the_homepage_of_nop_commerce_application();

      RegisterPage registerpage = homepage.As_A_new_Customer_Click_On_Register_Button();

  //Step 1
      Assert.assertTrue(registerpage.SelectFemaleRadioButton(),"Nothing is selected!");
        System.out.println("Female radio button is selected successfully");

  //Step 2
      registerpage.FillEmptyFieldsInRegisterPage
              ("TestFname","TestLname","tau5@gmail.com","123456","123456");

  //Step 3
      registerpage.ClickOnRegisterButton();

  //Step 4
        Assert.assertTrue(registerpage.GetTextAfterRegistrationCompleted(),"Your registration completed");
        System.out.println("The Registration is completed successfully");

  //Step 5
        registerpage.ClickOnContinueButtonAfterCompletion();

     homepage.Click_On_LogOut_Icon();





    }

}
