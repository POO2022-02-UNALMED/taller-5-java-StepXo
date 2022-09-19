package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    static int halcones;
    static int aguilas;
    private String colorPlumas;


    Ave(){
        super(null, 0, null, null);
        this.colorPlumas=null;
    }
    Ave(String nombre,int edad, String habitat, String genero,String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }


    static int cantidadAves(){return listado.size();}

    String movimiento(){return "volar";}

    static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
    }
    static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
    }
}
