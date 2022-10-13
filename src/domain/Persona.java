package domain;

 public class Persona {
    private String nombre;
    private int edad;
    private String telefono;

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public int getEdad() {
         return edad;
     }

     public void setEdad(int edad) {
         this.edad = edad;
     }

     public String getTelefono() {
         return telefono;
     }

     public void setTelefono(String telefono) {
         this.telefono = telefono;
     }

    

 }

 class Cliente extends Persona{
    private int credito;

     public int getCredito() {
         return credito;
     }

     public void setCredito(int credito) {
         this.credito = credito;
     }
 }

 class Trabajador extends Persona{
     private double salario;

     public double getSalario() {
         return salario;
     }

     public void setSalario(double salario) {
         this.salario = salario;
     }
 }
 
 class Ejecutor {
     public static void main(String[] args) {
         Cliente cliente = new Cliente();
         cliente.setNombre("Pablo");
         cliente.setEdad(25);
         cliente.setTelefono("55443322");
         cliente.setCredito(4500);
         System.out.println("cliente = " + cliente.getNombre());
         System.out.println("cliente edad= " + cliente.getEdad());
         System.out.println("cliente telefono= " + cliente.getTelefono());
         System.out.println("cliente credito = " + cliente.getCredito());

         Trabajador trabajador = new Trabajador();
         trabajador.setNombre("Carlos");
         trabajador.setEdad(45);
         trabajador.setTelefono("445577668");
         trabajador.setSalario(250000.55);
         System.out.println("trabajador = " + trabajador.getNombre());
         System.out.println("trabajador edad = " + trabajador.getEdad());
         System.out.println("trabajador telefono = " + trabajador.getTelefono());
         System.out.println("trabajador salario= " + trabajador.getSalario());

     }
 }


