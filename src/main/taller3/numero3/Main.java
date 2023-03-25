package main.taller3.numero3;

public class Main {

    public static void main(String[] args) {

        FormatoVideo video1 = new Mp4("Blessd","musica");
        FormatoAudio audio1 = new Mp3(190,5000,"diverso", "dadyyankee", "regueton sucio hasta el piso");
        FormatoAudio audio2 = new Wav(1700,4000,"jbalvin", "Feid", "perreo");

        video1.reproducirAudio();
        audio1.reproducirAudio();
        audio2.reproducirAudio();





    }
}
