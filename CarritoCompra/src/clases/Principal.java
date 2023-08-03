
package clases;

public class Principal {
    public static void main(String[] args){
        Bebida bebida1 = new Bebida("Pepsi", "Pepsi", 1.5);
        System.out.println(bebida1.getNmbre()+ "de la marca" + bebida1.getMarca()+ "de la capacidad de: " +bebida1.getCapacidad() + "litros");
        
        Comida comida1 = new Comida("Lomito con papas", 3);
         System.out.println("La comida es " + comida1.getNombre() + " 3 unidades " + comida1.getCantidad());
         
       
    }
}
