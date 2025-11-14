package com.spotify.questions;


import com.spotify.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginInvalidoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.TXT_INVALID_CREDENCIALES.resolveFor(actor).isVisible();

    }

    public static LoginInvalidoQuestion visible() {
        return new LoginInvalidoQuestion();
    }
}
