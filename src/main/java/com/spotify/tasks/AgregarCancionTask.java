package com.spotify.tasks;

import com.spotify.interactions.CerrarCookies;
import com.spotify.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarCancionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomeUI.BTN_CARD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomeUI.BTN_CARD),
                WaitUntil.the(HomeUI.BTN_ADD_SONG, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomeUI.BTN_ADD_SONG),
                CerrarCookies.now()

        );
    }

    public static AgregarCancionTask go() {
        return instrumented(AgregarCancionTask.class);
    }
}
