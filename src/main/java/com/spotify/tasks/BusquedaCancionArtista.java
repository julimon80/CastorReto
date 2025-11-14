package com.spotify.tasks;

import com.spotify.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BusquedaCancionArtista implements Task {

    private String cancionArtista;

    public BusquedaCancionArtista(String cancionArtista) {
        this.cancionArtista = cancionArtista;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(HomeUI.INPUT_SEARCH, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(cancionArtista).into(HomeUI.INPUT_SEARCH),
                WaitUntil.the(HomeUI.TXT_CANCION_ARTISTA(cancionArtista), isVisible()).forNoMoreThan(10).seconds()
        );

    }

    public static BusquedaCancionArtista go(String cancionArtista) {
        return instrumented(BusquedaCancionArtista.class, cancionArtista);
    }
}

