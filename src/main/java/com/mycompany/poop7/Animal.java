package com.mycompany.poop7;
/**
 *
 * @author brandon
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }
    /**
     * 
     * @param nombre Recibe una cadena de caracteres que indica el nombre del Animal
     * @param lugarOrigen Recibe un cadena de caracteres que indica el origen del animal
     * @param color Recibe una cadena de caracters que indica el color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        if(lugarOrigen == null){
            this.lugarOrigen = "Desconocido";
        }else{
            this.lugarOrigen = lugarOrigen;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void sonido(){
        System.out.println("El animal genera un sonido, este depende de las caracteristicas vocales de cada animal");
    }

    public void comer(){
        System.out.println("El animal esta comiendo, todos los animales obtienen energia atraves de diferentes alimentos");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
