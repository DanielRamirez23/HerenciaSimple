
package herenciasimple;

/**
 *
 * @author danie
 */
public class Hijo extends Padre {
 private String color;
 private int kilometraje;
 private int velocidades;

    public Hijo(String marca,int cilindraje,String color,
            int kilometraje, int velocidades) {
       super(marca, cilindraje);
        this.color = color;
        this.kilometraje = kilometraje;
        this.velocidades = velocidades;
       
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }
   
}
