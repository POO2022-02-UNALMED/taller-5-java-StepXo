package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    static int salmones;
    static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;


    Pez(String nombre,int edad, String habitat, String genero,String colorEscamas,int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }
    Pez() {
        super(null, 0, null, null);
        this.colorEscamas=null;
        this.cantidadAletas=0;
    }


    static int cantidadPeces(){return listado.size();}

    String movimiento(){return "nadar";}

    static Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return new Pez(nombre,edad,"oceano",genero,"rojo",6);
    }
    static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        return new Pez(nombre,edad,"oceano",genero,"gris",6);
    }
}
