package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {


    public WebDriver driver = null;

    By from_option   = By.cssSelector("#input-button__departure");
    By to_option     = By.cssSelector("#input-button__destination");
    By to_airport_option = By.xpath("/html[1]/body[1]/ry-tooltip[1]/div[2]/hp-app-controls-tooltips[1]/fsw-controls-tooltips-container[1]/fsw-controls-tooltips[1]/fsw-destination-container[1]/fsw-airports[1]/div[1]/fsw-airports-list[1]/div[2]/div[1]/fsw-airport-item[2]/span[1]/span[1]");
    By depart_date_field  = By.cssSelector("body.ng-tns-0-16:nth-child(2) hp-home.ng-tns-c144-0 hp-search-widget-container.ng-tns-c144-0:nth-child(2) div.search-widget__content hp-flight-search-widget-container.search-widget__search.ng-tns-c137-2.ng-star-inserted:nth-child(3) fsw-flight-search-widget-container.flight-search-widget__container.ng-tns-c137-2:nth-child(2) fsw-flight-search-widget.ng-tns-c62-3.ng-star-inserted div.flight-search-widget__controls-container.ng-tns-c62-3 fsw-flight-search-widget-controls-container.flight-search-widget__controls.ng-tns-c62-3 fsw-flight-search-widget-controls.ng-tns-c61-4.ng-star-inserted div.flight-widget-controls__control-block.flight-widget-controls__control-block--details.ng-trigger.ng-trigger-collapseExpandElement.ng-tns-c61-4.ng-star-inserted:nth-child(2) div.flight-widget-controls__calendar.ng-tns-c61-4.ng-trigger.ng-trigger-datesContainerInitialRender fsw-input-button.flight-widget-controls__control.flight-widget-controls__control--date.ng-tns-c61-4.ng-trigger.ng-trigger-datesFromTripTypeChange.input-button--connected-right:nth-child(1) div.input-button__content > div.input-button__input.ng-star-inserted");
    By selected_depart_date = By.cssSelector("body.ng-tns-0-16:nth-child(2) ry-tooltip.fsw-search-tooltip.tooltip-container.ng-star-inserted.tooltip-container-bottom:nth-child(16) div.tooltip-inner fsw-flexible-datepicker-container.ng-star-inserted fsw-datepicker.ng-star-inserted:nth-child(2) div.datepicker__calendars calendar.datepicker__calendar.datepicker__calendar--left:nth-child(2) calendar-body:nth-child(2) div.calendar-body__row.ng-star-inserted:nth-child(5) div.calendar-body__cell-wrap.ng-star-inserted:nth-child(19) > div.calendar-body__cell.calendar-body__cell--weekend");
    //By return_date   = By.cssSelector("body.ng-tns-0-16:nth-child(2) hp-home.ng-tns-c144-0 hp-search-widget-container.ng-tns-c144-0:nth-child(2) div.search-widget__content hp-flight-search-widget-container.search-widget__search.ng-tns-c137-2.ng-star-inserted:nth-child(3) fsw-flight-search-widget-container.flight-search-widget__container.ng-tns-c137-2:nth-child(2) fsw-flight-search-widget.ng-tns-c62-3.ng-star-inserted div.flight-search-widget__controls-container.ng-tns-c62-3 fsw-flight-search-widget-controls-container.flight-search-widget__controls.ng-tns-c62-3 fsw-flight-search-widget-controls.ng-tns-c61-4.ng-star-inserted div.flight-widget-controls__control-block.flight-widget-controls__control-block--details.ng-trigger.ng-trigger-collapseExpandElement.ng-tns-c61-4.ng-star-inserted:nth-child(2) div.flight-widget-controls__calendar.ng-tns-c61-4.ng-trigger.ng-trigger-datesContainerInitialRender fsw-input-button.flight-widget-controls__control.flight-widget-controls__control--date.ng-tns-c61-4.ng-trigger.ng-trigger-smoothPickerAppear.input-button--connected-left.ng-star-inserted:nth-child(2) div.input-button__content > div.input-button__input.ng-star-inserted");
    //By passenger_adult_option = By.cssSelector("body.ng-tns-0-16:nth-child(2) ry-tooltip.fsw-search-tooltip.tooltip-container.ng-star-inserted.tooltip-container-bottom:nth-child(16) div.tooltip-inner fsw-passengers-container.ng-star-inserted fsw-passengers-picker:nth-child(1) ry-counter.passengers-picker__passenger-type.ng-star-inserted:nth-child(3) div.counter div.counter__button-wrapper--enabled:nth-child(3) > ry-counter-button.counter__button");
    //By passenger_child_option = By.cssSelector("body.ng-tns-0-16:nth-child(2) ry-tooltip.fsw-search-tooltip.tooltip-container.ng-star-inserted.tooltip-container-bottom:nth-child(16) div.tooltip-inner fsw-passengers-container.ng-star-inserted fsw-passengers-picker-container:nth-child(1) fsw-passengers-picker:nth-child(1) ry-counter.passengers-picker__passenger-type.ng-star-inserted:nth-child(5) div.counter > div.counter__button-wrapper--enabled:nth-child(3)");
    By flight_search_button = By.xpath("//body/hp-app-root[1]/hp-home-container[1]/hp-home[1]/hp-search-widget-container[1]/hp-search-widget[1]/div[1]/hp-flight-search-widget-container[1]/fsw-flight-search-widget-container[1]/fsw-flight-search-widget[1]/div[1]/div[1]/div[1]/button[1]");

    public HomePageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void fill_fromOption(String text){
        WebDriverWait wait = new WebDriverWait (driver, 20);
        driver.findElement(from_option).click();
        driver.findElement(from_option).clear();
        driver.findElement(from_option).sendKeys(text);
        driver.findElement(flight_search_button).click();
    }

    public void fill_toOption(String text){
        driver.findElement(to_option).click();
        driver.findElement(to_option).sendKeys(text);
        driver.findElement(to_airport_option).click();
    }

    //public void choose_airport(){
        //WebDriverWait wait = new WebDriverWait (driver, 10);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(airport_option)));
        //element.click();
    //}

    public void choose_departDate(){
        driver.findElement(depart_date_field).click();
        driver.findElement(selected_depart_date).click();
    }
}
