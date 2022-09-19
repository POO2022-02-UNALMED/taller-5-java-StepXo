package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    static int ranas;
    static int salamandras;
    private String colorPiel;
    private boolean venenoso;


    Anfibio(String nombre,int edad, String habitat, String genero,String colorPiel,boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
    }
    Anfibio(){
        super(null,0,null,null);
        this.colorPiel=null;
        this.venenoso=false;
    }


    static int cantidadAnfibios(){return listado.size();}

    String movimiento(){return "saltar";}

    static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }
    static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
    }
}
