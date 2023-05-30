package Framework.Tests;

import Framework.Abstracts.Common;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleTest extends Common {
    @Test
    public void WelcomeTitleValidation(){
        Assert.assertTrue(landPage().IsNavigationLogoDisplayed(), "Welcome Title Is Not Being Displayed");
    }

    @Test
    public void ReturnFieldAvailability(){
        //This test validates return field disappears after selecting one way option
        landPage().selectDirectFlights();
        Assert.assertTrue(landPage().IsReturnFieldDisplayed(), "Return Field Is Not Displayed Before Clicking One Way Trip");
        landPage().clickOneWayBtn();
        Sleep(2);
        Assert.assertFalse(landPage().IsReturnFieldDisplayed(), "Return Field Is Being Displayed After Selecting One Way Trip");
    }
    @Test
    public void PassengersDropdownOptions(){
        //This test validates the number of options within passengers dropdown
        List<String> dropdownItems = new ArrayList<>();
        landPage().GetPassengersddOptions().forEach(element -> dropdownItems.add(element.getText()));
        Assert.assertEquals(dropdownItems.toArray(), landPage().GetExpectedPassengersddItems().toArray(), "The expected elements within the passengers dropdown are not displayed correctly");
    }
}
