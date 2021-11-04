/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author Barragan
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    
    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    public void volar(){
        System.out.println("El animal ha despegado y ahora vuela hacia el norte.");
    }
    
    @Override
    public void comer(){
        System.out.println("El animal aereo come semillas y gusanos.");
    }

    @Override
    public String toString() {
        return super.toString()+ " " +
                "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
    
}
