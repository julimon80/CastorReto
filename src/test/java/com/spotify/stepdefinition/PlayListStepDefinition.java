package com.spotify.stepdefinition;


import com.spotify.questions.Top50Question;
import com.spotify.tasks.CredencialesCorrectasTask;
import com.spotify.tasks.GoInicioSesionTask;
import com.spotify.tasks.GoTop50;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PlayListStepDefinition {

    @Cuando("que estoy logueado")
    public void queEstoyLogueado() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoInicioSesionTask.go(),
                CredencialesCorrectasTask.go()
        );
    }

    @Y("navego a “Explorar → Top listas”.")
    public void navegoAExplorarTopListas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoTop50.go()
        );

    }

    @Entonces("debería visualizar playlists públicas como “Top 50 – Global”.")
    public void deberiaVisualizarPlaylistsPublicasComoTopGlobal() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Top50Question.visible(), equalTo(true))
        );
    }
}