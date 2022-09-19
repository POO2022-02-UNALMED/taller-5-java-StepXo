package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;


    public Reptil(String nombre,int edad, String habitat, String genero,String colorEscamas,int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    public Reptil() {
        super(null, 0, null, null);
        this.colorEscamas=null;
        this.largoCola=0;
        listado.add(this);
    }


    public static int cantidadReptiles(){return listado.size();}

    @Override
    public String movimiento(){return "reptar";}

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }

    //getters y setters
    public String getColorEscamas() {return colorEscamas;}
    public void setColorEscamas(String colorEscamas) {this.colorEscamas = colorEscamas;}

    public int getLargoCola() {return largoCola;}
    public void setLargoCola(int largoCola) {this.largoCola = largoCola;}
}
