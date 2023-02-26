package starter.vueling;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.screenplay.annotations.CastMember;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingAFlight {

    @CastMember(name = "Pepe")
    Actor pepe;

    @Test
    void searchByAFlight() {
        pepe.attemptsTo(
                Navigate.toHomePage(),
                Navigate.acceptCookies(),
                Search.byOrigin("Amsterdam"),
                Search.byDestination("Barcelona"),
                Search.selectDate("202333"),
                Search.selectDate("202334"),
                Search.submitSearch(),
                Switch.toNewWindow(),
                Ensure.that(Displayed.results()).isEqualTo("Ámsterdam (AMS) - Barcelona (BCN)")
        );
    }
}
