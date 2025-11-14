package com.spotify.stepdefinition;


import com.spotify.questions.CancionAgregadaQuestion;
import com.spotify.tasks.AgregarCancionTask;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class AgregarCancionStepDefinition {

    @Y("quiero agregar una canción a la lista")
    public void quieroAgregarUnaCancionALaLista() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarCancionTask.go()
        );

    }

    @Entonces("deberia ver que la canción se agrego a la lista")
    public void deberiaVerQueLaCancionSeAgregoALaLista() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CancionAgregadaQuestion.visible(), equalTo(true))
        );
    }
}