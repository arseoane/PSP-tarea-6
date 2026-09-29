public class Profesor2 implements Runnable {
    private String nombre;
    private int limite;
    private int nivel = 0;

    public Profesor2(String nombre, int limite) {
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
        Profesor2 profe = new Profesor2("Manuel", 3);
        Profesor2 profe2 = new Profesor2("Juan", 3);
        profe.run();
        profe2.run();
    }
}