package com.mycompany.poop7;
/**
 *
 * @author Brandon
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena() {
    }
    /**
     * 
     * @param aletas Recibe un numero entero que indica el numero de aletas de un animal acuatico
     */
    public Ballena(int aletas) {
        super(aletas);
    }
    
    /**
     * 
     * @param nombre Recibe una cadena de caracteres que indica el nombre del Animal
     * @param lugarOrigen Recibe un cadena de caracteres que indica el origen del animal
     * @param color Recibe una cadena de caracters que indica el color del animal
     */
    public Ballena(String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
    }
    /**
     * 
     * @param nombre Recibe una cadena de caracteres que indica el nombre del Animal
     * @param lugarOrigen Recibe un cadena de caracteres que indica el origen del animal
     * @param color Recibe una cadena de caracters que indica el color del animal
     * @param aletas Recibe un numero entero que indica el numero de aletas de un animal acuatico
     */
    public Ballena(String nombre, String lugarOrigen, String color, int aletas) {
        super(nombre, lugarOrigen, color, aletas);
    }
    /**
     * 
     * @param nombre Recibe una cadena de caracteres que indica el nombre del Animal
     * @param lugarOrigen Recibe un cadena de caracteres que indica el origen del animal
     * @param color Recibe una cadena de caracters que indica el color del animal
     * @param aletas Recibe un numero entero que indica el numero de aletas de un animal acuatico
     * @param largo Recibe la cantidad de metros de largo de la ballena
     */
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
