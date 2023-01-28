package hoverTests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHovers(){
        HoversPage hoversPage = homePage.clickOnHoversLink();
         HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"caption box is not displayed!");
        assertEquals(figureCaption.getTitle(),"name: user1","title is not matching!");
        assertEquals(figureCaption.getLinkText(),"View profile","link text is not matching!");
        assertEquals(figureCaption.getLink(),"https://the-internet.herokuapp.com/users/1","link is not matching!");
    }
}
