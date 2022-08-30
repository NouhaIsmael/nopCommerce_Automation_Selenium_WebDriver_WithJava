package RunTestScripts;

import BaseTEST.BaseTest;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {

    @Test
    public void RunLoginPageScript (){

        LoginPage loginpage =  homepage.ClickOnLogInIconAboveTheHomePage();

        Assert.assertEquals(loginpage.GetText(), "Welcome, Please Sign In!");
        System.out.println("User is navigated to the Login Page successfully.");

        loginpage.EnterValidUserCredentials("tau4@gmail.com","123456");

        loginpage.ClickOnLoginButton();

        Assert.assertEquals(homepage.getTextFromHomePage(),true,
                "THere is No My account button displayed in the Home Page.");
        System.out.println("User is on the Homepage again after entering his valid credentials");

    }




}
