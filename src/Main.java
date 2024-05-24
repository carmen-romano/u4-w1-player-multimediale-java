//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import interfaces.Play;
import player.Audio;
import player.Immagine;
import player.Multimediale;
import player.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Multimediale[] lettoreMultimediale = new Multimediale[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lettoreMultimediale.length; i++) {
            System.out.println("Scegli il tipo di elemento da creare: 1 = Immagine, 2 = Video, 3 = Audio");
            int sceltaUtente = scanner.nextInt();
            scanner.nextLine();

            switch (sceltaUtente) {
                case 1:
                    System.out.println("Inserisci il titolo dell'immagine:");
                    String titoloImmagine = scanner.nextLine();
                    lettoreMultimediale[i] = new Immagine(titoloImmagine, 5);
                    break;
                case 2:
                    System.out.println("Inserisci il titolo del video:");
                    String titoloVideo = scanner.nextLine();
                    lettoreMultimediale[i] = new Video(titoloVideo, 5, 5, 5);
                    break;
                case 3:
                    System.out.println("Inserisci il titolo dell'audio:");
                    String titoloAudio = scanner.nextLine();
                    lettoreMultimediale[i] = new Audio(titoloAudio, 5, 5);
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci 1, 2 o 3.");

                    break;
            }
        }

        while (true) {
            {
                System.out.println("Inserisci il numero dell'elemento da riprodurre/mostrare (da 1 a 5, 0 per chiudere):");
                int sceltaEsecuzione = scanner.nextInt();

                if (sceltaEsecuzione == 0) {
                    break;
                }

                if (sceltaEsecuzione >= 1 && sceltaEsecuzione <= 5) {

                    if (lettoreMultimediale[sceltaEsecuzione] instanceof Play) {
                        ((Play) lettoreMultimediale[sceltaEsecuzione]).play();
                    } else if (lettoreMultimediale[sceltaEsecuzione] instanceof Immagine) {
                        ((Immagine) lettoreMultimediale[sceltaEsecuzione]).show();
                    }
                } else {
                    System.out.println("Scelta non valida. Inserisci un numero da 1 a 5 o 0 per chiuderes.");
                }
            }
        }

        scanner.close();
    }
}
