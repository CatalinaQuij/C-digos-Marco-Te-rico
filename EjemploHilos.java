package ejemplohilos;

public class EjemploHilos extends Thread {
    public EjemploHilos(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Este es el thread: " + getName());
        }
    }
    
    public static void main(String[] args) {
        EjemploHilos miThread = new EjemploHilos("Hilo de Prueba");
        miThread.start(); // Inicia el hilo
    }    
}
