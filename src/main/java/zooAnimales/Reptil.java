package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    static int iguanas;
    static int serpientes;
    private String escamas;
    private int largoCola;


    Reptil() {
        super(null, 0, null, null);
        this.escamas=null;
        this.largoCola=0;
    }
    Reptil(String nombre,int edad, String habitat, String genero,String escamas,int largoCola) {
        super(nombre, edad, habitat, genero);
        this.escamas = escamas;
        this.largoCola = largoCola;
        listado.add(this);
    }


    static int cantidadReptiles(){return listado.size();}

    String movimiento(){return "reptar";}

    static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }
    static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }
}
