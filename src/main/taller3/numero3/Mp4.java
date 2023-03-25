package main.taller3.numero3;

public class Mp4 extends FormatoVideo{

    public Mp4(String creador, String tipoDeVideo) {
        super(creador, tipoDeVideo);
    }
    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo el audio....");
    }
}
