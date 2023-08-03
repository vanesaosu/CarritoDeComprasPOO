
package clases;


public class Bebida {
    private String nombre="";
    private String marca="";
    private double capacidad=0;

    public Bebida(String nombre , String marca , double capacidad) {
        this.nombre=nombre;
        this.marca=marca;
        this.capacidad=capacidad;
        
    }

    public String getNmbre() {
        return nombre;
    }

    public void setNmbre(String nmbre) {
        this.nombre = nmbre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    

    
    
    
    
    
    
    
}
