package com.spotify.stepdefinition;


import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class NavegarStepDefinition {

    @Dado("que estoy en la página principal de Spotify Web.")
    public void queEstoyEnLaPaginaPrincipalDeSpotifyWeb() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Task.where("{0} abre la pagina de Spotify Web",
                        actor -> BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver().get("https://open.spotify.com/intl-es")
                )
        );
    }
}