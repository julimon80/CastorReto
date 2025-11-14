package com.spotify.stepdefinition;


import com.spotify.questions.CancionBuscadaQuestion;
import com.spotify.tasks.BusquedaCancionArtista;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class BusquedaCancionesStepDefinition {


    @Cuando("busco el término {}.")
    public void buscoElTermino(String cancionArtista) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BusquedaCancionArtista.go(cancionArtista)
        );
    }

    @Entonces("debería visualizar resultados relacionados con {}.")
    public void deberiaVisualizarResultadosRelacionadosCon(String cancionArtista) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CancionBuscadaQuestion.de(cancionArtista), equalTo(true))
        );
    }
}