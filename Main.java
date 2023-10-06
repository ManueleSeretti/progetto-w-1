import Multimedia.Audio;
import Multimedia.Immagine;
import Multimedia.Multimedia;
import Multimedia.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multimedia[] myArrey = new Multimedia[5];

        for (Multimedia elemento : myArrey) {

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
                    elemento = new Immagine(titolo, lum);
                    System.out.println("... elemento creato ... ");
                    break;
                }
                case 2: {
                    System.out.println("inserisci il titolo dell'audio");
                    String titolo = input.nextLine();
                    System.out.println("inserisci la durata dell'audio");
                    int dur = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci il volume dell'audio");
                    int vol = Integer.parseInt(input.nextLine());
                    elemento = new Audio(titolo, dur, vol);
                    System.out.println("... elemento creato ... ");
                    break;
                }
                case 3: {
                    System.out.println("inserisci il titolo del video");
                    String titolo = input.nextLine();
                    System.out.println("inserisci la durata del video");
                    int dur = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci il volume del video");
                    int vol = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci il volume del video");
                    int lum = Integer.parseInt(input.nextLine());
                    elemento = new Video(titolo, dur, vol, lum);
                    System.out.println("... elemento creato ... ");
                    break;
                }


            }

        }


    }
}
