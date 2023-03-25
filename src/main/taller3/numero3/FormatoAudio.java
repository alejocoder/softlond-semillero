package main.taller3.numero3;

public abstract class FormatoAudio implements Reproductor{

    private int duracion;
    private int tamanio;
    private String artista, commpositor, generoMusical;

    public FormatoAudio(int duracion, int tamanio, String artista, String commpositor, String generoMusical) {
        this.duracion = duracion;
        this.tamanio = tamanio;
        this.artista = artista;
        this.commpositor = commpositor;
        this.generoMusical = generoMusical;
    }
}