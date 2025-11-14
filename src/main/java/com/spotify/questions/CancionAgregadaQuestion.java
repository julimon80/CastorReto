package com.spotify.questions;


import com.spotify.ui.HomeUI;
import com.spotify.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class CancionAgregadaQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return HomeUI.TXT_CONFIR_SONG_ADDED.resolveFor(actor).isVisible();

    }

    public static CancionAgregadaQuestion visible() {
        return new CancionAgregadaQuestion();
    }
}
