package tema7.CuentaCorriente;

//Creamos un objeto CuentaCorriente para probar la clase y realizar algunas operaciones.
public class CuentaCorrienteMain {
  public static void main(String[] args) {
      CuentaCorriente c;
      c = new CuentaCorriente("12345678A", "Pepe"); //Cuenta de Pepe con DNI 12.345.678-A
      c.ingreso(1000); // ingresamos 1000 euros
      c.egress(300); // sacamos 300 euros. Quedarán 700 euros
      c.mostrarInformation(); // mostramos
      System.out.println("Puedo sacar 700 euros: " + c.egress(700)); //quedan 0 euros
      System.out.println("Puedo sacar 500 euros: " + c.egress(500)); //no es posible
  }
}