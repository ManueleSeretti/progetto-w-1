package Multimedia;

public class Immagine extends Multimedia implements Luminosità, Show {
    private int luminosità;

    public Immagine(String title, int lum) {
        this.titolo = title;
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
    public void show() {
        String asterisco = "";
        for (int i = 0; i < this.luminosità; i++) {
            asterisco = asterisco + "*";
        }
        System.out.println(this.titolo + asterisco);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "Titolo=" + this.titolo + ", luminosità=" + this.luminosità +
                '}';
    }
}
