package main.taller3.numero3;

public abstract class FormatoVideo implements Reproductor{

    private String Creador;
    private String tipoDeVideo;

    public FormatoVideo(String creador, String tipoDeVideo) {
        Creador = creador;
        this.tipoDeVideo = tipoDeVideo;
    }

}
