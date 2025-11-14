package com.spotify.interactions;

import com.spotify.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Condicional implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUI.BTN_INICIAR_CON_CONTRA, isVisible()).forNoMoreThan(20).seconds()
        );
        if (LoginUI.BTN_INICIAR_CON_CONTRA.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(LoginUI.BTN_INICIAR_CON_CONTRA)
            );
        }
    }

    public static Condicional now() {
        return new Condicional();
    }
}

