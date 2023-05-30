package Tests;

import Abstracts.Common;
import PageObjects.LandPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleTest extends Common {
    @Test
    public void WelcomeTitleValidation(){
        //This test case validates Global Air logo is displayed on home page
        LandPage landing = new LandPage(driver);
        Assert.assertTrue(landing.IsNavigationLogoDisplayed(), "Welcome Title Is Not Being Displayed");
    }

    @Test
    public void ReturnFieldAvailability(){
        //This test validates return field disappears after selecting one way option
        LandPage landing = new LandPage(driver);
        landing.selectDirectFlights();
        Assert.assertTrue(landing.IsReturnFieldDisplayed(), "Return Field Is Not Displayed Before Clicking One Way Trip");
        landing.clickOneWayBtn();
        Sleep(2);
        Assert.assertFalse(landing.IsReturnFieldDisplayed(), "Return Field Is Being Displayed After Selecting One Way Trip");
    }
    @Test
    public void PassengersDropdownOptions(){
        //This test validates the number of options within passengers dropdown
        LandPage landing = new LandPage(driver);
        List<String> dropdownItems = new ArrayList<>();
        landing.GetPassengersddOptions().forEach(element -> dropdownItems.add(element.getText()));
        Assert.assertEquals(dropdownItems.toArray(), landing.GetExpectedPassengersddItems().toArray(), "The expected elements within the passengers dropdown are not displayed correctly");
    }
}
