package introduccion_programacion.ejercicio_tema_8;

public class Persona {
  private Integer edad;
  private String nombre;
  private Integer telefono;

  public Integer getEdad() {
    return edad;
  }
  public void setEdad(Integer edad) {
    this.edad = edad;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Integer getTelefono() {
    return telefono;
  }
  public void setTelefono(Integer telefono) {
    this.telefono = telefono;
  }

  public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setEdad(22);
    persona.setNombre("Ezequiel");
    persona.setTelefono(1234567890);

    System.out.println("edad: " + persona.getEdad());
    System.out.println("nombre: " + persona.getNombre());
    System.out.println("telefono: " + persona.getTelefono());
  }
}