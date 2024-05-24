package test;

import ElementiMultimediali.Audio;

public class TestAudio {
    public static void main(String[] args) {
        Audio audio1 = new Audio("Ciao", 3, 5);
        audio1.play();
        audio1.abbassaVolume();
        audio1.play();
        audio1.abbassaVolume();
        audio1.play();
        audio1.abbassaVolume();
        audio1.play();
        audio1.alzaVolume();
        audio1.play();
        audio1.alzaVolume();
        audio1.play();
    }
}
