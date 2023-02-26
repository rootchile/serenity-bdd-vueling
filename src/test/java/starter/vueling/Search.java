package starter.vueling;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.InputField;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.actions.Click;

/**
 * Wikipedia search actions
 */
public class Search {
    public static Performable byOrigin(String city) {
        return Task.where(Enter.theValue(city).into(InputField.withNameOrId("originInput")).thenHit(Keys.ENTER)
        );
    }

    public static Performable byDestination(String city) {
        return Task.where(Enter.theValue(city).into(InputField.withNameOrId("destinationInput")).thenHit(Keys.ENTER)
        );
    }

    public static Performable selectDate(String date) {
        return Click.on("#calendarDaysTable"+date);
    }

    public static Performable submitSearch() {
        return Click.on("#btnSubmitHomeSearcher");
    }
}
