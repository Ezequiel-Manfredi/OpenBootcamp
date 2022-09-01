package introduccion_programacion.ejercicio_tema_3;

public class Coche {
  public Integer puertas = 0;

  public void incrementarPuerta() {
    puertas += 1;
  }

  public static void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.incrementarPuerta();
    System.out.println("cantidad de puertas: " + miCoche.puertas);
  }
}
