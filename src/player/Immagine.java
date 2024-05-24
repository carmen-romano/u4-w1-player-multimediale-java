package player;

import interfaces.Luminosità;
import interfaces.Show;

public class Immagine extends Multimediale implements Show, Luminosità {
    private int luminositaImg;

    public Immagine(String titolo) {
        super(titolo);
    }

    public Immagine(String titolo, int luminositaImg) {
        super(titolo);
        this.luminositaImg = luminositaImg;
    }

    @Override
    public void show() {
        System.out.println("Show img: " + this.titolo + " " + "*".repeat(luminositaImg));

    }

    @Override
    public void aumentaLuminosità() {
        if (luminositaImg > 1) {
            luminositaImg++;
        } else {
            System.out.println("La luminosità è al minimo");
        }
    }

    @Override
    public void diminuisciLuminosità() {
        if (luminositaImg < 10) {
            luminositaImg--;
        } else {
            System.out.println("La luminosità è al massimo");
        }
    }
}
