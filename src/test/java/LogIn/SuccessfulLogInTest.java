package LogIn;

import CoreClasses.BaseTest;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLogInTest extends BaseTest {

    @Test
    public void VerifySuccessfulLogIn() throws InterruptedException{

        MenuPage menupage = new MenuPage(BaseTest.driver);

        menupage.ClickOnMenu("Log In");

        LoginPage loginPage = new LoginPage(BaseTest.driver);
//        Assert.assertTrue(loginPage.VerifyTitle(),"Title and Url of register page dose not match");

//        loginPage.loginfrields()
//
//
//        DashboardPage dashboardpage = new DashboardPage(BaseTest.driver);
//
//        if (dashboardpage.verifyUserOnRenewPage()){
//            System.out.println("Test Case Pass");
//        } else {
//            System.out.println("Test Case Failed becase user didnt redirect to the Renew page");
//        }



        loginPage.VerifyTitle();

        loginPage.LoginCredentials();




    }
}
