package ElementiMultimediali;

import interfaces.Luminosità;
import interfaces.Play;
import interfaces.Volume;

public class Video extends Multimediale implements Play, Volume, Luminosità {
    private int durataVideo;
    private int volumeVideo;
    private int luminositaVideo;

    public Video(String titolo, int volumeVideo, int durataVideo, int luminositaVideo) {
        super(titolo);
        this.volumeVideo = volumeVideo;
        this.durataVideo = durataVideo;
        this.luminositaVideo = luminositaVideo;
    }

    @Override
    public void play() {
        for (int i = 0; i < durataVideo; i++) {
            System.out.println("Play video: " + this.titolo + " " + "!".repeat(volumeVideo) + " " + "*".repeat(luminositaVideo));

        }
    }


    @Override
    public void abbassaVolume() {
        if (volumeVideo > 1) {
            volumeVideo--;
        } else {
            System.out.println("Il volume è al minimo");
        }

    }

    @Override
    public void alzaVolume() {
        if (volumeVideo < 10) {
            volumeVideo++;
        } else {
            System.out.println("Il volume è al massimo");
        }
    }

    @Override
    public void aumentaLuminosità() {
        if (luminositaVideo > 1) {
            luminositaVideo++;
        } else {
            System.out.println("La luminosità è al minimo");
        }
    }

    @Override
    public void diminuisciLuminosità() {
        if (luminositaVideo < 10) {
            luminositaVideo--;
        } else {
            System.out.println("La luminosità è al massimo");
        }
    }
}
