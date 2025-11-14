package com.spotify.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target INPUT_USERNAME = Target.the("INPUT USERNAME")
            .locatedBy("//input[@id='username']");

    public static final Target BTN_CONTINUAR = Target.the("BTN CONTINUAR")
            .locatedBy("//span[contains(.,'Continuar')]");

    public static final Target TXT_INVALID_CREDENCIALES = Target.the("TXT INVALID CREDENCIALES")
            .locatedBy("//input[@aria-describedby='username-error']");

    public static final Target BTN_INICIAR_CON_CONTRA = Target.the("BTN_INICIAR_CON_CONTRA")
            .locatedBy("//button[@data-encore-id='buttonTertiary']");

    public static final Target INPUT_PASS = Target.the("INPUT PASS")
            .locatedBy("//input[contains(@id,'password')]");

    public static final Target BTN_INICIAR_SESION = Target.the("BTN INICIAR SESION")
            .locatedBy("//span[contains(.,'Iniciar sesión')]");
}
