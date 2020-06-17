package com.sinatra;

import org.junit.Test;

public class LoginSongsBySinatra extends LikeSongParent {

    @Test
    public void loginSongsTest() {
        navegar("https://evening-bastion-49392.herokuapp.com/");
        validarHomePage();
        realizarLoginCorrecto("frank","sinatra");
        validateSongsPage();
        validarmensajeBienvenida("You are now logged in as frank");
        cerrarBrowser();
    }

    @Test
    public void loginLikesSongsTest() {
        navegarSitio("https://evening-bastion-49392.herokuapp.com/");
        validaHomePage();
        navegarListadoCanciones();
        navegarPrimeraCancion();
        likeCancion();
        cerrarBrowser();
    }

}
