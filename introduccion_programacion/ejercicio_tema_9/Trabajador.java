public class Trabajador extends Persona {
  private Integer salario;

  public Integer getSalario() {
    return salario;
  }
  public void setSalario(Integer salario) {
    this.salario = salario;
  }

  public static void main(String[] args) {
    Trabajador trabajador = new Trabajador();

    trabajador.setEdad(22);
    trabajador.setNombre("Ezequiel");
    trabajador.setTelefono(1234567890);
    trabajador.setSalario(3000);

    System.out.println("edad: " + trabajador.getEdad());
    System.out.println("nombre: " + trabajador.getNombre());
    System.out.println("telefono: " + trabajador.getTelefono());
    System.out.println("salario: " + trabajador.getSalario());
  }
}
