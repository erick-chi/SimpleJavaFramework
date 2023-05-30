package PageLocators;

public class Locators {
    public class Home{
        public static final String NavigationLogo = "img.Navigation__logo";
        public static final String DirectFlightsCheck = "//label[contains(text(), 'Direct flights')]/preceding-sibling::input";
        public static final String OneWayButton = "//button[text()='One way']";
        public static final String ReturnField = "input[name='return']";
        public static final String PassengersDropdown = "//label[text()='Passengers']/following-sibling::select";
    }
}
