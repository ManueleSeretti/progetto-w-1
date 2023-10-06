package Multimedia;

public class Audio extends Multimedia implements Volume, Play {
    private int durata;
    private int volume;


    public Audio(String title, int durata, int volume) {
        this.titolo = title;
        this.durata = durata;
        this.volume = volume;

    }

    @Override
    public void play() {
        String punti = "";
        for (int i = 0; i < this.volume; i++) {
            punti = punti + "!";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo + punti);
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
