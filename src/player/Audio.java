package player;

import interfaces.Play;
import interfaces.Volume;

public class Audio extends Multimediale implements Play, Volume {
    private int durataAudio;
    private int volumeAudio;

    public Audio(String titolo, int volumeAudio, int durataAudio) {
        super(titolo);
        this.volumeAudio = volumeAudio;
        this.durataAudio = durataAudio;
    }

    public Audio(String titolo) {
        super(titolo);
    }

    public int getDurataAudio() {
        return durataAudio;
    }

    public void setDurataAudio(int durataAudio) {
        this.durataAudio = durataAudio;
    }

    public int getVolumeAudio() {
        return volumeAudio;
    }

    public void setVolumeAudio(int volumeAudio) {
        this.volumeAudio = volumeAudio;

    }


    @Override
    public void play() {
        for (int i = 0; i < durataAudio; i++) {
            System.out.println("Titolo audio: " + this.titolo + " " + "!".repeat(volumeAudio));
            
        }
    }


    @Override
    public void abbassaVolume() {
        if (volumeAudio > 1) {
            volumeAudio--;
        } else {
            System.out.println("Il volume è al minimo");
        }

    }

    @Override
    public void alzaVolume() {
        if (volumeAudio < 10) {
            volumeAudio++;
        } else {
            System.out.println("Il volume è al massimo");
        }
    }
}
