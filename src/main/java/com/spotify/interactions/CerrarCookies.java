package com.spotify.interactions;

import com.spotify.ui.HomeUI;
import com.spotify.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CerrarCookies implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomeUI.BTN_CLOSE, isVisible()).forNoMoreThan(10).seconds()
        );
        if (HomeUI.BTN_CLOSE.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(HomeUI.BTN_CLOSE)
            );
        }
    }

    public static CerrarCookies now() {
        return new CerrarCookies();
    }
}

