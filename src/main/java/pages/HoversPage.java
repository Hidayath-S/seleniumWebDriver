package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");


    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts with 1
     * @return
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption{
        private WebElement element;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement element){
            this.element = element;
        }
        public boolean isCaptionDisplayed(){
            return element.isDisplayed();
        }

        public String getTitle(){
            return element.findElement(header).getText();
        }

        public String getLink(){
            return element.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return element.findElement(link).getText();
        }


    }
}
