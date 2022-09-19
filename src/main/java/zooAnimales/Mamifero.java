package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList <Mamifero> listado = new ArrayList<Mamifero>();
    static int caballos;
    static int leones;
    private boolean pelaje;
    private int patas;


    Mamifero() {
        super(null, 0, null, null);
        this.pelaje=false;
        this.patas=0;
    }

    Mamifero(String nombre,int edad, String habitat, String genero,boolean pelaje,int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
    }


    static int cantidadMamiferos(){return listado.size();}

    static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(nombre,edad,"pradera",genero,true,4);
    }
    static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        return new Mamifero(nombre,edad,"selva",genero,true,4);
    }
}
