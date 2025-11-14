package com.spotify.tasks;

import com.spotify.interactions.Condicional;
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

public class CredencialesCorrectasTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LoginUI.BTN_CONTINUAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("julianfus@hotmail.com").into(LoginUI.INPUT_USERNAME),
                Click.on(LoginUI.BTN_CONTINUAR),
                Condicional.now(),
                Enter.theValue("Undertaker1995").into(LoginUI.INPUT_PASS),
                Click.on(LoginUI.BTN_INICIAR_SESION)
        );
    }

    public static CredencialesCorrectasTask go() {
        return instrumented(CredencialesCorrectasTask.class);
    }
}

