package player;

import interfaces.Luminosità;
import interfaces.Play;
import interfaces.Volume;

public class Video extends Multimediale implements Play, Volume, Luminosità {

    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {

    }

    @Override
    public int durata() {
        return 0;
    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void aumentaLuminosità() {

    }

    @Override
    public void diminuisciLuminosità() {

    }
}
