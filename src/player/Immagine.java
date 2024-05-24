package player;

import interfaces.Luminosità;
import interfaces.Show;

public class Immagine extends Multimediale implements Show, Luminosità {
    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public void show() {

    }

    @Override
    public void aumentaLuminosità() {

    }

    @Override
    public void diminuisciLuminosità() {

    }
}
