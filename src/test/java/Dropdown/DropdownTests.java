package Dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.*;

import java.util.List;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOption(){
        String option = "Option 1";
     DropdownPage dropdownPage = homePage.clickDropdownLink();
     dropdownPage.selectFromDropdown(option);

     // asserting the dropdown selection
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"number of selected options are not correct!");
        assertTrue(selectedOptions.contains(option),"Invalid option selected!");
    }
}
