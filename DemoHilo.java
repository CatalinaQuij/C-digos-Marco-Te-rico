package ejemplohilos;

public class DemoHilo {
    public static void main(String[] args) {
        new NewThread(); // Creación de un nuevo hilo
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Hilo principal: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupción del hilo principal.");
        }
        System.out.println("Salida del hilo principal.");
    }

    static class NewThread implements Runnable {
        Thread t;

        NewThread() { // Crea el segundo hilo
            t = new Thread(this, "Hilo demo");
            System.out.println("Hilo hijo: " + t);
            t.start(); // Comienza el hilo
        }

        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Hilo hijo: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupción del hilo hijo.");
            }
            System.out.println("Salida del hilo hijo.");
        }
    }
}
