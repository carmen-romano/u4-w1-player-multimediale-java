package player;

import interfaces.Play;
import interfaces.Volume;

public class Audio extends Multimediale implements Play, Volume {

    public Audio(String titolo) {
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
}
