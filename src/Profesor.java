public class Profesor extends Thread {
    private String nombre;
    private int limite;
    private int nivel = 0;

    public Profesor(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {
        while (nivel < limite) {
            nivel++;
            if (nivel < limite) {
                System.out.println("[" + nombre + "] Cabreo nivel: " + nivel);
            } else {
                System.out.println("[" + nombre + "] Cabreo nivel: " + nivel + "... ¡He llegado a mi límite!");
            }
        }
    }

}