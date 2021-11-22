package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePageObjects;

public class TravelQuote {

    private static WebDriver driver = null;

    HomePageObjects homePageObjects;

    @Before
    public void setupClass() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        homePageObjects = new HomePageObjects(driver);
    }

    //@After
    //public void teardown() {
        //if (driver != null) {
            //driver.quit();
        //}
    //}

    @Given("Im on Ryanair web page")
    public void im_on_ryanair_web_page() {
        driver.get("https://www.ryanair.com/gb/en");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(),'Yes, I agree')]")).click();
    }

    @Given("I enter departure {string},arrival {string}")
    public void i_enter_departure_arrival(String string, String string2) {
        homePageObjects.fill_fromOption(string);
        homePageObjects.fill_toOption(string2);
    }

    @Given("I choose departure date {string},return date {string},two adults and one child")
    public void i_choose_departure_date_return_date_two_adults_and_one_child(String string, String string2) {

    }

    @Given("I press Search button")
    public void i_press_search_button() {

    }

    @Given("change the departure date {string}")
    public void change_the_departure_date(String string) {

    }

    @Given("change the return date {string}")
    public void change_the_return_date(String string) {

    }

    @Given("I choose fligth departure and fligth arrival")
    public void i_choose_fligth_departure_and_fligth_arrival() {

    }

    @Given("I select value travel ligth")
    public void i_select_value_travel_ligth() {

    }

    @Given("I select continue with Value fare")
    public void i_select_continue_with_value_fare() {

    }

    @Given("I choose Login later")
    public void i_choose_login_later() {

    }

    @Given("I choose Passenger one Title, name and lastname")
    public void i_choose_passenger_one_title_name_and_lastname() {

    }

    @Given("I choose Passenger two Title, name and lastname")
    public void i_choose_passenger_two_title_name_and_lastname() {

    }

    @Given("I choose Passenger three name and lastname")
    public void i_choose_passenger_three_name_and_lastname() {

    }

    @Given("I select continue")
    public void i_select_continue() {

    }

    @Given("I close the popup")
    public void i_close_the_popup() {

    }

    @Given("I choose the departure seats and press Next fligth button")
    public void i_choose_the_departure_seats_and_press_next_fligth_button() {

    }

    @Given("I choose de arrival seats and press continue")
    public void i_choose_de_arrival_seats_and_press_continue() {

    }

    @Given("I refuse fast track by choosing No thanks option")
    public void i_refuse_fast_track_by_choosing_no_thanks_option() {

    }

    @Given("I choose {int} Small Bag only option and press continue")
    public void i_choose_small_bag_only_option_and_press_continue(Integer int1) {

    }

    @Given("I press continue")
    public void i_press_continue() {

    }

    @Then("I validate the {string} title page")
    public void i_validate_the_title_page(String string) {

    }
}
