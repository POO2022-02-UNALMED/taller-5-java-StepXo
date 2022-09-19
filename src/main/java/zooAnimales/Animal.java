package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;



    Animal(){Animal.totalAnimales++;}
    Animal(String nombre, int edad, String habitat, String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        Animal.totalAnimales++;
    }


    String movimiento(){return "desplazarse";}

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() +
                "\nAves: " + Ave.cantidadAves() +
                "\nReptiles: " + Reptil.cantidadReptiles() +
                "\nPeces: " + Pez.cantidadPeces() +
                "\nAnfibios: " + Anfibio.cantidadAnfibios();
    }

    public String toString() {
        if (this.zona != null) {
            return "Mi nombre es " + this.nombre +
                    ", tengo una edad de " + this.edad +
                    ", habito en " + this.habitat +
                    " y mi genero es " + this.genero +
                    ", la zona en la que me ubico es " + this.zona.getNombre() +
                    ", en el " + this.zona.getZoo().getNombre();
        } else {
            return "Mi nombre es " + this.nombre +
                    ", tengo una edad de " + this.edad +
                    ", habito en " + this.habitat +
                    " y mi genero es " + this.genero;
        }
    }
}
