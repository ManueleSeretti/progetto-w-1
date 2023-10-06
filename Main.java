import Multimedia.Audio;
import Multimedia.Immagine;
import Multimedia.Multimedia;
import Multimedia.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multimedia[] myArray = new Multimedia[5];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("inserisci il tipo di elemento da creare: ");
            System.out.println("1-IMMAGINE ");
            System.out.println("2-AUDIO ");
            System.out.println("3-VIDEO ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1: {
                    System.out.println("inserisci il titolo dell'immagine");
                    String titolo = input.nextLine();
                    System.out.println("inserisci la luminosita dell'immagine");
                    int lum = Integer.parseInt(input.nextLine());
                    myArray[i] = new Immagine(titolo, lum);
                    System.out.println("Elemento creato : " + myArray[i]);
                    System.out.println("                         ");
                    break;
                }
                case 2: {
                    System.out.println("inserisci il titolo dell'audio");
                    String titolo = input.nextLine();
                    System.out.println("inserisci la durata dell'audio");
                    int dur = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci il volume dell'audio");
                    int vol = Integer.parseInt(input.nextLine());
                    myArray[i] = new Audio(titolo, dur, vol);
                    System.out.println("Elemento creato : " + myArray[i]);
                    System.out.println("                         ");
                    break;
                }
                case 3: {
                    System.out.println("inserisci il titolo del video");
                    String titolo = input.nextLine();
                    System.out.println("inserisci la durata del video");
                    int dur = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci il volume del video");
                    int vol = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci la luminosità del video");
                    int lum = Integer.parseInt(input.nextLine());
                    myArray[i] = new Video(titolo, dur, vol, lum);
                    System.out.println("Elemento creato : " + myArray[i]);
                    System.out.println("                         ");
                    break;
                }
                default: {
                    System.out.println("hai inserito un valore errato ....");
                    i--;
                    break;
                }


            }

        }
        while (true) {
            System.out.println("ELENCO DEGLI ELEMENTI CREATI:");
            for (int i = 0; i < myArray.length; i++) {
                int c = i + 1;
                System.out.println(i + " - " + myArray[i]);

            }
            System.out.println(" ");
            System.out.println("scegli quale elemento riprodurre... scrivi 0 se vuoi chiudere il programma!");

            int scelta = Integer.parseInt(input.nextLine());

            if (scelta == 0) {
                System.out.println("...FINE...");
                break;
            }
            if (scelta > 5 || scelta < 0) {
                System.out.println("hai inserito un valore non valido...");
                continue;
            }
            scelta--;
            if (myArray[scelta] instanceof Immagine) {
                ((Immagine) myArray[scelta]).show();
            } else if (myArray[scelta] instanceof Audio) {
                ((Audio) myArray[scelta]).play();
            } else if (myArray[scelta] instanceof Video) {
                ((Video) myArray[scelta]).play();
            }

        }
        input.close();
    }
}
