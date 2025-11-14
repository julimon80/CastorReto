package com.spotify.tasks;

import com.spotify.interactions.UserNameAleatorio;
import com.spotify.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CredencialesInvalidasTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LoginUI.BTN_CONTINUAR, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(UserNameAleatorio.now().getCorreo()).into(LoginUI.INPUT_USERNAME),
                Click.on(LoginUI.BTN_CONTINUAR)
        );
    }

    public static CredencialesInvalidasTask go() {
        return instrumented(CredencialesInvalidasTask.class);
    }
}

