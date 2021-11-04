package com.mycompany.poop7;
/**
 *
 * @author brandon
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena() {
    }

    public Ballena(int aletas) {
        super(aletas);
    }

    public Ballena(String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
    }

    public Ballena(String nombre, String lugarOrigen, String color, int aletas) {
        super(nombre, lugarOrigen, color, aletas);
    }
    public Ballena(String nombre, String lugarOrigen, String color, int aletas, int largo) {
        super(nombre, lugarOrigen, color, aletas);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public void pelearConPinocho(){
        System.out.println("La ballena esta pelenado con pinocho, al final se lo traga");
    }

    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + " metros}";
    }
    
}
