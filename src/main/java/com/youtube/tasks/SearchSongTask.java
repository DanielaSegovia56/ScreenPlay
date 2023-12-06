package com.youtube.tasks;

import com.youtube.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.youtube.UI.HomeUI.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchSongTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Data.extractTo().get(0).get("Lista")).into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static SearchSongTask search(){
        return instrumented(SearchSongTask.class);
    }
}
