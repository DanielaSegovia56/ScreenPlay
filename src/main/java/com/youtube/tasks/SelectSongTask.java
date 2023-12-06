package com.youtube.tasks;

import com.youtube.interactions.RandomSelection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSongTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RandomSelection.click()
        );
    }

    public static SelectSongTask select(){
        return instrumented(SelectSongTask.class);
    }
}
