public class Cliente extends Persona {
  private Integer credito;

  public Integer getCredito() {
    return credito;
  }
  public void setCredito(Integer credito) {
    this.credito = credito;
  }

  public static void main(String[] args) {
    Cliente cliente = new Cliente();

    cliente.setEdad(22);
    cliente.setNombre("Ezequiel");
    cliente.setTelefono(1234567890);
    cliente.setCredito(3000);

    System.out.println("edad: " + cliente.getEdad());
    System.out.println("nombre: " + cliente.getNombre());
    System.out.println("telefono: " + cliente.getTelefono());
    System.out.println("credito: " + cliente.getCredito());
  }
}
