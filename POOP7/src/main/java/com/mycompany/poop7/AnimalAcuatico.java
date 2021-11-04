package com.mycompany.poop7;
/**
 *
 * @author brandon
 */
public class AnimalAcuatico extends Animal{
    private int aletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int aletas) {
        this.aletas = aletas;
    }

    public AnimalAcuatico(String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
    }

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
