package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInput = By.id("email");
    private By retrievePasswordButton = By.cssSelector("#forgot_password button");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    public RetrievePasswordPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new RetrievePasswordPage(driver);

    }



}
