package starter.vueling;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;

public class Navigate {
    public static Performable toHomePage() {
        return Open.url("https://www.vueling.com/es");
    }

    public static Performable acceptCookies() {
        return Click.on("#onetrust-accept-btn-handler");
    }
}
