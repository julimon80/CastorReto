package com.spotify.questions;


import com.spotify.ui.HomeUI;
import com.spotify.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Top50Question implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(HomeUI.TXT_TOP50, isVisible()).forNoMoreThan(10).seconds()
        );
        return HomeUI.TXT_TOP50.resolveFor(actor).isVisible();

    }

    public static Top50Question visible() {
        return new Top50Question();
    }
}
