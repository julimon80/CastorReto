package com.spotify.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.UUID;

import static com.spotify.utils.Constants.DOMINIO;

public class UserNameAleatorio implements Interaction {

    private String correoGenerado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String identificador = UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 8);

        correoGenerado = "usuario_" + identificador + "@" + DOMINIO;

        actor.remember("email_aleatorio", correoGenerado);

        System.out.println("Correo generado: " + correoGenerado);
    }

    public String getCorreo() {
        return correoGenerado;
    }

    public static UserNameAleatorio now() {
        return new UserNameAleatorio();
    }
}
