package com.mycompany.poop7;
/**
 *
 * @author brandon
 */
public class AnimalAcuatico extends Animal{
    private int aletas;

    public AnimalAcuatico() {
    }
    /**
     * 
     * @param aletas Recibe un numero entero que indica el numero de aletas de un animal acuatico
     */
    public AnimalAcuatico(int aletas) {
        this.aletas = aletas;
    }
    /**
     * 
     * @param nombre Recibe una cadena de caracteres que indica el nombre del Animal
     * @param lugarOrigen Recibe un cadena de caracteres que indica el origen del animal
     * @param color Recibe una cadena de caracters que indica el color del animal
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
    }
    /**
     * 
     * @param nombre Recibe una cadena de caracteres que indica el nombre del Animal
     * @param lugarOrigen Recibe un cadena de caracteres que indica el origen del animal
     * @param color Recibe una cadena de caracters que indica el color del animal
     * @param aletas Recibe un numero entero que indica el numero de aletas de un animal acuatico
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int aletas) {
        super(nombre, lugarOrigen, color);
        this.aletas = aletas;
    }
    
    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        if(aletas > 0){
            this.aletas = aletas;
        }
        else{
            this.aletas = 0;
        }
    }
    
    public void nadar(){
        System.out.println("El animal acuatico esta nadando");
    }
    
    @Override
    public void comer(){
        System.out.println("El animal acuatico esta comiendo para obtener nutrientes que le permitan sobrevivir");
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "aletas=" + aletas + '}';
    }
    
}
