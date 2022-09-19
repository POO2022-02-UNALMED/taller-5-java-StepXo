package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList <Animal> animales = new ArrayList<Animal>();


    Zona(){}

    Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;
    }

    public Zoologico getZoo() {return zoo;}
    public void setZoo(Zoologico zoo) {this.zoo = zoo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public ArrayList<Animal> getAnimales() {return animales;}
    public void setAnimales(ArrayList<Animal> animales) {this.animales = animales;}


    void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }
    int cantidadAnimales(){
        return this.animales.size();
    }
}