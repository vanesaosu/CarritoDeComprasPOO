
package clases;


public class Comida {
    private String nombre="";
    private double cantidad=0;

    public Comida(String nombre,  double cantidad) {
        this.nombre=nombre;
        this.cantidad=cantidad;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
