package test;

import player.Immagine;

public class TestImg {
    public static void main(String[] args) {
        Immagine img = new Immagine("Img prova1", 3);
        img.show();
        img.aumentaLuminosità();
        img.show();
        img.diminuisciLuminosità();
        img.show();


    }
}
