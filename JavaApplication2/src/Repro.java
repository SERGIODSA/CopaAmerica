import java.io.File;
import javazoom.jlgui.basicplayer.*; 

public class Repro{

    public BasicPlayer player;
    
    public Repro(){
        player = new BasicPlayer();
    }
    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }
    public void Play() throws Exception {
        player.play();
    }
    public void Pausa() throws Exception {
        player.pause();
    }
    public void Continuar() throws Exception {
        player.resume();
    }
    public void Stop() throws Exception {
        player.stop();
    }
    public void escuchar(){
        try {
            Repro reproductor = new Repro();
            reproductor.AbrirFichero("F:/Sistema de Programas/Copa America/JavaApplication2/src/Sonidos/kha.mp3");
            reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

        
    