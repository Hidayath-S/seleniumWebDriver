package FrameTests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {


    @Test
    public void testFrame(){
        WysiwygEditorPage editorPage = homePage.clickOnWYSIWYGEditorLink();
       // Add a wait here
        editorPage.clearText();
        String text1 = "Hello";
        String text2 = "World!";
        editorPage.setText(text1);
        editorPage.setText(text2);
        assertEquals(editorPage.getTextFromEditorArea(),text1+text2, "the entered text wasn't correct");
    }
}
