package com.spotify.tasks;

import com.spotify.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoInicioSesionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomeUI.BTN_LOGIN, isVisible()).forNoMoreThan(25).seconds(),
                Click.on(HomeUI.BTN_LOGIN)
        );
    }

    public static GoInicioSesionTask go() {
        return instrumented(GoInicioSesionTask.class);
    }
}
