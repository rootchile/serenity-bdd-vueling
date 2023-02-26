package starter.vueling;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Represents information appearing on an article displayed on Wikipedia
 */
public class Displayed {

    public static Question<String> results() {
        return Text.of(".vy-journey_header_title");
    }
}
