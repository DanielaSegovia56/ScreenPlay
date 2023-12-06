package com.youtube.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.youtube.UI.ListSongUI.LIST_SONG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RandomSelection implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listSongs = LIST_SONG.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listSongs.size());
        actor.remember("cancion",listSongs.get(indexRandom).getText());
        listSongs.get(indexRandom).click();
    }

    public static Performable click(){
        return instrumented(RandomSelection.class);
    }
}
