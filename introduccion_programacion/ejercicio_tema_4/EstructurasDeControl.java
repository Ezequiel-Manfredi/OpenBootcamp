package introduccion_programacion.ejercicio_tema_4;

public class EstructurasDeControl {
  public static void main(String[] args) {
    Integer numeroIf = 1;

    if(numeroIf < 0){
      System.out.println("numeroIf negativo");
    } else if(numeroIf > 0) {
      System.out.println("numeroIf positivo");
    } else {
      System.out.println("numeroIf cero");
    }

    Integer numeroWhile = 1;

    while(numeroWhile < 3) {
      numeroWhile += 1;
      System.out.println("numeroWhile: " + numeroWhile);
    }

    Integer numeroDoWhile = 3;

    do {
      numeroDoWhile += 1;
      System.out.println("numeroDoWhile: " + numeroDoWhile);
    } while(numeroDoWhile < 3);

    for(Integer numeroFor = 0; numeroFor <= 3; numeroFor++) {
      numeroFor += 1;
      System.out.println("numeroFor: " + numeroFor);
    }

    String estacion = "invierno";

    switch (estacion) {
      case "verano":
        System.out.println("estacion: verano");
        break;
      case "otoño":
        System.out.println("estacion: otoño");
        break;
      case "invierno":
        System.out.println("estacion: invierno");
        break;
      case "primavera":
        System.out.println("estacion: primavera");
        break;
      default:
        System.out.println("no es estacion");
        break;
    }
  }
}