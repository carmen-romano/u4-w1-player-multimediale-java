package test;

import ElementiMultimediali.Video;

public class TestVideo {
    public static void main(String[] args) {
        Video video1 = new Video("CiaoVideo", 3, 1, 5);
        video1.play();
        video1.aumentaLuminosità();
        video1.play();
        video1.diminuisciLuminosità();
        video1.play();


    }
}
