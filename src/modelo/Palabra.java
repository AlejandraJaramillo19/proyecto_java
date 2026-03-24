package modelo;

public class Palabra {
    public String espanol;
    public String tikuna;
    //public String tipo;
    public String imagen;
    public String audio_en;
    public String categoria;

    public Palabra(String espanol, String tikuna, String imagen, String audio_en, String categoria) {
        this.espanol = espanol;
        this.tikuna = tikuna;
        this.imagen = imagen;
        this.audio_en = audio_en;
        this.categoria = categoria;
    }
}


