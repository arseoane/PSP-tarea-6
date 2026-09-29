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

    public static void main(String[] args) {
        Profesor profe = new Profesor("Damián", 3);
        Profesor profe2 = new Profesor("Diego", 3);
        profe.start();
        profe2.start();
    }
}