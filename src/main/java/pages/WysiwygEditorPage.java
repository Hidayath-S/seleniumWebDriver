package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorFrameId = "mce_0_ifr";
    private By textEditorId = By.id("tinymce");


    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearText(){
        switchToEditorFrame();
        driver.findElement(textEditorId).clear();
        switchToMainFrame();
    }

    public void setText(String text){
        switchToEditorFrame();
        driver.findElement(textEditorId).sendKeys(text);
        switchToMainFrame();
    }

    public String getTextFromEditorArea(){
        switchToEditorFrame();
        String text = driver.findElement(textEditorId).getText();
        switchToMainFrame();
        return text;
    }

    private void switchToEditorFrame(){
        driver.switchTo().frame(editorFrameId);
    }

    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }
}
