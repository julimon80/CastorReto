package com.spotify.tasks;

import com.spotify.interactions.CerrarCookies;
import com.spotify.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoTop50 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomeUI.BTN_LOGIN, isVisible()).forNoMoreThan(30).seconds(),
                CerrarCookies.now(),
                WaitUntil.the(HomeUI.BTN_EXPLORAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(HomeUI.BTN_EXPLORAR),
                WaitUntil.the(HomeUI.BTN_TOP50, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(HomeUI.BTN_TOP50)
        );
    }

    public static GoTop50 go() {
        return instrumented(GoTop50.class);
    }
}
