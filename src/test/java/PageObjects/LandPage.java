package PageObjects;

import Abstracts.Common;
import PageLocators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class LandPage extends Common {
    WebDriver driver;

    public LandPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean IsNavigationLogoDisplayed(){
        return NavigationLogo.isDisplayed();
    }
    public void selectDirectFlights(){
        DirectFlightsCheck.click();
    }
    public void clickOneWayBtn(){
        OneWayButton.click();
    }
    public Boolean IsReturnFieldDisplayed(){
        return findElements(By.cssSelector(Locators.Home.ReturnField)).size() > 0;
    }
    public List<WebElement> GetPassengersddOptions(){
        Select ddOptions = new Select(findElement(new By.ByXPath(Locators.Home.PassengersDropdown), 10));
        return ddOptions.getOptions();
    }
    public List<String> GetExpectedPassengersddItems(){
        List<String> ExpectedItems = new ArrayList<>();
        ExpectedItems.add("1");
        ExpectedItems.add("2");
        ExpectedItems.add("3");
        ExpectedItems.add("4");
        ExpectedItems.add("5");
        ExpectedItems.add("6");
        ExpectedItems.add("7");
        ExpectedItems.add("8");
        ExpectedItems.add("9");
        return ExpectedItems;
    }

    //Web Elements
    WebElement NavigationLogo = findElement(By.cssSelector(Locators.Home.NavigationLogo), 10);
    WebElement DirectFlightsCheck = findElement(By.xpath(Locators.Home.DirectFlightsCheck), 10);
    WebElement OneWayButton = findElement(By.xpath(Locators.Home.OneWayButton), 10);
}
