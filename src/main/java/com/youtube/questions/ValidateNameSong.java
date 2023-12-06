package com.youtube.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.UI.NameSongUI.LBL_SONG;

public class ValidateNameSong implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        String song1 = actor.recall("cancion");
        String song2 = LBL_SONG.resolveFor(actor).getText();

        return song1.contains(song2);
    }

    public static Question validate(){
        return new ValidateNameSong();
    }
}
