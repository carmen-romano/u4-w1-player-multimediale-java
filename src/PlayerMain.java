//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import ElementiMultimediali.Audio;
import ElementiMultimediali.Immagine;
import ElementiMultimediali.Multimediale;
import ElementiMultimediali.Video;
import interfaces.Play;

import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {

        Multimediale[] lettoreMultimediale = new Multimediale[5];

        Scanner scanner = new Scanner(System.in);
        ///Scelta utente creazione player
        for (int i = 0; i < lettoreMultimediale.length; i++) {
            System.out.println(i + 1 + "/5 - " + "Scegli il tipo di elemento da creare: 1 = Immagine, 2 = Video, 3 = Audio");
            int sceltaUtente;
            ///Gestione errore nel caso in cui l'utente inserisse un valore non numerico
            if (scanner.hasNextInt()) {
                sceltaUtente = scanner.nextInt();
            } else {
                scanner.nextLine();
                sceltaUtente = -1;
            }
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
                    i--;
                    break;
            }
        }


        while (true) {
            {
                System.out.println("Inserisci il numero dell'elemento da riprodurre/mostrare (da 1 a 5, 0 per chiudere)");
                int sceltaRiproduzione = scanner.nextInt();

                if (sceltaRiproduzione == 0) {
                    break;
                } else if (sceltaRiproduzione >= 1 && sceltaRiproduzione <= 5) {
                    if (lettoreMultimediale[sceltaRiproduzione - 1] instanceof Play) {
                        ((Play) lettoreMultimediale[sceltaRiproduzione - 1]).play();
                    } else if (lettoreMultimediale[sceltaRiproduzione - 1] instanceof Immagine) {
                        ((Immagine) lettoreMultimediale[sceltaRiproduzione - 1]).show();
                    }
                } else {
                    System.out.println("Scelta non valida. Inserisci un numero da 1 a 5 o 0 per chiudere.");
                }

            }
        }

        scanner.close();
    }
}
