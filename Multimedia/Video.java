package Multimedia;

public class Video extends Multimedia implements Volume, Play, Luminosità {
    private int volume;
    private int luminosità;
    private int durata;


    public Video(String nome, int dur, int vol, int lum) {
        this.titolo = nome;
        this.durata = dur;
        this.volume = vol;
        this.luminosità = lum;
    }

    @Override
    public void moreLuminosità() {
        this.luminosità++;
    }

    @Override
    public void lessLuminosità() {
        this.luminosità--;
    }

    @Override
    public void play() {
        String punti = "";
        String asterisco = "";
        for (int i = 0; i < this.luminosità; i++) {
            asterisco = asterisco + "*";
        }
        for (int i = 0; i < this.volume; i++) {
            punti = punti + "!";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo + punti + asterisco);
        }

    }

    @Override
    public void moreVolume() {
        this.volume++;
    }

    @Override
    public void lessVolume() {
        this.volume--;

    }
}
