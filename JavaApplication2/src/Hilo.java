import javax.swing.JProgressBar;

public class Hilo extends Thread {
    JProgressBar progreso;

    public Hilo(JProgressBar progreso1){       
        super();
        this.progreso=progreso1;
    }
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            pausa(50);      
        }
    }
    public void pausa(int mlSeg){
        try{
            // pausa para el splash
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}