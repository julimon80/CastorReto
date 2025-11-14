package com.spotify.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {


    public static Target TXT_CANCION_ARTISTA(String cancionArtista) {
        return Target.the("Select " + cancionArtista)
                .located(By.xpath("//a[contains(translate(normalize-space(.),'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚÜÑ','abcdefghijklmnopqrstuvwxyzáéíóúüñ'),'" + cancionArtista + "')]"));
    }

    public static final Target INPUT_SEARCH = Target.the("INPUT SEARCH")
            .locatedBy("//input[contains(@data-testid,'search-input')]");

    public static final Target BTN_LOGIN = Target.the("BTN LOGIN")
            .locatedBy("//button[@data-testid='login-button']");

    public static final Target BTN_EXPLORAR = Target.the("BTN EXPLORAR")
            .locatedBy("(//a[@data-testid='see-all-link' and normalize-space()='Listas seleccionadas']/following::span[@data-encore-id='text' and normalize-space()='Mostrar todos'])");

    public static final Target BTN_TOP50 = Target.the("BTN TOP 50")
            .locatedBy("//p[contains(@title,\"50\")]/parent::*/parent::*/parent::*/parent::*");

    public static final Target TXT_TOP50 = Target.the("TXT TOP 50")
            .locatedBy("//h1[contains(.,'Top 50: Global')]");

    public static final Target BTN_CLOSE = Target.the("BTN CLOSE")
            .locatedBy("//*[@id=\"onetrust-close-btn-container\"]/button");

    public static final Target BTN_CARD = Target.the("BTN CARD")
            .locatedBy("//div[contains(@class,'Card')]");

    public static final Target BTN_ADD_SONG = Target.the("BTN ADD SONG")
            .locatedBy("//button[@data-testid=\"add-button\"]");

    public static final Target TXT_CONFIR_SONG_ADDED = Target.the("TXT CONFIRM SONG ADDED")
            .locatedBy("//button[@data-testid='add-button' and @aria-label='Eliminar de Tu biblioteca']");
}
