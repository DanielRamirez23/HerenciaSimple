
package herenciasimple;

import java.util.Scanner;


public class HerenciaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Padre padre1 = new Padre("Kawasaki",600);
    
     System.out.println(padre1.getMarca());
     
     Hijo hijo1 = new Hijo(
                "Honda",//Marca
                1000,//Cilindraje
                "Azul",//Color
                25000,//kilometraje
                5//velocidades
        
     
     );
    System.out.println(hijo1.getCilindraje());
    Scanner entrada = new Scanner(System.in);
    String marca;
    int cilindraje;
    String color;
    int kilometraje;
    int velocidades;
    
    System.out.println("Ingrese la marca de la motocicleta");
    marca = entrada.next();
    
    System.out.println("Ingrese el cilindraje");
    cilindraje = entrada.nextInt();
    
    System.out.println("Ingrese el color");
    color = entrada.next();
    
    System.out.println("Ingrese el kilometraje");
    kilometraje = entrada.nextInt();
    
    System.out.println("Ingrese el numero de velocidades");
    velocidades = entrada.nextInt();
    
    Hijo hijo_nuevo = new Hijo(
    marca,
    cilindraje,
    color,
    kilometraje,
    velocidades
    );
   
    System.out.println(hijo_nuevo.getMarca());
    
    
    
    
    
    
    
 
    
    }
    
}
