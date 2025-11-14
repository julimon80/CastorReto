package com.spotify.questions;

import com.spotify.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CancionBuscadaQuestion implements Question<Boolean> {

    private final String cancionArtista;

    public CancionBuscadaQuestion(String cancionArtista) {
        this.cancionArtista = cancionArtista;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !HomeUI.TXT_CANCION_ARTISTA(cancionArtista)
                .resolveAllFor(actor).isEmpty();
    }

    public static CancionBuscadaQuestion de(String cancionArtista) {
        return new CancionBuscadaQuestion(cancionArtista);
    }
}
