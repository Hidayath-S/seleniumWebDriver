package loginTests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void verifyTheFormAuthentication(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        System.out.println(secureAreaPage.getBannerMessage());
        assertTrue(secureAreaPage.getBannerMessage().contains("You logged into a secure area!"),"The banner message was not as expected!");

    }
}
