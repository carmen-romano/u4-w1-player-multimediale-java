package ElementiMultimediali;

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


    @Override
    public void play() {
        for (int i = 0; i < durataAudio; i++) {
            System.out.println("Play audio: " + this.titolo + " " + "!".repeat(volumeAudio));

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
