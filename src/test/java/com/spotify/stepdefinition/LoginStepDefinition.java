package com.spotify.stepdefinition;


import com.spotify.questions.LoginInvalidoQuestion;
import com.spotify.tasks.GoInicioSesionTask;
import com.spotify.tasks.CredencialesInvalidasTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {


    @Cuando("que estoy en la página de login.")
    public void queEstoyEnLaPaginaDeLogin() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoInicioSesionTask.go()
        );
    }

    @Y("ingreso un correo ficticio y contraseña inválida.")
    public void ingresoUnCorreoFicticioYContrasenaInvalida() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CredencialesInvalidasTask.go()
        );
    }

    @Entonces("debería mostrarse un mensaje de error.")
    public void deberiaMostrarseUnMensajeDeError() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginInvalidoQuestion.visible(), equalTo(true))
        );
    }
}